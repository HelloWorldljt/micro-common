package com.xs.micro.common.middleware.parser;

import com.xs.micro.common.middleware.annotation.BizKey;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.reflect.FieldUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * {@link BizKey}标记值获取工具类。
 *
 * @author chenrg
 * @date 2019/3/26
 */
public final class BizKeyParser {


    /**
     * 从方法参数中获取本次调用的业务流水号。优先查找方法参数中标记的{@link BizKey}注解，如果找不到，再从方法参数值的属性中查找
     *
     * @param paramAnnotations 方法参数所有注解列表，通过method.getParameterAnnotations()获取
     * @param args             方法的所有参数列表，通过ProceedingJoinPoint.args()获取，一般在aop拦截中使用
     * @return
     */
    public static String parse(Annotation[][] paramAnnotations, Object[] args) {
        Object bizKey = getBizKeyFromMethodParameters(paramAnnotations, args);
        if (bizKey == null) {
            bizKey = getBizKeyFromParameterFields(args);
        }
        return bizKey != null ? String.valueOf(bizKey) : null;
    }

    /**
     * 从参数实体类属性中找出被{@link BizKey}标记的属性值。返回第一个标记{@link BizKey}注解的属性值。
     *
     * @param args
     * @return
     */
    private static Object getBizKeyFromParameterFields(Object[] args) {
        if (ArrayUtils.isEmpty(args)) {
            return null;
        }
        Object bizKey = null;
        BizKey annotation = null;
        int index = 0;
        tag:
        for (; index < args.length; index++) {
            Object param = args[index];
            Class<?> paramClass = param.getClass();
            if (paramClass.isPrimitive()) {
                return null;
            }
            if (paramClass.isArray()) {
                return null;
            }
            Field[] fields = paramClass.getDeclaredFields();
            if (ArrayUtils.isEmpty(fields)) {
                return null;
            }
            for (Field field : fields) {
                Annotation[] fieldAnns = field.getDeclaredAnnotations();
                annotation = findBizKeyAnnotation(fieldAnns);
                if (annotation != null) {
                    try {
                        bizKey = FieldUtils.readField(field, param, true);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    break tag;
                }
            }
        }

        checkBizKey(annotation, bizKey);

        return bizKey;
    }

    /**
     * 从参数列表中获取被标记为{@link BizKey} 注解的参数值。返回第一个标记{@link BizKey}注解的参数值。
     *
     * @param paramAnnotations
     * @param args
     * @return
     */
    private static Object getBizKeyFromMethodParameters(Annotation[][] paramAnnotations, Object[] args) {
        if (ArrayUtils.isEmpty(paramAnnotations)) {
            return null;
        }
        Object bizKey = null;
        BizKey annotation = null;
        int index = 0;
        for (; index < paramAnnotations.length; index++) {
            Annotation[] anns = paramAnnotations[index];
            annotation = findBizKeyAnnotation(anns);
            if (annotation != null) {
                bizKey = args[index];
                break;
            }
        }

        checkBizKey(annotation, bizKey);

        return bizKey;
    }

    /**
     * 在注解列表中查找{@link BizKey}
     *
     * @param anns
     * @return
     */
    private static BizKey findBizKeyAnnotation(Annotation[] anns) {
        if (ArrayUtils.isEmpty(anns)) {
            return null;
        }
        for (Annotation anno : anns) {
            if (anno instanceof BizKey) {
                return (BizKey) anno;
            }
        }
        return null;
    }

    /**
     * 校验bizKey值是否必输
     *
     * @param annotation
     * @param bizKey
     */
    private static void checkBizKey(BizKey annotation, Object bizKey) {
        if (annotation == null) {
            return;
        }
        if (annotation.required() && bizKey == null) {
            throw new RuntimeException("The BizKey required value not be null.");
        }
    }
}

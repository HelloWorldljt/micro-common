package com.xs.micro.common.middleware.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标记某方法参数或参数实体中字段，该注解可用于标记以下字段。两种标记字段可使用同一个值，也可分别指定，请视具体情况而定。<br/>
 * 1. 在幂等性中间件中，标记唯一业务key，保证同一笔业务在同一时刻只被调用一次；<br/>
 * 2. 在最终一致性、tcc中间件中，标记一笔业务流水号；用于追踪业务方法执行状态；<br/>
 * <p>
 * 注：不支持从泛型实体中读取该标记指定的属性值。尽量选择在方法参数上直接标记或在方法参数为普通实体中标记某个属性。
 *
 * @author chenrg
 * @date 2019/5/13
 */
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface BizKey {

    /**
     * 是否必须，默认为true
     *
     * @return
     */
    public boolean required() default true;

}

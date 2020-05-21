package com.xs.micro.common.middleware.entity;

import java.io.Serializable;

/**
 * 方法调用实体，用于反射调用
 *
 * @author chenrg
 * @date 2019/3/7
 */
public class MethodInvocation implements Serializable {

    private static final long serialVersionUID = -3205348554946849667L;

    /**
     * 方法所属实例类名
     */
    private Class target;

    /**
     * 方法名称
     */
    private String method;

    /**
     * 方法参数列表
     */
    private Class<?>[] parameterTypes;

    /**
     * 方法参数值列表，与参数列表位置对应
     */
    private Object[] args;

    /**
     * 返回值
     */
    private Object returnValue;

    /**
     * 返回值类型
     */
    private Class<?> returnType;

    public MethodInvocation() {
    }

    public MethodInvocation(Class target, String method, Class<?>[] parameterTypes, Object[] args) {
        this.target = target;
        this.method = method;
        this.parameterTypes = parameterTypes;
        this.args = args;
    }

    public MethodInvocation(Class target, String method, Class<?>[] parameterTypes, Object[] args, Object returnValue, Class<?> returnType) {
        this.target = target;
        this.method = method;
        this.parameterTypes = parameterTypes;
        this.args = args;
        this.returnValue = returnValue;
        this.returnType = returnType;
    }

    public Class getTarget() {
        return target;
    }

    public void setTarget(Class target) {
        this.target = target;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Class<?>[] getParameterTypes() {
        return parameterTypes;
    }

    public void setParameterTypes(Class<?>[] parameterTypes) {
        this.parameterTypes = parameterTypes;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    public Object getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(Object returnValue) {
        this.returnValue = returnValue;
    }

    public Class<?> getReturnType() {
        return returnType;
    }

    public void setReturnType(Class<?> returnType) {
        this.returnType = returnType;
    }
}

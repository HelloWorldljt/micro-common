package com.xs.micro.common.idempotent;

/**
 * 业务幂等KEY
 * @author tanyuanpeng
 * @Date 2019/5/9 16:07
 **/
public final class IdempotentKey {

    private final static String SEPARATOR = "_";

    /**
     * 幂等业务类型
     */
    private IdempotentBizType bizType;

    /**
     * 业务KEY
     */
    private String bizKey;

    public IdempotentKey() {}

    /**
     * 获取幂等KEY
     * @return
     */
    public String generateIdempotentKey(){
        return bizType.getValue()+SEPARATOR+this.bizKey;
    }

    public IdempotentBizType getBizType() {
        return bizType;
    }

    public void setBizType(IdempotentBizType bizType) {
        this.bizType = bizType;
    }

    public String getBizKey() {
        return bizKey;
    }

    public void setBizKey(String bizKey) {
        this.bizKey = bizKey;
    }

    @Override
    public String toString() {
        return this.generateIdempotentKey();
    }
}

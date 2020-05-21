package com.xs.micro.common.idempotent;

/**
 * 幂等KEY生成器
 * @author tanyuanpeng
 * @Date 2019/5/9 16:35
 **/
public final class IdempotentKeyBuilder {

    private IdempotentBizType bizType;
    private String bizKey;

    private IdempotentKeyBuilder() {
    }

    public static IdempotentKeyBuilder builder() {
        return new IdempotentKeyBuilder();
    }

    public IdempotentKeyBuilder withBizType(IdempotentBizType bizType) {
        this.bizType = bizType;
        return this;
    }

    public IdempotentKeyBuilder withBizKey(String bizKey) {
        this.bizKey = bizKey;
        return this;
    }

    public IdempotentKey build() {
        IdempotentKey idempotentKey = new IdempotentKey();
        idempotentKey.setBizType(bizType);
        idempotentKey.setBizKey(bizKey);
        return idempotentKey;
    }
}

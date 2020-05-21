package com.xs.micro.common.rocketmq.pojo.portal.member;

import java.math.BigDecimal;

/**
 * 任务奖励消息
 *
 */
public class TaskRewardMessage {
    /**
     * 用户编号
     */
    private Integer userId;
    /**
     * 订单编号
     */
    private Integer orderId;
    /**
     * 订单金额
     */
    private BigDecimal amount;
    /**
     * 理财产品类型
     */
    private String goodsType;
    /**
     * 产品是否是固定期限(产品期限与基础锁定期一致)
     */
    private Boolean fixedPeriod;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public Boolean getFixedPeriod() {
        return fixedPeriod;
    }

    public void setFixedPeriod(Boolean fixedPeriod) {
        this.fixedPeriod = fixedPeriod;
    }
}

package com.xs.micro.common.rocketmq.pojo.portal;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单合并消息
 * @author FeiFei.Huang
 * @date 2020年03月31日
 */
public class OrderMergeForMatchMessage implements Serializable {

    private static final long serialVersionUID = 265845711979377585L;
    /**
     * 子订单号
     */
    private String subBusOrderNo;
    /**
     * 父订单号
     */
    private String parentBusOrderNo;
    /**
     * 用户编号
     */
    private Integer userId;
    /**
     * 订单购买金额
     */
    private BigDecimal amount;
    /**
     * 匹配金额
     */
    private BigDecimal matchAmount;

    public String getSubBusOrderNo() {
        return subBusOrderNo;
    }

    public void setSubBusOrderNo(String subBusOrderNo) {
        this.subBusOrderNo = subBusOrderNo;
    }

    public String getParentBusOrderNo() {
        return parentBusOrderNo;
    }

    public void setParentBusOrderNo(String parentBusOrderNo) {
        this.parentBusOrderNo = parentBusOrderNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getMatchAmount() {
        return matchAmount;
    }

    public void setMatchAmount(BigDecimal matchAmount) {
        this.matchAmount = matchAmount;
    }

    @Override
    public String toString() {
        return "OrderMergeForMatchMessage{" +
                "subBusOrderNo='" + subBusOrderNo + '\'' +
                ", parentBusOrderNo='" + parentBusOrderNo + '\'' +
                ", userId=" + userId +
                ", amount=" + amount +
                ", matchAmount=" + matchAmount +
                '}';
    }
}

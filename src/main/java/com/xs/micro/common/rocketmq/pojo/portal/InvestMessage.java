package com.xs.micro.common.rocketmq.pojo.portal;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 投资消息
 *
 * @author chenrg
 * @date 2019/4/24
 */
public class InvestMessage implements Serializable {

    private static final long serialVersionUID = -119190542136519071L;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 订单ID
     */
    private Integer orderId;

    /**
     * 订单金额
     */
    private String amount;

    /**
     * 订单产品类型
     */
    private String goodsType;

    /**
     * 订单号
     */
    private String busOrderNo;

    /**
     * 锁定期
     */
    private Integer lockPeriod;

    /**
     * 购买时间
     */
    private Date buyTime;

    /**
     * 订单来源
     */
    private String frameworkSource;

    /**
     * 客户端类型（城市版，乡村版）
     */
    private String clientType;

    /**
     * 购买产品名称
     */
    private String productName;

    /**
     * 产品ID
     */
    private Integer productId;

    /**
     * 产品利率
     */
    private BigDecimal interest;

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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getBusOrderNo() {
        return busOrderNo;
    }

    public void setBusOrderNo(String busOrderNo) {
        this.busOrderNo = busOrderNo;
    }

    public Integer getLockPeriod() {
        return lockPeriod;
    }

    public void setLockPeriod(Integer lockPeriod) {
        this.lockPeriod = lockPeriod;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public String getFrameworkSource() {
        return frameworkSource;
    }

    public void setFrameworkSource(String frameworkSource) {
        this.frameworkSource = frameworkSource;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }
}

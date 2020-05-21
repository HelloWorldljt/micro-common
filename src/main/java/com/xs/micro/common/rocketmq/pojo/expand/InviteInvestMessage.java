package com.xs.micro.common.rocketmq.pojo.expand;

import com.xs.micro.common.rocketmq.pojo.portal.InvestMessage;

import java.io.Serializable;
import java.util.Date;

/**
 * 被邀请人投资消息，由micro-expand发布的
 *
 * @author chenrg
 * Created at 2019/7/2 14:43
 **/
public class InviteInvestMessage implements Serializable {

    private static final long serialVersionUID = 1792712792437519718L;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 被邀请人ID
     */
    private Integer invitedUserId;

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
     * 产品名称
     */
    private String productName;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getInvitedUserId() {
        return invitedUserId;
    }

    public void setInvitedUserId(Integer invitedUserId) {
        this.invitedUserId = invitedUserId;
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
}

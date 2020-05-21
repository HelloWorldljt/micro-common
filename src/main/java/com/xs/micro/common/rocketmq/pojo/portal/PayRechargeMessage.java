package com.xs.micro.common.rocketmq.pojo.portal;

import java.math.BigDecimal;
import java.util.Date;

/**
 * pay充值消息
 * @author duanz
 * @date 2019-11-19
 */
public class PayRechargeMessage {
    private Integer userId;
    private String busOrderNo;
    private BigDecimal amount;
    private BigDecimal fee;
    private Integer status;
    private Date createTime;
    private Date updateTime;
    /**
     * 渠道id，非快捷为null
     */
    private Integer payChannelId;
    /**
     * 渠道类型 1，快捷，2代扣，3挂账，4直接转账
     */
    private Integer payChannelType;
    /**
     * 跟portal 一致
     */
    private String frameworkSource;
    /**
     * 1理财人
     * 2借款人
     * 3担保户
     */
    private Integer userRole;
    private String userName;
    private String mobile;
    private String idCardNo;
    /**
     * 证件类型  跟银行一致
     */
    private Integer idCardType;
    private String bankCardNo;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBusOrderNo() {
        return busOrderNo;
    }

    public void setBusOrderNo(String busOrderNo) {
        this.busOrderNo = busOrderNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getPayChannelId() {
        return payChannelId;
    }

    public void setPayChannelId(Integer payChannelId) {
        this.payChannelId = payChannelId;
    }

    public Integer getPayChannelType() {
        return payChannelType;
    }

    public void setPayChannelType(Integer payChannelType) {
        this.payChannelType = payChannelType;
    }

    public String getFrameworkSource() {
        return frameworkSource;
    }

    public void setFrameworkSource(String frameworkSource) {
        this.frameworkSource = frameworkSource;
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public Integer getIdCardType() {
        return idCardType;
    }

    public void setIdCardType(Integer idCardType) {
        this.idCardType = idCardType;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    @Override
    public String toString() {
        return "PayRechargeMessage{" +
                "userId=" + userId +
                ", busOrderNo='" + busOrderNo + '\'' +
                ", amount=" + amount +
                ", fee=" + fee +
                ", status=" + status +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", payChannelId=" + payChannelId +
                ", payChannelType=" + payChannelType +
                ", frameworkSource='" + frameworkSource + '\'' +
                ", userRole=" + userRole +
                ", userName='" + userName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", idCardNo='" + idCardNo + '\'' +
                ", idCardType=" + idCardType +
                ", bankCardNo='" + bankCardNo + '\'' +
                '}';
    }
}

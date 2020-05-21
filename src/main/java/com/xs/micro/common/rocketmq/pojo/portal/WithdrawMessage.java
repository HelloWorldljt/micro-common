package com.xs.micro.common.rocketmq.pojo.portal;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author duanz
 * @date 2019-11-08
 */
public class WithdrawMessage {
    private Integer userId;
    private String busOrderNo;
    private BigDecimal amount;
    private String frameworkSource;
    private Date applyTime;
    /**
     * 3 成功
     * 4 失败
     */
    private Integer status;

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

    public String getFrameworkSource() {
        return frameworkSource;
    }

    public void setFrameworkSource(String frameworkSource) {
        this.frameworkSource = frameworkSource;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "WithdrawMessage{" +
                "userId=" + userId +
                ", busOrderNo='" + busOrderNo + '\'' +
                ", amount=" + amount +
                ", frameworkSource='" + frameworkSource + '\'' +
                ", applyTime=" + applyTime +
                ", status=" + status +
                '}';
    }
}

package com.xs.micro.common.rocketmq.pojo.booking;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 银行授权信息
 *
 * @author chenrg
 * Created at 2019/8/2 11:59
 **/
public class BankAuthInfo implements Serializable {

    private static final long serialVersionUID = -3383048375353325460L;

    /**
     * 授权标识
     */
    private String type;
    /**
     * 授权编号
     */
    private String authOrderId;
    /**
     * 授权开最小金额
     */
    private BigDecimal startAmount;
    /**
     * 授权最大金额
     */
    private BigDecimal endAmount;
    /**
     * 授权开始日期
     */
    private Date startDate;
    /**
     * 授权结束日期
     */
    private Date endDate;
    /**
     * 授权类型
     */
    private Integer authType;

    public BankAuthInfo() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthOrderId() {
        return authOrderId;
    }

    public void setAuthOrderId(String authOrderId) {
        this.authOrderId = authOrderId;
    }

    public BigDecimal getStartAmount() {
        return startAmount;
    }

    public void setStartAmount(BigDecimal startAmount) {
        this.startAmount = startAmount;
    }

    public BigDecimal getEndAmount() {
        return endAmount;
    }

    public void setEndAmount(BigDecimal endAmount) {
        this.endAmount = endAmount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getAuthType() {
        return authType;
    }

    public void setAuthType(Integer authType) {
        this.authType = authType;
    }
}

package com.xs.micro.common.rocketmq.pojo.booking;

import java.io.Serializable;

/**
 * 投标成功下发消息
 *
 * @author chenrg
 * Created at 2019/8/5 17:15
 **/
public class ActOrderSuccessMessage implements Serializable {

    private static final long serialVersionUID = 476593986423814009L;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 额外信息
     */
    private String extra;

    /**
     * 业务订单号
     */
    private String busOrderNo;

    /**
     * 原始资产ID
     */
    private Integer astOriginId;

    /**
     * 投资金额
     */
    private String tranAmt;
    /**
     * 投资手续费
     */
    private String chargeFee;

    /**
     * 银行订单号，在投标时传给银行的
     */
    private String thirdHtId;

    /**
     * 订单平台来源
     */
    private String frameworkSource;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getBusOrderNo() {
        return busOrderNo;
    }

    public void setBusOrderNo(String busOrderNo) {
        this.busOrderNo = busOrderNo;
    }

    public Integer getAstOriginId() {
        return astOriginId;
    }

    public void setAstOriginId(Integer astOriginId) {
        this.astOriginId = astOriginId;
    }

    public String getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(String tranAmt) {
        this.tranAmt = tranAmt;
    }

    public String getChargeFee() {
        return chargeFee;
    }

    public void setChargeFee(String chargeFee) {
        this.chargeFee = chargeFee;
    }

    public String getThirdHtId() {
        return thirdHtId;
    }

    public void setThirdHtId(String thirdHtId) {
        this.thirdHtId = thirdHtId;
    }

    public String getFrameworkSource() {
        return frameworkSource;
    }

    public void setFrameworkSource(String frameworkSource) {
        this.frameworkSource = frameworkSource;
    }
}

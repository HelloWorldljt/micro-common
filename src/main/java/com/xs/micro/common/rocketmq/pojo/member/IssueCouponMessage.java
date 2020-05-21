package com.xs.micro.common.rocketmq.pojo.member;

import java.io.Serializable;
import java.util.Map;

/**
 * 下发优惠券消息
 *
 * @author chenrg
 * @date 2019/5/22
 */
public class IssueCouponMessage implements Serializable {

    private static final long serialVersionUID = -5165892325309106060L;

    /**
     * 批次号
     */
    private String batchId;


    /**
     * 平台类型
     */
    private Integer platformType;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 优惠券编号
     */
    private Integer couponId;

    /**
     * 消息参数
     */
    private Map<String, String> msgParam;

    /**
     * 发送消息类型
     */
    private String sendMsgType;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public Integer getPlatformType() {
        return platformType;
    }

    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Map<String, String> getMsgParam() {
        return msgParam;
    }

    public void setMsgParam(Map<String, String> msgParam) {
        this.msgParam = msgParam;
    }

    public String getSendMsgType() {
        return sendMsgType;
    }

    public void setSendMsgType(String sendMsgType) {
        this.sendMsgType = sendMsgType;
    }
}

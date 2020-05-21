package com.xs.micro.common.rocketmq.pojo.portal;

import java.io.Serializable;

/**
 * 充值消息
 *
 * @author chenrg
 * @date 2019/4/29
 */
public class RechargeMessage implements Serializable {

    private static final long serialVersionUID = 6385315699328247552L;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 充值订单ID
     */
    private Integer orderId;

   /**
     * 充值订单ID 对应order_form_recharge.order_form_id
     */
    private String orderFormId;

    /**
     * 用户注册渠道
     */
    private String utmSource;

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

    public String getOrderFormId() {
        return orderFormId;
    }

    public void setOrderFormId(String orderFormId) {
        this.orderFormId = orderFormId;
    }

    public String getUtmSource() {
        return utmSource;
    }

    public void setUtmSource(String utmSource) {
        this.utmSource = utmSource;
    }
}

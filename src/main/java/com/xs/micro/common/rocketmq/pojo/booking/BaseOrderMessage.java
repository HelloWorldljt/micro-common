package com.xs.micro.common.rocketmq.pojo.booking;

import java.io.Serializable;
import java.util.List;

/**
 * 订单基本信息
 *
 * @author chenrg
 * Created at 2019/8/5 14:57
 **/
public class BaseOrderMessage implements Serializable {

    private static final long serialVersionUID = 3313788995326292144L;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 额外信息
     */
    private String extra;

    /**
     * 订单平台来源
     */
    private String frameworkSouce;

    /**
     * 采购单来源
     */
    private String sourceName;

    /**
     * 订单明细列表
     */
    private List<OrderDetail> orderDetailList;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getFrameworkSouce() {
        return frameworkSouce;
    }

    public void setFrameworkSouce(String frameworkSouce) {
        this.frameworkSouce = frameworkSouce;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }
}

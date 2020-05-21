package com.xs.micro.common.rocketmq.pojo.booking;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 订单明细
 *
 * @author chenrg
 * Created at 2019/7/30 16:10
 **/
public class OrderDetail implements Serializable {

    private static final long serialVersionUID = -271425842634855477L;

    /**
     * 业务订单号
     */
    private String busOrderNo;
    /**
     * 产品ID
     */
    private Integer goodsId;
    /**
     * 产品类型
     */
    private String goodsType;
    /**
     * 订单金额
     */
    private BigDecimal goodsAmt;
    /**
     * 订单抵扣金额
     */
    private BigDecimal discountAmt;
    /**
     * 订单手续费
     */
    private BigDecimal feeAmt;
    /**
     * 订单实际支付金额（=商品金额+手续费-抵扣金额）
     */
    private BigDecimal actualPayAmt;
    /**
     * 额外信息
     */
    private String extra;

    /**
     * 订单使用资源列表
     */
    private List<OrderResource> orderResourceList;

    public String getBusOrderNo() {
        return busOrderNo;
    }

    public void setBusOrderNo(String busOrderNo) {
        this.busOrderNo = busOrderNo;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public BigDecimal getGoodsAmt() {
        return goodsAmt;
    }

    public void setGoodsAmt(BigDecimal goodsAmt) {
        this.goodsAmt = goodsAmt;
    }

    public BigDecimal getDiscountAmt() {
        return discountAmt;
    }

    public void setDiscountAmt(BigDecimal discountAmt) {
        this.discountAmt = discountAmt;
    }

    public BigDecimal getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(BigDecimal feeAmt) {
        this.feeAmt = feeAmt;
    }

    public BigDecimal getActualPayAmt() {
        return actualPayAmt;
    }

    public void setActualPayAmt(BigDecimal actualPayAmt) {
        this.actualPayAmt = actualPayAmt;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public List<OrderResource> getOrderResourceList() {
        return orderResourceList;
    }

    public void setOrderResourceList(List<OrderResource> orderResourceList) {
        this.orderResourceList = orderResourceList;
    }
}

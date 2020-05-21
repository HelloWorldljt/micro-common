package com.xs.micro.common.rocketmq.pojo.portal;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description
 * @Author WY
 * @Date 2020/4/26
 **/
public class ReleaseMessage  implements Serializable {

    /**
     * 申请编号
     */
    private String applyNo;

    /**
     * 返回金额
     */
    private BigDecimal refundAmount;

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }
}

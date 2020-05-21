package com.xs.micro.common.rocketmq.pojo.loan;

import java.io.Serializable;

/**
 * 资产放款消息
 * @author chenrg
 * @date 2019/5/5
 */
public class AssetLoanMessage implements Serializable {

    private static final long serialVersionUID = 831065421695421614L;

    /**
     * 资产ID
     */
    private Integer astOriginId;

    /**
     * 最后一期还款日
     */
    private String repaymentEndDate;

    /**
     * 放款时间
     */
    private String loanTime;

    /**
     * 订单产品类型
     */
    private String goodsType;

    /**
     * 放款申请ID
     */
    private Integer loanApplyId;

    public Integer getAstOriginId() {
        return astOriginId;
    }

    public void setAstOriginId(Integer astOriginId) {
        this.astOriginId = astOriginId;
    }

    public String getRepaymentEndDate() {
        return repaymentEndDate;
    }

    public void setRepaymentEndDate(String repaymentEndDate) {
        this.repaymentEndDate = repaymentEndDate;
    }

    public String getLoanTime() {
        return loanTime;
    }

    public void setLoanTime(String loanTime) {
        this.loanTime = loanTime;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getLoanApplyId() {
        return loanApplyId;
    }

    public void setLoanApplyId(Integer loanApplyId) {
        this.loanApplyId = loanApplyId;
    }
}

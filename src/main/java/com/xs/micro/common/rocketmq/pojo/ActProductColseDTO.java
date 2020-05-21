package com.xs.micro.common.rocketmq.pojo;
/**
 * 产品端ACT_PRODUCT结标
 *@author xupingyang
 *@date 2019/4/11
 *@param
 *@return
 */
public class ActProductColseDTO {

    /**
     * 资产编号
     */
    private String loanNumber;


    /**
     * 资产ID
     */
    private Integer astOriginId;

    /**
     * 机构编号
     */
    private String  agencyCode;

    /**
     * 资产结标日期
     */
    private String assetCloseDate;

    /**
     * 产品编号
     */
    private String productNO;

    /**
     * 借款人姓名
     */
    private String borrowerRealName;

    /**
     * bankUserId
     */
    private String bankUserId;

    /**
     * 资产还款方式
     */
    private String payType;


    /**
     * 投标截止时间
     */
    private String lastDate;

    /**
     * 年化利率
     */
    private String yearInterestRate;


    /**
     * 合同项目金额
     */
    private String contractAmount;


    /**
     * 序列号
     */
    private String serialNumber;

    /**
     * 交易流水号
     */
    private String thirdLogNo;
    /**
     * 资产状态
     */
    private String autAssetStatus;


    public String getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(String loanNumber) {
        this.loanNumber = loanNumber;
    }

    public Integer getAstOriginId() {
        return astOriginId;
    }

    public void setAstOriginId(Integer astOriginId) {
        this.astOriginId = astOriginId;
    }

    public String getAgencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }

    public String getAssetCloseDate() {
        return assetCloseDate;
    }

    public void setAssetCloseDate(String assetCloseDate) {
        this.assetCloseDate = assetCloseDate;
    }

    public String getProductNO() {
        return productNO;
    }

    public void setProductNO(String productNO) {
        this.productNO = productNO;
    }

    public String getBorrowerRealName() {
        return borrowerRealName;
    }

    public void setBorrowerRealName(String borrowerRealName) {
        this.borrowerRealName = borrowerRealName;
    }

    public String getBankUserId() {
        return bankUserId;
    }

    public void setBankUserId(String bankUserId) {
        this.bankUserId = bankUserId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public String getYearInterestRate() {
        return yearInterestRate;
    }

    public void setYearInterestRate(String yearInterestRate) {
        this.yearInterestRate = yearInterestRate;
    }

    public String getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(String contractAmount) {
        this.contractAmount = contractAmount;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getThirdLogNo() {
        return thirdLogNo;
    }

    public void setThirdLogNo(String thirdLogNo) {
        this.thirdLogNo = thirdLogNo;
    }

    public String getAutAssetStatus() {
        return autAssetStatus;
    }

    public void setAutAssetStatus(String autAssetStatus) {
        this.autAssetStatus = autAssetStatus;
    }

    @Override
    public String toString() {
        return "ActProductColseDTO{" +
                "loanNumber='" + loanNumber + '\'' +
                ", astOriginId=" + astOriginId +
                ", agencyCode='" + agencyCode + '\'' +
                ", assetCloseDate='" + assetCloseDate + '\'' +
                ", productNO='" + productNO + '\'' +
                ", borrowerRealName='" + borrowerRealName + '\'' +
                ", bankUserId='" + bankUserId + '\'' +
                ", payType='" + payType + '\'' +
                ", lastDate='" + lastDate + '\'' +
                ", yearInterestRate='" + yearInterestRate + '\'' +
                ", contractAmount='" + contractAmount + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", thirdLogNo='" + thirdLogNo + '\'' +
                ", autAssetStatus='" + autAssetStatus + '\'' +
                '}';
    }
}

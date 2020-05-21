package com.xs.micro.common.thirdparty;

import java.util.EnumSet;

/**
 * 三方调用接口路由
 * @author tanyuanpeng
 * @Date 2016-11-16
 */
public enum InterfaceMethod {
    /**
     * 三方调用接口路由
     */
    ALLOCATION_FINISH("loan.allocation.finish","micro-las","/api/las/passive/info/loanAllocationFinish", true, "进件调配完成通知", "{'noiteList':[{'quotaCode':'','dealCode':'','inletCount':'','contractAmount':'','allocationStatus':''}]}"),
    AUDIT_SEARCH("loan.audit.search","micro-las","/api/las/query/loanAuditSearch", true, "查询进件审批结果", "{'loanNumber':''}"),
    LOAN_SEARCH("loan.loan.search","micro-asset-start-loan","/startLoan/loanLoanSearch", true, "查询放款结果", "{'loanNumber':''}"),
    QUOTA_APPLY("loan.quota.apply","","", false, "额度申请", "{'contractCode':'','quotaSum':'','startDate':'','invalidDate':''}"),
    BASE_SEARCH("loan.base.search","","", false, "查询进件列表", "{'dealCode':'','quotaCode':'','pageIndex':'','pageSize':''}"),
    DETAIL_SEARCH("loan.detail.search","","", false, "查询进件详细信息", "{'loanNumber':'','transferId':''}"),
    AUDIT_RESULT("loan.audit.result","","", false, "推送审批结果", "{'loanNumber':'','result':'','loanAmount':'','endTime':''}"),
    LOAN_RESULT("loan.loan.result","","", false, "推送放款结果", "{'loanNumber':'','result':'','loanAmount':'','endTime':''}"),
    ATTACH_SEARCH("loan.attach.search","","", false, "查询进件附件信息", "{'loanNumber':'','transferId':''}"),
    REFUNDPLAN_SEARCH("loan.refundplan.search","micro-repay","/repay/query/searchRepayPlan", true, "查询还款计划信息", "{'loanNumber':''}"),
    LOAN_REDEMPTION("loan.redemption.apply","","", false, "赎回申请", "{'loanList':[{'loanNumber':'','redeemDate':'','makeCreditorValue':''}]}"),
    TRANSFER_LOAN_REDEMPTION("credit.redemption.apply","","", false, "赎回申请（转让债权）", "{'loanList':[{'creditCode':'','transferId':'','redeemDate':'','makeCreditorValue':''}]}"),
    LOAN_SIGNATURE("loan.signature.search","micro-asset-start-loan","/startLoan/loanSignatureSearch", true, "查询CFCA签章文件", "{'loanNumber':'','type':''}"),
    WITHDRAW_RESULT("borrow.account.withdrawals.notice","","", false, "推送借款提现结果", "{'loanNumber':'','result':'','withdrawAmount':'','endTime':'','message':''}"),
    ABORT("loan.abort","micro-las","/api/las/info/loanAbort", true, "进件终止", "{'loanNumber':'','exitTime':''}"),
    BORROWER_ACCOUNT_SEARCH("borrow.account.search","micro-biz-core","/borrower/info", true, "查看借款人开户信息", "{'bankUserId':''}"),

    BORROWER_WITHDRAW_SEARCH("borrow.account.withdrawals.search","micro-las","/assets/api/queryLoanWithdrawResult", true, "查看借款人放款提现信息", "{'loanNumber':''}"),
    REPAYMENT_NOTICE("repayment.notice","micro-repay","/repay/api/repaymentNoticeOld", true, "还款通知", "{'loanNumber':'','loanTerms':'','paymentDate':'','mustAmount':'','mustAccrual':'','thisRepaySum':'','advanceAmount':'','overdueAmount':''}"),
    // 还款通知
    REPAYMENT_DETAIL_NOTICE("repayment.detail.notice","micro-repay","/repay/api/repaymentNoticeNew", true, "还款通知", "{'loanNumber':'','repayDate':'','realBase':'','realInst':'','realPenalty':'','realDefault':'','thisRepaySum':'','mustBase':'','mustInst':'','mustPenalty':'','mustDefault':'','advanceAmount':'','cutBase':'','cutInst':'','cutPenalty':'','cutDefault':'','conCut':'','policyCut':'','specialCut':'','recAmount':'','deductAmount':'','repayScene':'','periodPay':''}"),
    ASSU_ACCOUNT_SEARCH("assu.account.search","micro-biz-core","/assure/userInfo", true, "查看担保人开户信息", "{'bankUserId':''}"),
    COMMON_ACCOUNT_SEARCH("common.account.search","micro-biz-core","/common/userInfo", true, "账户查询", "{'bankUserId':'','role':''}"),

    ACCOUNT_WITHDRAW_SEARCH("account.withdraw.search","micro-las","/assets/api/queryWithdrawResult", true, "查询提现结果", "{'searchType':'','withdrawNo':''}"),

    LOAN_RESULT_NOTICE("loan.result.notice","","", false, "进件结果通知", "{'loanNumber':'','status':''}"),

    LOAN_RESULT_SEARCH("loan.result.search","micro-las","/api/las/passive/info/loanResultSearch", true, "进件结果查询", "{'loanNumber':'','dealCode':''}"),

    BALANCE_ATTACH_SEARCH("balance.attach.search","micro-repay","/repay/query/searchBalanceFile", true, "对账文件查询", "{'date':''}"),

    //????
    LOAN_AUTO_ENTRY("loan.auto.entry","micro-las","/api/las/info/autoEntry", true, "自动推送进件", "{'loanNumber': '','loaninfo': '','detail': ''}"),

    BORROW_BANKCARD_SEARCH("borrow.bankcard.search","micro-biz-core","/api/assets/query/borrowBankcardSearch", true, "查询借款人和绑卡信息", "{'idCardNo': ''}"),

    CONTRACT_SIGNATURE("contract.signature","micro-las","/api/las/passive/info/contractSignature", true, "合同协议向上签章", "{'fileContent':'','companyKeyword':'CE613E05F32DB9D3','companyLocation':'R','personKeywords':[{'name':'安刚','idCardNo':'220605197412264692','mobile':'15765117683','keyword':'9C2D4559781D99D1','location':'R'}]}"),
    //??
    LOAN_BATCH_RESULT_NOTICE("loan.batch.result.notice","","", false, "批次结果通知", "{'batchNo': '','totalCount': '','successCount': '','failCount': ''}"),

    LOAN_ENABLE_CHECK("loan.enable.check","micro-las","/api/las/query/loanEnableCheck", true, "是否可以进件", "{'idCardNo': ''}"),

    ENTERPRISE_LOAN_AUTO_ENTRY("enterprise.loan.auto.entry", "micro-las","/api/las/passive/info/enterpriseLoanAutoEntry",true, "企业推送进件", "{'loanNumber': '','loaninfo': '','detail': ''}"),

    BORROWER_EXISTS_CHECK("borrower.exists.check","micro-read-core","/borrowerInfo/query/verifyBorrowerWhetherOpenAccount", true, "校验借款人是否已经开过户", "{'idCard':''}"),

    BORROWER_DEALPWD_SEARCH("borrower.dealpwd.search","micro-read-core","/borrowerInfo/query/borrowerWhetherSetDealPwd", true, "查询是否设置交易密码", "{'idCard':''}"),

    BORROWER_AUTH_SEARCH("borrower.author.search","micro-read-core","/borrowerInfo/query/queryBorrowerAuthorInfo",true,"借款用户授权查询","{'idNo':'','loanNumber':''}"),
    //??
    WITHDRAW_DEAL_SEARCH("withdraw.deal.search","micro-las","/assets/api/queryWithdrawDealSearch", true, "查询提现信息", "{'searchType':'','busOrderId':''}"),

    LOAN_OVERDUE_JY_SEARCH("loan.overdue.jy.search","","", false, "向上查询逾期信息", "{'loanNumber':'','pageIndex':'','pageSize':''}"),

    LOAN_OVERDUE_TT_SEARCH("loan.overdue.tt.search","micro-repay","/repay/query/loanOverdueTtSearch", true, "资产端查询逾期信息", "{'loanNumber':'','pageIndex':'','pageSize':''}"),

    REPAY_RESULT_SEARCH("repay.result.search","micro-repay","/repay/query/api/repayResult", true, "查询还款结果", "{'loanNumber':''}"),

    REPAY_FINISH_NOTICE("repay.finish.notice","","", false, "还款完成通知", "{'loanNumber':'','status':'','repayEndDate':''}"),

    HISTORY_LOAN_ATTACH_SEARCH("history.loan.attach.search","micro-las","/api/las/passive/info/historyLoanAttachSearch", true, "资产中心查询存量附件信息", "{'loanNumber':''}"),

    //垫付申请通知
    REPAYMENT_ADVANCE_NOTICE("repayment.advance.notice","micro-repay","/repay/api/advanceNotice/repayAdvanceNotice", true, "垫付申请通知", "{'loanNumber':'','loanTerms':'','repayDate':'','serialNumber':'','advanceAmount':'','advancePrincipal':'','advanceInterest':'','periodPay':'','advancePenalty':'','advanceType':''}"),
    // 垫资结果通知
    REPAYMENT_ADVANCE_RESULT_NOTICE("repayment.advance.result.notice","","", false, "垫付结果通知", "{'loanNumber':'','loanTerms':'','result':'','serialNumber':'','advancePenalty':'','advancePrincipal':'','advanceInterest':''}"),
    //代偿归还通知
    COMPENSATION_RESTITUTION_NOTICE("compensation.restitution.notice","micro-repay","/repay/api/compensationRestitutionNotice", true, "代偿归还通知", "{'loanNumber':'','loanTerms':'','returnBase':'','serialNumber':'','returnInst':'','returnPenalty':'','returnDefault':'','periodPay':'','cutBase':'','cutInst':'','recAmount':'','deductAmount':''}"),

    TRUSTFUL_TRANSFER_RESULT("trustful.transfer.result","","",false,"推送划转结果","{'loanNumber':'','result':'','amount':'','endTime':'','trustfulAcctId':''}"),
    TRUSTFUL_TRANSFER_SEARCH("trustful.transfer.search","micro-asset-start-loan","/trustful/transSearch",true,"查询划转结果","{'loanNumber':''}"),
    //借款人直接转账挂账清分充值
    BORROWER_TRANSFER_RECHARGE_SEARCH("borrower.transfer.recharge.search","micro-las","/assets/api/queryClearRecord",true,"查询借款人直接转账挂账清分充值记录列表","{'bankUserId':'','startDate':'','endDate':'','pageIndex':'','pageSize':''}"),
    //??
    BORROWER_TRANSFER_RECHARGE_NOTICE("borrower.transfer.recharge.notice","","",false,"借款人直接转账挂账清分充值通知","{'bankUserId':'','rechargeTime':'','amount':'','frameSource':'','transAcctIdName':'','transAcctId':''}"),

    LOAN_FAIL_NOTCIE("loan.fail.notice", "","",false, "资产流标通知", "{'result':'','message':'','loanNumber':'','exitTime':''}"),

    BORROWER_ACCT_CREATE("borrower.acct.create","","", false, "借款人开户", "{'result':'','message':'','idNo':'','acctNo':'','bankUserId':'','mobile':'','orderId':'','bankCard':'','busOrderId':''}"),
    ASSURE_ACCT_CREATE("assure.acct.create", "","", false, "担保人开户", "{'result':'','message':'','idNo':'','acctNo':'','bankUserId':'','mobile':'','orderId':'','bankCard':'','busOrderId':''}"),
    COMMON_ACCOUNT_CREATE("common.account.create", "","", false, "通用开户", "{'result':'','message':'','idNo':'','acctNo':'','bankUserId':'','mobile':'','orderId':'','bankCard':'','busOrderId':''}"),
    BORROWER_BANKCARD_BIND("borrower.bankcard.bind","","", false,"借款人绑卡","{'result':'','message':'','idNo':'','acctNo':'','orderId':''}"),
    BORROWER_BANKCARD_UNBIND("borrower.bankcard.unbind","","", false,"借款人解绑卡","{'result':'','message':'','idNo':'','acctNo':'','orderId':''}"),
    COMMON_WITHDRAW_CASH("common.account.withdraw", "","", false, "通用提现", "{'result':'','message':'','orderId':'','loanNumber':'','withDrawId':''}"),
    ASSU_ACCOUNT_WITHDRAW_CASH("assu.account.withdraw", "","", false, "借款人提现", "{'result':'','message':'','orderId':'','loanNumber':'','withDrawId':''}"),
    BORROW_ACCOUNT_WITHDRAW("borrow.account.withdraw", "","", false, "借款人提现", "{'result':'','message':'','orderId':'','loanNumber':'','withDrawId':''}"),
    BORROWER_DEALPWD_NOTITE("borrower.set.dealpwd", "","",false, "设置交易密码通知", "{'result':'','message':'','idNo':'','acctNo':'','mobile':'','orderId':'','bankName':''}"),
    BORROWER_SET_AUTHOR("borrower.set.author","","",false,"借款用户设置授权","{'result':'','message':'','orderId':'','authOrderId':''}"),
    BORROWER_MOBILE_UPDATE("borrower.modify.phoneNum","","",false,"借款人修改手机号","{'result':'','message':'','mobile':'','orderId':''}"),
    BORROWER_BANKCARD_CHANGE("borrower.bankcard.change","","",false,"借款人更换银行卡","{'result':'','message':'','idNo':'','acctNo':'','orderId':''}"),

    PUSH_LOAN_INFO_AUDIT("push.loan.info.audit","","", false, "推送资产风控信息", "{'loanNumber':'','name':'','age':'','gender':''," +
            "'education':'','cellPhone':'','idCardNo':'','homeType':'','houseProRightRate':'','jobDays':'','monthPayment':'','productCode':''" +
            ",'loanTime':'','contractAmt':'','loanTerms':'','repayType':'','loanPurpose':'','loanOVDHigh':''}"),
    REJECT_LOAN_PUSH("loan.rejective.detail.push","micro-las","/api/las/info/loanReject", true, "驳回资产推送", ""),
    BORROWER_QUICK_RECHARGE_REQUEST("borrower.quick.recharge.request","micro-pay","/pay/api/recharge/lasAgencyRechargeRequest",true,"借款人充值请求","{\n" +
            "  \"amount\": \"1\",\n" +
            "  \"busOrderNo\": \"12fdd3\",\n" +
            "  \"cardNo\": \"6225887906866310\",\n" +
            "  \"channelType\": \"M\",\n" +
            "  \"fee\": \"0\",\n" +
            "  \"idCardNo\": \"410403199712134321\",\n" +
            "  \"idCardType\": \"1\",\n" +
            "  \"mobile\": \"13155745740\",\n" +
            "  \"name\": \"孔娅锦\",\n" +
            "  \n" +
            "  \"returnUrl\": \"string\"\n" +
            "  \n" +
            "}"),
    BORROWER_QUICK_RECHARGE_NOTICE("borrower.quick.recharge.notice","","",true,"借款人快捷充值通知",""),
    BORROWER_QUICK_RECHARGE_SEARCH("borrower.quick.recharge.search","micro-pay","/pay/api/recharge/lasAgencyRechargeSearch",true,"借款人快捷充值查询",""),


    ;

    /**
     * 银行2.0通知接口，因为传参和银行1.0不一样
     */
    public static final EnumSet<InterfaceMethod> NOTICE_THIRD_V2 = EnumSet.of(BORROWER_ACCT_CREATE,ASSURE_ACCT_CREATE,COMMON_ACCOUNT_CREATE,BORROWER_BANKCARD_BIND,
            BORROWER_BANKCARD_UNBIND,COMMON_WITHDRAW_CASH,ASSU_ACCOUNT_WITHDRAW_CASH,BORROW_ACCOUNT_WITHDRAW,BORROWER_DEALPWD_NOTITE,BORROWER_SET_AUTHOR,BORROWER_MOBILE_UPDATE
            ,BORROWER_BANKCARD_CHANGE);

    /**
     * 忽略返回值接口
     */
    public static final EnumSet<InterfaceMethod> IGNORE_NOTICE_METHOD = EnumSet.of(BORROWER_ACCT_CREATE,ASSURE_ACCT_CREATE,COMMON_ACCOUNT_CREATE,BORROWER_BANKCARD_BIND,
            BORROWER_BANKCARD_UNBIND,COMMON_WITHDRAW_CASH,ASSU_ACCOUNT_WITHDRAW_CASH,BORROW_ACCOUNT_WITHDRAW,BORROWER_DEALPWD_NOTITE,BORROWER_SET_AUTHOR,BORROWER_MOBILE_UPDATE
            ,BORROWER_BANKCARD_CHANGE,TRUSTFUL_TRANSFER_RESULT,BORROWER_TRANSFER_RECHARGE_NOTICE);


    public static InterfaceMethod getByMethod(String method) {
        for (InterfaceMethod em : InterfaceMethod.values()) {
            if (em.getMethod().equals(method)) {
                return em;
            }
        }
        return null;
    }

    /**
     * @param method
     *            方法名称
     * @param service
     *            是否服务类接口
     * @param desc
     *            方法作用描述
     */
    InterfaceMethod(String method, String serviceId, String serviceUrl, boolean service, String desc, String requestParamTemplate) {
        this.method = method;
        this.service = service;
        this.desc = desc;
        this.requestParamTemplate = requestParamTemplate;
        this.serviceId = serviceId;
        this.serviceUrl = serviceUrl;
    }

    private String method;
    private boolean service;
    private String desc;
    private String requestParamTemplate;
    private String serviceId;
    private String serviceUrl;


    public String getServiceId() {
        return serviceId;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public String getMethod() {
        return method;
    }

    public boolean isService() {
        return service;
    }

    public String getDesc() {
        return desc;
    }

    public String getRequestParamTemplate() {
        return requestParamTemplate;
    }

}

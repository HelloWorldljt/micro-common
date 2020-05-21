package com.xs.micro.common.idempotent;

/**
 * @author tanyuanpeng
 * @Date 2019/5/9 16:07
 **/
public enum  IdempotentBizType {

    /**
     * 测试专用
     */
    FOR_TEST(0, "测试专用"),

    /**
     * 投资成功增加积分
     */
    INVEST_ADD_INTEGRAL(1,"投资成功增加积分"),

    /**
     * 赚取会员积分
     */
    EARN_POINT(2, "赚取会员积分"),

    /**
     * 下发优惠券
     */
    ISSUE_COUPON(3, "下发优惠券"),

    /**
     * 活动赚取积分
     */
    ACTIVITY_EARN_POINT(4, "活动赚取积分"),

    /**
     * 还款本地批量走账
     */
    REPAY_LOCAL_BATCH(5, "还款本地批量走账"),

    /**
     * 积分冻结tcc事务try幂等
     */
    POINT_TRANSFER_TRY(6, "积分冻结TRY"),

    /**
     * 积分冻结tcc事务confirm幂等
     */
    POINT_TRANSFER_CONFIRM(7, "积分冻结CONFIRM"),

    /**
     * 积分冻结tcc事务cancel幂等
     */
    POINT_TRANSFER_CANNEL(8, "积分冻结CANNEL"),

    /**
     * 会员微服务-获取拼图机会
     */
    MEMBER_PUZZLE(9, "拼图机会获取"),

    /**
     * 会员微服务-签到
     */
    SIGN_IN(10, "签到"),

    /**
     * 会员微服务-摇一摇机会获取
     */
    SHAKE(11, "摇一摇"),

    /**
     * 会换为服务-兑换生活卡券
     */
    CONVERT_LIFE_COUPON(12, "兑换生活卡券"),
    /**
     * 活动下发生活卡券
     */
    ACTIVITY_ISSUE_LIFE_COUPON(13, "活动下发生活卡券"),

    /**
     * 主动类订单还款通知处理
     */
    ACT_ORDER_REPAY_HANDLE(14,"主动类订单还款通知处理"),

    /**
     * 消耗积分
     */
    USE_POINT(15,"消耗积分"),

    /**
     * BIZ-CORE 还款本地走账
     */
    BIZ_CORE_REPAY_LOCAL(16,"BIZ_CORE还款本地走账"),
    /**
     * BIZ-CORE 担保户走账
     */
    BIZ_CORE_ASSURE_LOCAL(17,"BIZ_CORE担保户走账"),

    /**
     * 向大侠延长有效期
     */
    BROKER_DELAY_TIME(18, "向大侠延长有效期"),

    /**
     * 邀请注册获取加成经验值
     */
    MEMBER_RECOMMEND_REG_ADDEXP(19, "邀请注册获取加成经验值"),

    /**
     * 邀请注册获取加成经验值
     */
    MEMBER_RECOMMEND_FIRST_BUY_ADDEXP(20, "邀请注册获取加成经验值"),

    /**
     * 连续签到获取加成经验值
     */
    CONTINUOUS_SIGNIN_ADDEXP(21, "邀请注册获取加成经验值"),

    /**
     * crs订单分享
     */
    CRS_ORDER_SHARE(22, "crs订单分享"),

    /**
     * 晒单奖励下发生活卡券
     */
    SHARE_REWARD_ISSUE_LIFE_COUPON(23, "晒单奖励下发生活卡券"),

    /**
     * 兑换获取加成经验值
     */
    MEMBER_POINT_CONVERT_ADDEXP(24, "邀请注册获取加成经验值"),

    /**
     * 采购单银行回调
     */
    BOOKING_BANK_CALLBACK(25, "采购单银行回调"),

    /**
     * BIZ-CORE 放款完成后资产处理
     */
    BIZ_CORE_LOAN_ASSET_LOCAL(26,"放款完成后资产本地处理"),
    BIZ_CORE_SELF_TRANSFER_LOCAL(27,"自有金转账处理"),

    /**
     * 调用micro-notice下发站内信，幂等
     */
    MICRO_NOTICE_ISSUE_SYSMSG(28, "下发站内信"),

    /**
     * BIZ-CORE 可用入账处理，在途入账处理：类似充值业务
     */
    BIZ_CORE_USER_ADD_ACCOUNT(29,"可用入账处理，在途入账处理"),
    /**
     * BIZ-CORE 用户提现业务，提现冻结出账，到账出账
     */
    BIZ_CORE_USER_WITH_DRAW(30,"提现冻结出账，到账出账"),

    BIZ_CORE_BORROWER_CHARGE(31,"借款人充值，在途入账，到账入账"),

    BIZ_CORE_BORROWER_CHARGE_CLEAR(32,"借款人充值清分（快捷），在途出账，可用入账"),

       ;

    private int value;

    private String desc;

    IdempotentBizType(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue(){
        return this.value;
    }

    @Override
    public String toString() {
        return this.desc;
    }
}
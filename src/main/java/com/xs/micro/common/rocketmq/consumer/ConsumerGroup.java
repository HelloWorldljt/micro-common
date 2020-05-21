package com.xs.micro.common.rocketmq.consumer;

/****
 @description
 @author tanyuanpeng
 @date 2019/3/25    10:19 
 ****/
public class ConsumerGroup {

    /**
     * 订单取消挂牌TOPIC 用于micro-order 应用消费
     */
    public final static String MICRO_ORDER_ORDER_CANCEL_TRANSFER_ = "ORDER_CANCEL_TRANSFER_TOPIC";
    /**
     * 流标通知订单中心消费组 用于micro-order 应用消费
     */
    public final static String MICRO_ORDER_ASSETS_FAIL_NOTICE = "ASSETS_FAIL_NOTICE";
    /**
     * 还款通知银行结标消费者组 micro-biz-core消费消息使用
     */
    public static final String REPAY_NOTIFY_BANK_CLOSE = "REPAY_NOTIFY_BANK_CLOSE";


    /**
     * 还款完成通知三方结标消费者组  asset应用消费使用
     */
    public static final String REPAY_NOTIFY_THIRD_CLOSE = "REPAY_NOTIFY_THIRD_CLOSE";


    /**
     * 主动类还款通知service端消费组，micro-order消费消息使用
     */
    public static final String ACT_REPAY_NOTIFY = "ACT_REPAY_NOTIFY";


    /**
     * 主动类订单购买失败，生成订单消费者组，用于micro-order 应用消费
     */
    public final static String BUY_FAILED_GENERATE_ACT_ORDER = "BUY_FAILED_GENERATE_ACT_ORDER";
    /**
     * 主动类订单购买成功，生成订单消费者组，用于micro-order 应用消费
     */
    public static final String BUY_SUCCESS_GENERATE_ACT_ORDER = "BUY_SUCCESS_GENERATE_ACT_ORDER";


    /**
     * 主动类订单购买成功，放款预处理消费组 用于micro-asset-start-loan
     */
    public static final String BUY_SUCCESS_LOAN_PRETREATMENT = "BUY_SUCCESS_LOAN_PRETREATMENT";


    /**
     * 主投购买成功，活动奖励监听处理
     */
    public static final String INVEST_ACT_ACTIVITY_COMMON_CONSUMER = "INVEST_ACT_ACTIVITY_COMMON_CONSUMER";


    /**************************产品端发送rocketmq consumer定义 begin*****************************************/
    /**
     * 用户注册，手机号归属地查询 (service)
     */
    public static final String REGISTER_MOBILE_DISTRICT_CONSUMER = "REGISTER_MOBILE_DISTRICT_CONSUMER";

    /**
     * 注册用户下发膨胀红包奖励 (service)
     */
    public static final String REGISTER_RED_BAG_REWARD_CONSUMER = "REGISTER_RED_BAG_REWARD_CONSUMER";

    /**
     * 用户注册，渠道相关处理 (service)
     */
    public static final String REGISTER_CHANNEL_CONSUMER = "REGISTER_CHANNEL_CONSUMER";

    /**
     * 用户注册，下发兑换码 (service)
     */
    public static final String REGISTER_SEND_BARCODE_CONSUMER = "REGISTER_SEND_BARCODE_CONSUMER";

    /**
     * 用户注册，每日任务处理 (service)
     */
    public static final String REGISTER_DAILY_TASK_CONSUMER = "REGISTER_DAILY_TASK_CONSUMER";

    /**
     * ios推广用户注册关联到idfa (service)
     */
    public static final String REGISTER_UNIQUE_IDENT_CONSUMER = "REGISTER_UNIQUE_IDENT_CONSUMER";

    /**
     * 获取注册用户反欺诈风险项 (service)
     */
    public static final String REGISTER_USER_RISK_VALUE_CONSUMER = "REGISTER_USER_RISK_VALUE_CONSUMER";

    /**
     * 用户注册初始化经纪人账户 (micro-expand)
     */
    public static final String REGISTER_BROKER_CONSUMER = "REGISTER_BROKER_CONSUMER";

    /**
     * 用户注册，创建积分账户 (micro-member)
     */
    public static final String REGISTER_INIT_MEMBER_CONSUMER = "REGISTER_INIT_MEMBER_CONSUMER";

    /**
     * 用户注册-活动通用处理消费者组（micro-activity） 弃用
     */
    @Deprecated
    public static final String REGISTER_ACTIVITY_CONSUMER = "REGISTER_ACTIVITY_CONSUMER";

    /**
     * 实名认证渠道用户奖励 (service)
     */
    public static final String NAME_AUTH_PARTNER_REWARD_CONSUMER = "NAME_AUTH_PARTNER_REWARD_CONSUMER";

    /**
     * 实名认证会员积分奖励 (micro-member)
     */
    public static final String NAME_AUTH_MEMBER_REWARD_CONSUMER = "NAME_AUTH_MEMBER_REWARD_CONSUMER";

    /**
     * 实名认证自动发送兑换码 (service)
     */
    public static final String NAME_AUTH_SEND_BARCODE_CONSUMER = "NAME_AUTH_SEND_BARCODE_CONSUMER";

    /**
     * 用户实名活动消费者组
     */
    public static final String REAL_NAME_AUTH_ACTIVITY_CONSUMER = "REAL_NAME_AUTH_ACTIVITY_CONSUMER";


    /**
     * 用户投资，触发活动奖励 (service)
     */
    public static final String INVEST_ACTIVITY_COMMON_CONSUMER = "INVEST_ACTIVITY_COMMON_CONSUMER";

    /**
     * 用户投资，触发渠道奖励 (service)
     */
    public static final String INVEST_CHANNCEL_CONSUMER = "INVEST_CHANNCEL_CONSUMER";

    /**
     * 用户投资，触发发送兑换码 (service)
     */
    public static final String INVEST_SEND_BARCODE_CONSUMER = "INVEST_SEND_BARCODE_CONSUMER";

    /**
     * 用户投资，触发每日任务 (micro-member)
     */
    public static final String INVEST_USER_DAILY_TASK_AWARD_CONSUMER = "INVEST_USER_DAILY_TASK_AWARD_CONSUMER";

    /**
     * 用户投资，触发土豪任务奖励 (micro-member)
     */
    public static final String INVEST_WEALTHY_TASK_AWARD_CONSUMER = "INVEST_WEALTHY_TASK_AWARD_CONSUMER";

    /**
     * 用户投资，触发使用理财金奖励 (micro-member)
     */
    public static final String INVEST_USED_TASTE_CONSUMER = "INVEST_USED_TASTE_CONSUMER";

    /**
     * 用户投资，触发首投奖励 (micro-member)
     */
    public static final String INVEST_FIRST_BUY_AWARD_CONSUMER = "INVEST_FIRST_BUY_AWARD_CONSUMER";

    /**
     * 用户投资，触发摇一摇机会奖励
     */
    public static final String INVEST_SHAKE_NUMBER_CONSUMER = "INVEST_SHAKE_NUMBER_CONSUMER";

    /**
     * 用户投资，触发二次购买奖励 (micro-member)
     */
    public static final String INVEST_SECOND_BUY_AWARD_CONSUMER = "INVEST_SECOND_BUY_AWARD_CONSUMER";

    /**
     * 用户投资，触发推荐购买奖励 (micro-member)
     */
    public static final String INVEST_RECOMMEND_BUY_AWARD_CONSUMER = "INVEST_RECOMMEND_BUY_AWARD_CONSUMER";

    /**
     * 委托购买积分奖励 (micro-member)
     */
    public static final String INVEST_AUTHORIZE_MEMBER_POINT_CONSUMER = "INVEST_AUTHORIZE_MEMBER_POINT_CONSUMER";

    /**
     * 理财计划积分奖励 (micro-member)
     */
    public static final String INVEST_FINANCE_PLAN_MEMBER_POINT_CONSUMER = "INVEST_FINANCE_PLAN_MEMBER_POINT_CONSUMER";

    /**
     * 用户投资，触发投资日志记录 (service)
     */
    public static final String INVEST_LOG_CONSUMER = "INVEST_LOG_CONSUMER";

    /**
     * 用户投资，同步首购信息 (service)
     */
    public static final String INVEST_SYNC_FIRST_BUY_CONSUMER = "INVEST_SYNC_FIRST_BUY_CONSUMER";

    /**
     * 用户首投，绤推荐人下发奖励 (service)
     */
    public static final String INVEST_RECOMMEND_USER_REWARD_CONSUMER = "INVEST_RECOMMEND_USER_REWARD_CONSUMER";

    /**
     * 用户在时限要求下投资，下发投资人和推荐人膨胀红包奖励
     */
    public static final String INVEST_TIME_LIMTED_BUY_REWARD_CONSUMER = "INVEST_TIME_LIMTED_BUY_REWARD_CONSUMER";

    /**
     * 投资委托产品，下发生活卡券激活机会
     */
    public static final String INVEST_AUT_LIFE_COUPON_REWARD_CONSUMER = "INVEST_AUT_LIFE_COUPON_REWARD_CONSUMER";

    /**
     * 用户投资（委托产品），触发经纪人佣金计算 (micro-expand)
     */
    public static final String AUT_INVEST_COMMISSION_REWARD_CONSUMER = "AUT_INVEST_COMMISSION_REWARD_CONSUMER";

    /**
     * 购买（委托产品）发放召唤奖励(micro-expand)
     */
    public static final String AUT_INVEST_CALL_REWARD_CONSUMER = "AUT_INVEST_CALL_REWARD_CONSUMER";

    /**
     * 用户投资，触发向大侠升级(micro-expand)
     */
    public static final String INVEST_BROKER_UPGRADE_CONSUMER = "INVEST_BROKER_UPGRADE_CONSUMER";

    /**
     * 用户绑卡，触发会员奖励下发 (micro-member)
     */
    public static final String BIND_CARD_MEMBER_REWARD_CONSUMER = "BIND_CARD_MEMBER_REWARD_CONSUMER";

    /**
     * 用户绑卡，触发渠道用户奖励下发 (service)
     */
    public static final String BIND_CARD_PARTNER_REWARD_CONSUMER = "BIND_CARD_PARTNER_REWARD_CONSUMER";

    /**
     * 充值成功，触发现金奖励与抽奖机会 (service)
     */
    public static final String RECHARGE_RED_BAG_REWARD_CONSUMER = "RECHARGE_RED_BAG_REWARD_CONSUMER";

    /**
     * 充值成功，触发渠道用户奖励 (service)
     */
    public static final String RECHARGE_PARTNER_REWARD_CONSUMER = "RECHARGE_PARTNER_REWARD_CONSUMER";

    /**
     * 充值成功，触发会员奖励 (micro-member)
     */
    public static final String RECHARGE_MEMBER_REWARD_CONSUMER = "RECHARGE_MEMBER_REWARD_CONSUMER";

    /**
     * 充值活动奖励
     */
    public static final String RECHARGE_ACTIVITY_CONSUMER = "RECHARGE_ACTIVITY_CONSUMER";

    /**
     * 用户每日签到、补签，触发会员奖励 (micro-member)
     */
    public static final String DAILY_SIGN_MEMBER_REWARD_CONSUMER = "DAILY_SIGN_MEMBER_REWARD_CONSUMER";

    /**************************产品端发送rocketmq consumer定义 end*****************************************/


    /**
     * 主投资产放款经纪人佣金奖励  (micro-expand)
     */
    public static final String ACT_ASSETS_LOAN_COMMISSION_REWARD_CONSUMER = "ACT_ASSETS_LOAN_COMMISSION_REWARD_CONSUMER";

    /**
     * 主动放款每一笔子订单触发向大侠升级 (micro-expand)
     */
    public static final String ACT_ASSETS_LOAN_BROKER_UPGRADE_CONSUMER = "ACT_ASSETS_LOAN_BROKER_UPGRADE_CONSUMER";

    /**
     * 主动放款积分奖励 (micro-member)
     */
    public static final String ACT_ASSETS_LOAN_MEMBER_POINT_CONSUMER = "ACT_ASSETS_LOAN_MEMBER_POINT_CONSUMER";

    /**
     * 主动转让积分奖励 (micro-member)
     */
    public static final String ACT_ASSETS_LOAN_TRANSFER_MEMBER_POINT_CONSUMER = "ACT_ASSETS_LOAN_TRANSFER_MEMBER_POINT_CONSUMER";

    /**
     * 前端后端订单收益校验消息消费组
     */
    public static final String FRONT_AND_BACK_INCOME_CHECK_CONSUMER = "FRONT_AND_BACK_INCOME_CHECK_CONSUMER";

    /**
     * 合同管理优先
     */
    public static final String AGREEMENT_EVENT_PRIORITY_CONSUMER = "AGREEMENT_EVENT_PRIORITY_CONSUMER";

    /**
     * 合同管理普通
     */
    public static final String AGREEMENT_EVENT_NORMAL_CONSUMER = "AGREEMENT_EVENT_NORMAL_CONSUMER";

    /**
     * micro-activity 冗余主投订单信息
     */
    public static final String ACT_ASSETS_LOAN_ACTIVITY_REDUNDANT_CONSUMER = "ACT_ASSETS_LOAN_ACTIVITY_REDUNDANT_CONSUMER";

    /**
     * micro-activity 冗余委托订单信息
     */
    public static final String AUT_USER_INVEST_ACTIVITY_REDUNDANT_CONSUMER = "AUT_USER_INVEST_ACTIVITY_REDUNDANT_CONSUMER";

    /**
     * micro-activity 冗余虚拟订单信息
     */
    public static final String VIRTUAL_INVEST_ACTIVITY_REDUNDANT_CONSUMER = "VIRTUAL_INVEST_ACTIVITY_REDUNDANT_CONSUMER";

    /**
     * 签到下发优惠券消费者组，消费Topic.ISSUE_COUPON_TOPIC的消息，事务消息示例临时使用
     */
    public static final String DAILY_SIGN_ISSURE_COUPON_CONSUER = "DAILY_SIGN_ISSURE_COUPON_CONSUER";

    /**
     * 扣费系统，扣费明细回写消息，由扣费方发出消息，用于micro-operation消费
     */
    public static final String DEDUCT_DETAIL_RECEIVER_CONSUMER = "DEDUCT_DETAIL_RECEIVER_CONSUMER";

    /**
     * 会员积分赚取消息（micro-member)
     */
    public static final String MEMBER_EARN_POINT_CONSUMER = "MEMBER_EARN_POINT_CONSUMER";

    /**
     * 邀请注册增加卡券激活机会(micro-user-coupon)
     */
    public static final String INVITE_REGISTER_ADD_ACTIVE_CONSUMER = "INVITE_REGISTER_ADD_ACTIVE_CONSUMER";

    /**
     * 委托投资增加卡券激活机会(micro-user-coupon)
     */
    public static final String AUT_INVITE_INVEST_ADD_ACTIVE_CONSUMER = "AUT_INVITE_INVEST_ADD_ACTIVE_CONSUMER";

    /**
     * 委托投资增加单笔投资激活机会(micro-user-coupon)
     */
    public static final String AUT_INVEST_ADD_SINGLE_ACTIVE_CONSUMER = "AUT_INVEST_ADD_SINGLE_ACTIVE_CONSUMER";

    /**
     * 委托投资增加累计投资激活机会(micro-user-coupon)
     */
    public static final String AUT_INVEST_ADD_CUMULATIVE_ACTIVE_CONSUMER = "AUT_INVEST_ADD_CUMULATIVE_ACTIVE_CONSUMER";

    /**
     * 邀请好友委托投资消费者组(micro-expand)，监听的是service发布的消息USER_INVEST_TOPIC
     */
    public static final String AUT_INVITE_INVEST_CONSUMER = "AUT_INVITE_INVEST_CONSUMER";

    /**
     * 会员中心消费摇一摇消息（micro-member)
     */
    public static final String USER_SHAKE_MEMBER_COMSUMER = "USER_SHAKE_MEMBER_COMSUMER";

    /**
     * 还款通知银行结标消费者组 micro-order消费消息使用 修改actProduct状态
     */
    public static final String REPAY_NOTIFY_ACT_PRODUCT_CLOSE = "REPAY_NOTIFY_ACT_PRODUCT_CLOSE";
    /**
     * micro-user 同步service 开户数据
     */
    public static final String USER_SYNC_SERVICE_OPEN_ACCOUNT_CONSUMER = "USER_SYNC_SERVICE_OPEN_ACCOUNT_CONSUMER";
    /**
     * micro-user 同步service 修改手机号
     */
    public static final String USER_SYNC_SERVICE_CHANGE_MOBILE_CONSUMER = "USER_SYNC_SERVICE_CHANGE_MOBILE_CONSUMER";

    /**
     * 项目审核上报银行成功，service消费消息生成actProduct(service 处理)
     */
    public static final String ASSETS_REPORT_GENERATE_ACT_PRODUCT_CONSUMER = "ASSETS_REPORT_GENERATE_ACT_PRODUCT_CONSUMER";

    /**
     * 项目审核上报银行成功，emergency消费消息生成上报数据
     */
    public static final String ASSETS_REPORT_GENERATE_REPORT_DATA_CONSUMER = "ASSETS_REPORT_GENERATE_REPORT_DATA_CONSUMER";

    /**
     * 流标消息消费者组，由emergency消费消息生成上报数据
     */
    public static final String ASSETS_FAIL_TOPIC_GENERATE_REPORT_DATA_CONSUMER = "ASSETS_FAIL_TOPIC_GENERATE_REPORT_DATA_CONSUMER";

    /**
     * 资产结标消费者组，由emergency消费消息生成上报数据
     */
    public static final String ASSETS_CLOSE_GENERATE_REPORT_DATA_CONSUMER = "ASSETS_CLOSE_GENERATE_REPORT_DATA_CONSUMER";
    /**
     * 资产放款消费者组，由emergency消费消息生成上报数据
     */
    public static final String ASSETS_LOAN_TOPIC_GENERATE_REPORT_DATA_CONSUMER = "ASSETS_LOAN_TOPIC_GENERATE_REPORT_DATA_CONSUMER";

    /**
     * 绑定微信，奖励积分和经验值
     */
    public static final String USER_BIND_WECHAT_SEND_POINT_EXPERIENCE = "USER_BIND_WECHAT_SEND_POINT_EXPERIENCE";

    /**
     * service同步micro-user注册信息
     */
    public static final String SERVICE_SYNC_USER_REGISTER_CONSUMER = "SERVICE_SYNC_USER_REGISTER_CONSUMER";

    /**
     * service同步micro-user实名信息
     */
    public static final String SERVICE_SYNC_USER_REAL_NAME_AUTH_CONSUMER = "SERVICE_SYNC_USER_REAL_NAME_AUTH_CONSUMER";

    /**
     * service同步micro-user开户信息
     */
    public static final String SERVICE_SYNC_USER_OPEN_ACCOUNT_CONSUMER = "SERVICE_SYNC_USER_OPEN_ACCOUNT_CONSUMER";

    /**
     * service同步micro-user修改存管手机号信息
     */
    public static final String SERVICE_SYNC_USER_BANK_MOBILE_CONSUMER = "SERVICE_SYNC_USER_BANK_MOBILE_CONSUMER";

    /**
     * 购买成功银行回调，micro-biz-core使用
     */
    public static final String BUY_SUCCESS_GENERATE_CONSUMER = "BUY_SUCCESS_GENERATE_CONSUMER";

    /**
     * 主投投标购买失败消息，由micro-booking-order发出，主投业务消费
     */
    public static final String ORDER_BOOKING_ACTIVE_FAIL_CONSUMER = "ORDER_BOOKING_ACTIVE_FAIL_CONSUMER";

    /**
     * 主投投标成功，由biz-core处理后，下发消息再由主投业务消息
     */
    public static final String ORDER_BUY_ACTIVE_SUCCESS_CONSUMER = "ORDER_BUY_ACTIVE_SUCCESS_CONSUMER";

    /**
     * micro-user用户设置银行交易密码同步数据到service(micro-user)
     */
    public static final String SYNC_USER_SETTING_PASSWORD_CONSUMER = "SYNC_USER_SETTING_PASSWORD_CONSUMER";

    /**
     * service用户设置银行交易密码同步数据到micro-user(service)
     */
    public static final String SYNC_SERVICE_SETTING_PASSWORD_CONSUMER = "SYNC_SERVICE_SETTING_PASSWORD_CONSUMER";

    /**
     * 资产放款成功每一笔子订单触发发放延时券(micro-member)
     */
    public static final String ACT_ASSETS_LOAN_DELAY_COUPON_REWARD_CONSUMER = "ACT_ASSETS_LOAN_DELAY_COUPON_REWARD_CONSUMER";

    /**
     * 购买委托触发发放延时券(micro-member)
     */
    public static final String INVEST_DELAY_COUPON_REWARD_CONSUMER = "INVEST_DELAY_COUPON_REWARD_CONSUMER";

    /**
     * 资产放款成功每一笔子订单触发给邀请人发放延时券(micro-expand)
     */
    public static final String ACT_ASSETS_LOAN_BROKER_COUPON_REWARD_CONSUMER = "ACT_ASSETS_LOAN_BROKER_COUPON_REWARD_CONSUMER";

    /**
     * 购买委托触发给邀请人发放延时券(micro-expand)
     */
    public static final String INVEST_BROKER_COUPON_REWARD_CONSUMER = "INVEST_BROKER_COUPON_REWARD_CONSUMER";

    /**
     * 资产放款成功每一笔子订单触发达到累计年化给邀请人发放延时券(micro-expand)
     */
    public static final String ACT_ASSETS_LOAN_BROKER_CUMULATIVE_COUPON_REWARD_CONSUMER = "ACT_ASSETS_LOAN_BROKER_CUMULATIVE_COUPON_REWARD_CONSUMER";

    /**
     * 购买委托触发达到累计年化给邀请人发放延时券(micro-expand)
     */
    public static final String INVEST_BROKER_CUMULATIVE_COUPON_REWARD_CONSUMER = "INVEST_BROKER_CUMULATIVE_COUPON_REWARD_CONSUMER";

    /**
     * 黑鲸主动类订单购买成功，放款预处理消费组 用于micro-asset-start-loan
     */
    public static final String ACTIVE_SUCCESS_LOAN_PRETREATMENT_CONSUMER = "ACTIVE_SUCCESS_LOAN_PRETREATMENT_CONSUMER";

    /**
     * 同步service注册信息到micro-user，监听用户注册消息。(micro-user)
     */
    public static final String SYNC_SERVICE_REGISTER_TO_USER_CONSUMER = "SYNC_SERVICE_REGISTER_TO_USER_CONSUMER";

    /**
     * 活动下发奖励
     */
    public static final String ACTIVITY_LOWER_HAIR_REWARD_CONSUMER = "ACTIVITY_LOWER_HAIR_REWARD_CONSUMER";

    /**
     * 充值获得UP币，触发会员奖励 (micro-member)
     */
    public static final String RECHARGE_UP_COIN_MEMBER_REWARD_CONSUMER = "RECHARGE_UP_COIN_MEMBER_REWARD_CONSUMER";

    /**
     * 邀请注册，触发会员奖励 (micro-member)
     */
    public static final String INVITE_REGISTER_MEMBER_REWARD_CONSUMER = "INVITE_REGISTER_MEMBER_REWARD_CONSUMER";

    /**
     * 积分游戏，触发会员奖励 (micro-member)
     */
    public static final String POINT_GAME_SEND_POINT_EXPERIENCE = "POINT_GAME_SEND_POINT_EXPERIENCE";

    /**
     * 积分兑换，奖励积分和经验值
     */
    public static final String POINT_CONVERT_SEND_POINT_EXPERIENCE = "POINT_CONVERT_SEND_POINT_EXPERIENCE";

    /**
     * 主动购买积分奖励 (micro-member)
     */
    public static final String ACT_INVEST_MEMBER_POINT_CONSUMER = "ACT_INVEST_MEMBER_POINT_CONSUMER";

    /**
     * 委托续投积分奖励 (micro-member)
     */
    public static final String AUT_CONTINUE_INVEST_MEMBER_POINT_CONSUMER = "AUT_CONTINUE_INVEST_MEMBER_POINT_CONSUMER";
    /**
     * 用户分享up币，奖励积分和经验值
     */
    public static final String USER_SHARE_UP_COIN_SEND_POINT_EXPERIENCE = "USER_SHARE_UP_COIN_SEND_POINT_EXPERIENCE";

    /**
     * 放款成功受托划转（micro-asset-start-loan）
     */
    public static final String LOAN_TRUSTFUL_TRANS_CONSUMER = "LOAN_TRUSTFUL_TRANS_CONSUMER";

    /**
     * 放款成功生成提现申请（micro-asset-start-loan）
     */
    public static final String LOAN_WITHDRAW_APPLY_CONSUMER = "LOAN_WITHDRAW_APPLY_CONSUMER";

    /**
     * 充值查询 (service)
     */
    public static final String RECHARGE_QUERY_CONSUMER = "RECHARGE_QUERY_CONSUMER";

    /**
     * 推荐注册会员奖励(micro-member)
     */
    public static final String RECOMMEND_REGISTER_MEMBER_REWARD_CONSUMER = "RECOMMEND_REGISTER_MEMBER_REWARD_CONSUMER";

    /**
     * crs监听用户投资
     */
    public static final String CRS_USER_INVEST_CONSUMER = "CRS_USER_INVEST_CONSUMER";

    /**
     * crs监听订单分享
     */
    public static final String CRS_ORDER_SHARE_CONSUMER = "CRS_ORDER_SHARE_CONSUMER";

    /**
     * 直接转账、挂账清分成功(assets)
     */
    public static final String RECHARGE_TRANS_CLEARING_CONSUMER = "RECHARGE_TRANS_CLEARING_CONSUMER";

    /**
     * 购买触发给邀请人发放摇一摇奖励(micro-member)
     */
    public static final String INVITE_INVEST_SHAKE_NUMBER_REWARD_CONSUMER = "INVITE_INVEST_SHAKE_NUMBER_REWARD_CONSUMER";
    /**
     * 放款成功发送消息给micro-order(micro-asset-start-loan)
     */
    public static final String ASSETS_LOAN_SUCCESS_NOTIFY_ORDER_CONSUMER = "ASSETS_LOAN_SUCCESS_NOTIFY_ORDER_CONSUMER";

    /**
     * 放款成功发送消息给xiangshang-las通知捷越(micro-asset-start-loan)
     */
    public static final String ASSETS_LOAN_SUCCESS_NOTIFY_LAS_CONSUMER = "ASSETS_LOAN_SUCCESS_NOTIFY_LAS_CONSUMER";

    /**
     * 放款成功发送消息给micro-agreement(micro-asset-start-loan)
     */
    public static final String ASSETS_LOAN_SUCCESS_NOTIFY_AGREEMENT_CONSUMER = "ASSETS_LOAN_SUCCESS_NOTIFY_AGREEMENT_CONSUMER";

    /**
     * 放款成功发送消息给micro-operation(micro-asset-start-loan)
     */
    public static final String ASSETS_LOAN_SUCCESS_NOTIFY_OPERATION_CONSUMER = "ASSETS_LOAN_SUCCESS_NOTIFY_OPERATION_CONSUMER";

    /**
     * 放款成功发送消息给micro-member(micro-asset-start-loan)
     */
    public static final String ASSETS_LOAN_SUCCESS_NOTIFY_MEMBER_CONSUMER = "ASSETS_LOAN_SUCCESS_NOTIFY_MEMBER_CONSUMER";
    /**
     * SERVICE 充值发站内信
     */
    public static final String SERVICE_RECHARGE_SEND_MSG_CONSUMER="SERVICE_RECHARGE_SEND_MSG_CONSUMER";
    /**
     * SERVICE 提现发站内信
     */
    public static final String SERVICE_WITHDRAW_SEND_MSG_CONSUMER="SERVICE_WITHDRAW_SEND_MSG_CONSUMER";


    /**
     * 资产放款消费者组，由emergency消费消息生成中互金统计监测系统上报数据
     */
    public static final String ASSETS_LOAN_CHINA_MONITOR_CONSUMER = "ASSETS_LOAN_CHINA_MONITOR_CONSUMER";
    /**
     * 资产还款子申请还款完成消费者组，由emergency消费消息生成中互金统计监测系统上报数据
     */
    public static final String SUB_REPAY_APPLY_REPAID_CHINA_MONITOR_CONSUMER = "SUB_REPAY_APPLY_REPAID_CHINA_MONITOR_CONSUMER";
    /**
     * 转让订单成功消费者组，由emergency消费消息生成中互金统计监测系统上报数据
     */
    public static final String AGREEMENT_EVENT_NORMAL_CHINA_MONITOR_CONSUMER = "AGREEMENT_EVENT_NORMAL_TOPIC_CHINA_MONITOR_CONSUMER";
    /**
     * 资产上报Assets生成匹配池数据消费者组
     */
    public static final String ASSETS_REPORT_GENERATE_MATCH_POOL_CONSUMER = "ASSETS_REPORT_GENERATE_MATCH_POOL_CONSUMER";

    /**
     * 资产上报之后，初始化扣费额度
     */
    public static final String ASSETS_REPORT_DEDUCT_INIT_CONSUMER = "ASSETS_REPORT_DEDUCT_INIT_CONSUMER";

    /**
     * 通知三方银行处理结果
     */
    public static final String NOTIFY_THIRD_BANK_RESULT_CONSUMER = "NOTIFY_THIRD_BANK_RESULT_CONSUMER";

    /**
     * 消费结标消息，通知三方
     */
    public static final String THIRD_NOTICE_ASSETS_CLOSE_REPAY_TOPIC_CONSUMER = "THIRD_NOTICE_ASSETS_CLOSE_REPAY_TOPIC_CONSUMER";

    /**
     * 资产放款消费者组，由emergency消费消息生成中互金统计监测系统上报数据
     */

    /**
     * 单笔站内信消费者组
     */
    public static final String ISSUE_SINGLE_SYSTEM_MESSAGE_CONSUMER = "ISSUE_SINGLE_SYSTEM_MESSAGE_CONSUMER";

    /**
     * 多笔站内信消费者组
     */
    public static final String ISSUE_MULTI_SYSTEM_MESSAGE_CONSUMER = "ISSUE_MULTI_SYSTEM_MESSAGE_CONSUMER";

    /**
     * 更新站内信消费者组
     */
    public static final String READ_SYSTEM_MESSAGE_CONSUMER = "READ_SYSTEM_MESSAGE_CONSUMER";

    /**
     * micro-activity 同步委托订单退出消息
     */
    public static final String ACTIVITY_AUTHORIZE_ORDER_EXIT_CONSUMER = "ACTIVITY_AUTHORIZE_ORDER_EXIT_CONSUMER";

    /**
     * micro-activity 同步委托订单新购消息
     */
    public static final String ACTIVITY_AUTHORIZE_ORDER_PURCHASING_CONSUMER = "ACTIVITY_AUTHORIZE_ORDER_PURCHASING_CONSUMER";


    /**
     * 分享会员日得积分
     */
    public static final String SHARE_MEMBER_DAY_CONSUMER = "SHARE_MEMBER_DAY_CONSUMER";

    /**
     * 会员日积分商城兑换反积分
     */
    public static final String MEMBER_DAY_RETURN_POINT_CONSUMER = "MEMBER_DAY_RETURN_POINT_CONSUMER";

    /**
     * 续投合并子订单推送到匹配申请
     */
    public static final String CONTINUE_MERGE_LOAN_FOR_MATCH_CONSUMER = "CONTINUE_MERGE_LOAN_FOR_MATCH_CONSUMER";
    /**
     * 委托订单部分退出申请
     */
    public static final String AUT_ORDER_PART_EXIT_CONSUMER = "AUT_ORDER_PART_EXIT_CONSUMER";
   }


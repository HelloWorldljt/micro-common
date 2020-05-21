package com.xs.micro.common.rocketmq.topic;

/****
 @description RocketMQ topic 定义
 @author tanyuanpeng
 @date 2019/3/22    16:36 
 ****/
public class Topic {

    /**
     * 资产流标TOPIC 由micro-biz-core 发出消息
     */
    public final static String ASSETS_FAIL_TOPIC = "ASSETS_FAIL_TOPIC";

    /**
     * 订单取消挂牌TOPIC 由micro-biz-core 发出消息
     */
    public final static String ORDER_CANCEL_TRANSFER_TOPIC = "ORDER_CANCEL_TRANSFER_TOPIC";

    /**
     * 购买订单失败TOPIC 由micro-biz-core 发出消息
     */
    public final static String ORDER_BUY_FAILURE_TOPIC = "ORDER_BUY_FAILURE_TOPIC";

    /**
     * 购买订单成功TOPIC 由micro-biz-core 发出消息
     */
    public final static String ORDER_BUY_SUCCESS_TOPIC = "ORDER_BUY_SUCCESS_TOPIC";

    /**
     * 还款结标通知TOPIC 由micro-repay发出消息
     */
    public static final String ASSETS_CLOSE_REPAY_TOPIC = "ASSETS_CLOSE_REPAY_TOPIC";

    /**
     * 主动类订单还款完成TOPIC 由micro-repay发出消息 micro-order进行消费
     */
    public static final String ACT_REPAY_TOPIC = "ACT_REPAY_TOPIC";

    /**
     * 资产放款 topic消息(不区分主投、委托，在micro-asset-start-loan发布)
     */
    public static final String ASSETS_LOAN_TOPIC = "ASSETS_LOAN_TOPIC";

    /**
     * 主投资产放款后处理
     */
    public static final String ACT_ASSETS_LOAN_TOPIC = "ACT_ASSETS_LOAN_TOPIC";


    /**************************产品端发送rocketmq topic定义 begin*****************************************/
    /**
     * 用户注册
     */
    public static final String USER_REGIST_TOPIC = "USER_REGIST_TOPIC";

    /**
     * 用户投资（产品端购买流程下发消息，包括委托、场景理财产品；主投、散标购买也会发消息，但一般奖励是在主投资产放款后发）
     */
    public static final String USER_INVEST_TOPIC = "USER_INVEST_TOPIC";

    /**
     * 用户实名
     */
    public static final String REAL_NAME_AUTH_TOPIC = "REAL_NAME_AUTH_TOPIC";

    /**
     * 用户绑卡
     */
    public static final String USER_BIND_CARD_TOPIC = "USER_BIND_CARD_TOPIC";

    /**
     * 用户充值
     */
    public static final String USER_RECHARGE_TOPIC = "USER_RECHARGE_TOPIC";

    public static final String USER_WITHDRAW_TOPIC = "USER_WITHDRAW_TOPIC";

    /**
     * 用户每日签到、补签
     */
    public static final String USER_DAILY_SIGN_TOPIC = "USER_DAILY_SIGN_TOPIC";

    /**
     * 前端后端订单收益校验消息，由service 发送，micro-operation消费
     */
    public static final String FRONT_AND_BACK_INCOME_CHECK_TOPIC = "FRONT_AND_BACK_INCOME_CHECK_TOPIC";

    /**
     * 虚拨订单购买
     */
    public static final String VIRTUAL_INVEST_TOPIC = "VIRTUAL_INVEST_TOPIC";

    /**
     * 用户摇一摇
     */
    public static final String USER_SHAKE = "USER_SHAKE";

    /**************************产品端发送rocketmq topic定义 end*****************************************/

    /**
     *合同管理优先topic
     */
    public static final String AGREEMENT_EVENT_PRIORITY_TOPIC = "AGREEMENT_EVENT_PRIORITY_TOPIC";
    /**
     *合同管理普通topic
     */
    public static final String AGREEMENT_EVENT_NORMAL_TOPIC = "AGREEMENT_EVENT_NORMAL_TOPIC";

    /**************************member 发布rocketmq消息 topic定义 begin*****************************************/

    /**
     * 下发优惠券(事务消息示例临时使用)
     */
    public static final String ISSUE_COUPON_TOPIC = "ISSUE_COUPON_TOPIC";

    /**************************member 发布rocketmq消息 topic定义 end*****************************************/

    /**
     * 扣费系统，扣费明细回写消息，由扣费方发出消息，micro-operation消费
     */
    public static final String DEDUCT_DETAIL_RECEIVER_TOPIC = "DEDUCT_DETAIL_RECEIVER_TOPIC";

    /**
     * 赚取积分（活动等下发积分消息）
     */
    public static final String EARN_POINT_TOPIC = "EARN_POINT_TOPIC";

    /**
     * 用户邀请好友投资发布消息（micro-expand)
     */
    public static final String USER_INVITE_INVEST_TOPIC = "USER_INVITE_INVEST_TOPIC";

    /**
     * 用户首次绑定微信公众号
     */
    public static final String USER_FIRST_BIND_WECHAT = "USER_FIRST_BIND_WECHAT";

    /**
     * 资产进件发送消息主题，现在由assets发出
     */
    public static final String ASSETS_REPORT_PUBLISH_TOPIC = "ASSETS_REPORT_PUBLISH_TOPIC";

    /**
     * service修改存管手机号同步到micro-user
     */
    public static final String SYNC_SERVICE_BANK_MOBILE_TOPIC="SYNC_SERVICE_BANK_MOBILE_TOPIC";

    /**
     * service 开户同步到micro-user
     */
    public static final String SYNC_SERVICE_OPEN_BANK_ACCOUNT_TOPIC="SYNC_SERVICE_OPEN_BANK_ACCOUNT_TOPIC";
    /**
     * service 激活存管账户同步刀micro-user
     */
    public static final String SYNC_SERVICE_ACTIVATE_BANK_ACCOUNT_TOPIC="SYNC_SERVICE_ACTIVATE_BANK_ACCOUNT_TOPIC";

    /**
     * 授权类产品采购单下单成功消息(micro-booking-order)
     */
    public static final String BOOKING_AUTHORIZE_SUCCESS_TOPIC = "BOOKING_AUTHORIZE_SUCCESS_TOPIC";

    /**
     * 项目投标类产品采购单下单成功消息(micro-booking-order)
     */
    public static final String BOOKING_ACTIVE_SUCCESS_TOPIC = "BOOKING_ACTIVE_SUCCESS_TOPIC";

    /**
     * 项目投标类产品采购单下单失败消息(micro-booking-order)
     */
    public static final String BOOKING_ACTIVE_FAIL_TOPIC = "BOOKING_ACTIVE_FAIL_TOPIC";

    /**
     * micro-user用户注册成功同步数据到service(micro-user)
     */
    public static final String SYNC_USER_REGISTER_TOPIC = "SYNC_USER_REGISTER_TOPIC";

    /**
     * micro-user用户实名成功同步数据到service(micro-user)
     */
    public static final String SYNC_USER_REAL_NAME_AUTH_TOPIC = "SYNC_USER_REAL_NAME_AUTH_TOPIC";

    /**
     * micro-user用户开户成功同步数据到service(micro-user)
     */
    public static final String SYNC_USER_OPEN_ACCOUNT_TOPIC = "SYNC_USER_OPEN_ACCOUNT_TOPIC";

    /**
     * micro-user用户存管手机号修改成功同步数据到service(micro-user)
     */
    public static final String SYNC_USER_BANK_MOBILE_TOPIC = "SYNC_USER_BANK_MOBILE_TOPIC";

    /**
     * 黑鲸购买订单成功TOPIC 由micro-biz-core 发出消息
     */
    public final static String ORDER_BUY_ACTIVE_SUCCESS_TOPIC = "ORDER_BUY_ACTIVE_SUCCESS_TOPIC";

    /**
     * 黑鲸购买订单成功修改匹配池扣减份额TOPIC 由micro-biz-core 发出消息
     */
    public final static String ORDER_DEDUCT_MATCH_POOL_TOPIC = "ORDER_DEDUCT_MATCH_POOL_TOPIC";

    /**
     * micro-user用户设置银行交易密码同步数据到service(micro-user)
     */
    public static final String SYNC_USER_SETTING_PASSWORD_TOPIC = "SYNC_USER_SETTING_PASSWORD_TOPIC";

    /**
     * service用户设置银行交易密码同步数据到micro-user(service)
     */
    public static final String SYNC_SERVICE_SETTING_PASSWORD_TOPIC = "SYNC_SERVICE_SETTING_PASSWORD_TOPIC";

   /**
     * 用户订单续投投资（再增利/授权新方案），通知member完成每日任务
     */
    public static final String USER_CONTINUE_INVEST_TOPIC = "USER_CONTINUE_INVEST_TOPIC";

    /**
     * 首充获up币，通知member完成每日任务
     */
    public static final String USER_RECHARGE_UP_COIN_TOPIC = "USER_RECHARGE_UP_COIN_TOPIC";

    /**
     * 积分兑换，通知member完成每日任务
     */
    public static final String POINT_CONVERT_TOPIC = "POINT_CONVERT_TOPIC";

    /**
     * up币分享，通知member完成每日任务
     */
    public static final String UP_COIN_SHARE_TOPIC = "UP_COIN_SHARE_TOPIC";

    /**
     * 积分游戏，通知member完成每日任务
     */
    public static final String POINT_GAME_TOPIC = "POINT_GAME_TOPIC";

    /**
     * 活动下发奖励(micro-activity)
     */
    public static final String ACTIVITY_LOWER_HAIR_REWARD_TOPIC = "ACTIVITY_LOWER_HAIR_REWARD_TOPIC";

    /**
     * 异步回调三方通知发送消息主题（asset）
     */
    public static final String NOTIFY_THIRD_BANK_RESULT_PUBLISH_TOPIC = "NOTIFY_THIRD_BANK_RESULT_PUBLISH_TOPIC";
    /**
     * 充值查询 (service)
     */
    public static final String RECHARGE_QUERY_TOPIC = "RECHARGE_QUERY_TOPIC";

    /**
     * 直接转账、挂账清分成功MQ (assets)
     */
    public static final String RECHARGE_TRANS_CLEARING_TOPIC = "RECHARGE_TRANS_CLEARING_TOPIC";

    /**
     * 订单详情页面分享mq提示大数据（service）
     */
    public static final String ORDER_SHARE_TOPIC = "ORDER_SHARE_TOPIC";

    /**
     * 放款成功统一发送消息(micro-asset-start-loan)
     */
    public static final String ASSETS_LOAN_SUCCESS_NOTIFY_TOPIC = "ASSETS_LOAN_SUCCESS_NOTIFY_TOPIC";
    /**
     * pay 充值结果topic
     */
    public static final String PAY_RECHARGE_RESULT_TOPIC="PAY_RECHARGE_RESULT_TOPIC";
    /**
     * pay 提现结果topic
     */
    public static final String PAY_WITHDRAW_RESULT_TOPIC="PAY_WITHDRAW_RESULT_TOPIC";

    /**
     * 还款子申请还款完成通知TOPIC 由micro-repay发出消息
     */
    public static final String SUB_REPAY_APPLY_REPAID_TOPIC = "SUB_REPAY_APPLY_REPAID_TOPIC";

    /**
     * 单笔下发站内信
     */
    public static final String ISSUE_SINGLE_SYSTEM_MESSAGE_TOPIC = "ISSUE_SINGLE_SYSTEM_MESSAGE_TOPIC";

    /**
     * 下发多条站内信
     */
    public static final String ISSUE_MULTI_SYSTEM_MESSAGE_TOPIC = "ISSUE_MULTI_SYSTEM_MESSAGE_TOPIC";

    /**
     * 设置站内信已读
     */
    public static final String READ_SYSTEM_MESSAGE_TOPIC = "READ_SYSTEM_MESSAGE_TOPIC";

    /**
     * 委托类订单退出通知(service)
     */
    public static final String AUTHORIZE_ORDER_SERVICE_EXIT_TOPIC = "AUTHORIZE_ORDER_SERVICE_EXIT_TOPIC";

    /**
     * 被邀请人有效投资topic（micro-expand)
     */
    public static final String INVITED_USER_EFFECT_INVEST_TOPIC = "INVITED_USER_EFFECT_INVEST_TOPIC";

    /**
     * 分享会员日，通知member下发积分并记录
     */
    public static final String SHARE_MEMBER_DAY_TOPIC = "SHARE_MEMBER_DAY_TOPIC";

    /**
     * 会员日积分商城兑换成功，通知member返还积分并记录
     */
    public static final String MEMBER_DAY_RETURN_POINT_TOPIC = "MEMBER_DAY_RETURN_POINT_TOPIC";

    /**
     * 续投合并子订单推送到匹配申请
     */
    public static final String CONTINUE_MERGE_LOAN_FOR_MATCH_TOPIC = "CONTINUE_MERGE_LOAN_FOR_MATCH_TOPIC";
    /**
     * 部分退出
     */
    public static final String AST_RELEASE_TOPIC = "AST_RELEASE_TOPIC";
}

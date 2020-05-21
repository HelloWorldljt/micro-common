package com.xs.micro.common.rocketmq.transaction;

/**
 * 定义rocketmq事务消息组
 * 定义：{BUSINESS}_TX (业务标识_TX前缀）
 *
 * @author chenrg
 * @date 2019/5/22
 */
public class TransactionGroup {

    /**
     * 每日签到事务消息组
     */
    public static final String TX_DAILY_SIGN_TX = "DAILY_SIGN_TX";

    /**
     * micro-user用户注册成功同步数据到service(micro-user)事务消息组
     */
    public static final String SYNC_USER_REGISTER_TX = "SYNC_USER_REGISTER_TX";

    /**
     * micro-user用户实名成功同步数据到service(micro-user)事务消息组
     */
    public static final String SYNC_USER_REAL_NAME_AUTH_TX = "SYNC_USER_REAL_NAME_AUTH_TX";

    /**
     * micro-user用户开户成功同步数据到service(micro-user)事务消息组
     */
    public static final String SYNC_USER_OPEN_ACCOUNT_TX = "SYNC_USER_OPEN_ACCOUNT_TX";

    /**
     * micro-user用户存管手机号修改成功同步数据到service(micro-user)事务消息组
     */
    public static final String SYNC_USER_BANK_MOBILE_TX = "SYNC_USER_BANK_MOBILE_TX";
}

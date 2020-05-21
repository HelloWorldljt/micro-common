package com.xs.micro.common.rocketmq.producer;

/**
 * 定义rocketmq生产者组
 * @author chenrg
 * @date 2019/4/18
 */
public class ProducerGroup {


    /**************************产品端发送rocketmq producer定义 begin*****************************************/

    /**
     * 产品端生产者组
     */
    public static final String PORTAL_PRODUCER_GROUP = "PORTAL_PRODUCER_GROUP";

    /**************************产品端发送rocketmq producer定义 end*****************************************/

    /**
     * 放款成功生产者组
     */
    public static final String LOAN_SUCCESS_PRODUCER_GROUP = "LOAN_SUCCESS_PRODUCER_GROUP";

    /**
     * 部分退出生产者组
     */
    public static final String AST_RELEASE_PRODUCER_GROUP = "AST_RELEASE_PRODUCER_GROUP";

}

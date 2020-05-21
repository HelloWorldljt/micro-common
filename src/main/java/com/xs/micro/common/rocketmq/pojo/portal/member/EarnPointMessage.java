package com.xs.micro.common.rocketmq.pojo.portal.member;

import com.xs.micro.common.idempotent.IdempotentBizType;
import com.xs.micro.common.idempotent.IdempotentKey;

import java.io.Serializable;

/**
 * 赚取积分、经验值消息，baseEntity
 *
 * @author chenrg
 * @date 2019/4/24
 */
public class EarnPointMessage implements Serializable {

    private static final long serialVersionUID = -7905465890449525445L;

    /**
     * 用户编号
     */
    private Integer userId;
    /**
     * 赚取的积分
     */
    private Integer earnPoint;

    /**
     * 业务幂等key
     */
    private IdempotentKey bizKey;

    /**
     * 积分记录类型
     */
    private String memberPointLogType;

    /**
     * 积分用途
     */
    private String content;



    public EarnPointMessage() {

    }

    public EarnPointMessage(Integer userId, Integer earnPoint, IdempotentKey bizKey, String memberPointLogType, String content) {
        this.userId = userId;
        this.earnPoint = earnPoint;
        this.bizKey = bizKey;
        this.memberPointLogType = memberPointLogType;
        this.content = content;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getEarnPoint() {
        return earnPoint;
    }

    public void setEarnPoint(Integer earnPoint) {
        this.earnPoint = earnPoint;
    }

    public IdempotentKey getBizKey() {
        return bizKey;
    }

    public void setBizKey(IdempotentKey bizKey) {
        this.bizKey = bizKey;
    }

    public String getMemberPointLogType() {
        return memberPointLogType;
    }

    public void setMemberPointLogType(String memberPointLogType) {
        this.memberPointLogType = memberPointLogType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

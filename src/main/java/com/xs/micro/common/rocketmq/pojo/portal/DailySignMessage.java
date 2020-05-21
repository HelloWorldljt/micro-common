package com.xs.micro.common.rocketmq.pojo.portal;

import java.io.Serializable;
import java.util.Date;

/**
 * 每日签到消息
 *
 * @author chenrg
 * @date 2019/5/5
 */
public class DailySignMessage implements Serializable {

    private static final long serialVersionUID = 7871503278670788739L;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 连续签到天数
     */
    private int continueSignDays;

    /**
     * 是否补签
     */
    private boolean supplemented;

    /**
     * 每日任务类型
     */
    private String userDailyType;

    /**
     * 签到日期
     */
    private Date signDate;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public int getContinueSignDays() {
        return continueSignDays;
    }

    public void setContinueSignDays(int continueSignDays) {
        this.continueSignDays = continueSignDays;
    }

    public boolean isSupplemented() {
        return supplemented;
    }

    public void setSupplemented(boolean supplemented) {
        this.supplemented = supplemented;
    }

    public String getUserDailyType() {
        return userDailyType;
    }

    public void setUserDailyType(String userDailyType) {
        this.userDailyType = userDailyType;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }
}

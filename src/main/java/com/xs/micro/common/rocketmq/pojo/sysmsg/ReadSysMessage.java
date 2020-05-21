package com.xs.micro.common.rocketmq.pojo.sysmsg;

import java.io.Serializable;

/**
 * 设置站内信已读
 *
 * @author chenrg
 * Created at 2019/12/11 14:47
 **/
public class ReadSysMessage implements Serializable {


    private static final long serialVersionUID = -6316056928011620760L;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 按月分表，年月。例：201912
     */
    private Integer monthly;

    public ReadSysMessage() {

    }

    public ReadSysMessage(Integer userId) {
        this.userId = userId;
    }

    public ReadSysMessage(Integer userId, Integer monthly) {
        this.userId = userId;
        this.monthly = monthly;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMonthly() {
        return monthly;
    }

    public void setMonthly(Integer monthly) {
        this.monthly = monthly;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ReadSysMessage{");
        sb.append("userId=").append(userId);
        sb.append(", monthly=").append(monthly);
        sb.append('}');
        return sb.toString();
    }
}

package com.xs.micro.common.rocketmq.pojo.portal;

import java.io.Serializable;

/**
 * 修改手机号消息
 * @author duanz
 * @date 2019-08-01
 */
public class ChangeMobileMessage implements Serializable {
    private Integer userId;
    private String mobile;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "ChangeMobileMessage{" +
                "userId=" + userId +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}

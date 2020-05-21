package com.xs.micro.common.rocketmq.pojo.portal;

import java.io.Serializable;

/**
 * 实名认证消息
 *
 * @author chenrg
 * @date 2019/4/24
 */
public class NameAuthMessage implements Serializable {

    private static final long serialVersionUID = -1656674405253345874L;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户注册渠道
     */
    private String utmSource;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUtmSource() {
        return utmSource;
    }

    public void setUtmSource(String utmSource) {
        this.utmSource = utmSource;
    }
}

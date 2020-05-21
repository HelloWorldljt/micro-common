package com.xs.micro.common.rocketmq.pojo.portal;

import java.io.Serializable;

/**
 * 绑卡消息
 *
 * @author chenrg
 * @date 2019/4/29
 */
public class BindCardMessage implements Serializable {

    private static final long serialVersionUID = 8217476835611661842L;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 绑卡时间
     */
    private String timestamp;

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

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getUtmSource() {
        return utmSource;
    }

    public void setUtmSource(String utmSource) {
        this.utmSource = utmSource;
    }
}

package com.xs.micro.common.rocketmq.pojo.member;

import java.io.Serializable;
import java.util.Date;

/**
 * 摇一摇获取消息体
 *
 * @author zhaojianjun
 * @date 2019-6-24
 */
public class ShakeMessage implements Serializable {

    //用户ID
    private Integer userId;
    //摇一摇次数
    private Integer shakenum;
    //获取日志
    private Date date;
    //操作类型
    private String type;
    //备注
    private String remarkJson;
    //业务流水号
    private String idempotentKey;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShakenum() {
        return shakenum;
    }

    public void setShakenum(Integer shakenum) {
        this.shakenum = shakenum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRemarkJson() {
        return remarkJson;
    }

    public void setRemarkJson(String remarkJson) {
        this.remarkJson = remarkJson;
    }

    public String getIdempotentKey() {
        return idempotentKey;
    }

    public void setIdempotentKey(String idempotentKey) {
        this.idempotentKey = idempotentKey;
    }

}

package com.xs.micro.common.rocketmq.pojo.portal;

import java.io.Serializable;

/**
 * 用户开户message
 * @author duanz
 * @date 2019-08-01
 */
public class BankOpenAccountMessage implements Serializable {


    private Integer userId;

    private String bankUserId;

    private String bankMobile;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public String getBankUserId() {
        return bankUserId;
    }

    public void setBankUserId(String bankUserId) {
        this.bankUserId = bankUserId;
    }



    public String getBankMobile() {
        return bankMobile;
    }

    public void setBankMobile(String bankMobile) {
        this.bankMobile = bankMobile;
    }


    @Override
    public String toString() {
        return "BankOpenAccountMessage{" +
                "userId=" + userId +
                ", bankUserId='" + bankUserId + '\'' +
                ", bankMobile='" + bankMobile + '\'' +
                '}';
    }
}

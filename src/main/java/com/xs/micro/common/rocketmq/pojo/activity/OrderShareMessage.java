package com.xs.micro.common.rocketmq.pojo.activity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author chenrg
 * Created at 2019/8/22 11:08
 **/
public class OrderShareMessage implements Serializable {

    private static final long serialVersionUID = 40030243830369783L;

    /**
     * 订单ID
     */
    private String busOrderNo;

    /**
     * 分享时间
     */
    private Date shareTime;

    public String getBusOrderNo() {
        return busOrderNo;
    }

    public void setBusOrderNo(String busOrderNo) {
        this.busOrderNo = busOrderNo;
    }

    public Date getShareTime() {
        return shareTime;
    }

    public void setShareTime(Date shareTime) {
        this.shareTime = shareTime;
    }
}

package com.xs.micro.common.rocketmq.pojo.booking;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单所使用资源信息
 *
 * @author chenrg
 * Created at 2019/8/5 14:45
 **/
public class OrderResource implements Serializable {

    private static final long serialVersionUID = 7836759293972930329L;

    /**
     * 资源ID
     */
    private Integer resourceId;

    /**
     * 资源类型
     */
    private String resourceType;

    /**
     * 资源值
     */
    private BigDecimal resourceValue;

    /**
     * 额外信息参数，用于透传给使用资源的服务
     */
    private String extra;

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public BigDecimal getResourceValue() {
        return resourceValue;
    }

    public void setResourceValue(BigDecimal resourceValue) {
        this.resourceValue = resourceValue;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}

package com.xs.micro.common.rocketmq.pojo.booking;

/**
 * @author chenrg
 * Created at 2019/8/19 9:59
 **/
public class ActOrderFailMessage extends BaseOrderMessage {

    private static final long serialVersionUID = 7480812945146958467L;

    /**
     * 资产ID
     */
    private Integer astOriginId;

    public Integer getAstOriginId() {
        return astOriginId;
    }

    public void setAstOriginId(Integer astOriginId) {
        this.astOriginId = astOriginId;
    }
}

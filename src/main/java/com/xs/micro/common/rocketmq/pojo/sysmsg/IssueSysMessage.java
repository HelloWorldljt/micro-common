package com.xs.micro.common.rocketmq.pojo.sysmsg;

import java.io.Serializable;
import java.util.Date;

/**
 * 下发站内信
 *
 * @author chenrg
 * Created at 2019/12/11 14:31
 **/
public class IssueSysMessage implements Serializable {

    private static final long serialVersionUID = -4973288098813761383L;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 消息标题
     */
    private String messageTitle;

    /**
     * 消息内容
     */
    private String messageComments;

    /**
     * 消息类型
     */
    private String type;

    /**
     * 消息关联的业务id
     */
    private String contentId;

    /**
     * 发送时间
     */
    private Date sendTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String creater;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新人
     */
    private String updater;

    /**
     * 业务流水号，作幂等拦截使用
     */
    private String busOrderNo;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public String getMessageComments() {
        return messageComments;
    }

    public void setMessageComments(String messageComments) {
        this.messageComments = messageComments;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getBusOrderNo() {
        return busOrderNo;
    }

    public void setBusOrderNo(String busOrderNo) {
        this.busOrderNo = busOrderNo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("IssueSysMessage{");
        sb.append("userId=").append(userId);
        sb.append(", messageTitle='").append(messageTitle).append('\'');
        sb.append(", messageComments='").append(messageComments).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", contentId='").append(contentId).append('\'');
        sb.append(", sendTime=").append(sendTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", creater='").append(creater).append('\'');
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updater='").append(updater).append('\'');
        sb.append(", busOrderNo='").append(busOrderNo).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /**
     * 生成关键字段字符串，兼容使用。后续不要用
     *
     * @return
     */
    @Deprecated
    public String digest() {
        StringBuffer sb = new StringBuffer("");
        sb.append(userId).append("&").append(type).append("&").append(messageTitle).append("&").append(messageComments)
                .append("&").append(contentId).append("&").append(createTime);
        return sb.toString();
    }

}

package com.xs.micro.common.rocketmq.pojo.sysmsg;

import java.io.Serializable;
import java.util.List;

/**
 * 多笔站内信下发
 *
 * @author chenrg
 * Created at 2019/12/11 15:31
 **/
public class IssueMultiSysMessage implements Serializable {

    private static final long serialVersionUID = -1036632539886764726L;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 多笔消息
     */
    private List<IssueSysMessage> messageList;

    public IssueMultiSysMessage() {

    }

    public IssueMultiSysMessage(String batchNo, List<IssueSysMessage> messageList) {
        this.batchNo = batchNo;
        this.messageList = messageList;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public List<IssueSysMessage> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<IssueSysMessage> messageList) {
        this.messageList = messageList;
    }
}

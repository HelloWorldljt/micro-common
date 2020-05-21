package com.xs.micro.common.rocketmq.pojo.booking;

/**
 * 授权类采购单下单成功消息
 *
 * @author chenrg
 * Created at 2019/8/5 14:20
 **/
public class AuthOrderMessage extends BaseOrderMessage {

    private static final long serialVersionUID = 4161479589953897350L;

    /**
     * 银行授权信息
     */
    private BankAuthInfo bankAuthInfo;

    public BankAuthInfo getBankAuthInfo() {
        return bankAuthInfo;
    }

    public void setBankAuthInfo(BankAuthInfo bankAuthInfo) {
        this.bankAuthInfo = bankAuthInfo;
    }
}

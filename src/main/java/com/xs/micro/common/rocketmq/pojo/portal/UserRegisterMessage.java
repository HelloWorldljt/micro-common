package com.xs.micro.common.rocketmq.pojo.portal;

import java.io.Serializable;

/**
 * 定义注册消息实体
 *
 * @author chenrg
 * @date 2019/4/23
 */
public class UserRegisterMessage implements Serializable {

    private static final long serialVersionUID = -9003520265094810695L;

    /**
     * 用户ID
     */
    private Integer id;

    private String mobile;

    private Integer recommendUserId;

    private String clientType;

    private String infoType;

    private String device;

    private String channel;

    private String regTime;

    private String userUtmSource;

    private String cookieChannelUrl;

    private String cookieRefer;

    private String cookieChannelNo;

    private String cookieDevice;

    private String cookieMedium;

    private String cookieTerm;

    private String cookieContent;

    private String cookieCampaign;

    private String cookieWd;

    private String cookieUid;

    private String cookieUuid;

    private String cookieFromPage;

    private Integer expandRedbagId;

    private String gyUid;

    private String gyToken;

    private String frameworkSource;

    private String idfa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getRecommendUserId() {
        return recommendUserId;
    }

    public void setRecommendUserId(Integer recommendUserId) {
        this.recommendUserId = recommendUserId;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getInfoType() {
        return infoType;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public String getUserUtmSource() {
        return userUtmSource;
    }

    public void setUserUtmSource(String userUtmSource) {
        this.userUtmSource = userUtmSource;
    }

    public String getCookieChannelUrl() {
        return cookieChannelUrl;
    }

    public void setCookieChannelUrl(String cookieChannelUrl) {
        this.cookieChannelUrl = cookieChannelUrl;
    }

    public String getCookieRefer() {
        return cookieRefer;
    }

    public void setCookieRefer(String cookieRefer) {
        this.cookieRefer = cookieRefer;
    }

    public String getCookieChannelNo() {
        return cookieChannelNo;
    }

    public void setCookieChannelNo(String cookieChannelNo) {
        this.cookieChannelNo = cookieChannelNo;
    }

    public String getCookieDevice() {
        return cookieDevice;
    }

    public void setCookieDevice(String cookieDevice) {
        this.cookieDevice = cookieDevice;
    }

    public String getCookieMedium() {
        return cookieMedium;
    }

    public void setCookieMedium(String cookieMedium) {
        this.cookieMedium = cookieMedium;
    }

    public String getCookieTerm() {
        return cookieTerm;
    }

    public void setCookieTerm(String cookieTerm) {
        this.cookieTerm = cookieTerm;
    }

    public String getCookieContent() {
        return cookieContent;
    }

    public void setCookieContent(String cookieContent) {
        this.cookieContent = cookieContent;
    }

    public String getCookieCampaign() {
        return cookieCampaign;
    }

    public void setCookieCampaign(String cookieCampaign) {
        this.cookieCampaign = cookieCampaign;
    }

    public String getCookieWd() {
        return cookieWd;
    }

    public void setCookieWd(String cookieWd) {
        this.cookieWd = cookieWd;
    }

    public String getCookieUid() {
        return cookieUid;
    }

    public void setCookieUid(String cookieUid) {
        this.cookieUid = cookieUid;
    }

    public String getCookieUuid() {
        return cookieUuid;
    }

    public void setCookieUuid(String cookieUuid) {
        this.cookieUuid = cookieUuid;
    }

    public String getCookieFromPage() {
        return cookieFromPage;
    }

    public void setCookieFromPage(String cookieFromPage) {
        this.cookieFromPage = cookieFromPage;
    }

    public Integer getExpandRedbagId() {
        return expandRedbagId;
    }

    public void setExpandRedbagId(Integer expandRedbagId) {
        this.expandRedbagId = expandRedbagId;
    }

    public String getGyUid() {
        return gyUid;
    }

    public void setGyUid(String gyUid) {
        this.gyUid = gyUid;
    }

    public String getGyToken() {
        return gyToken;
    }

    public void setGyToken(String gyToken) {
        this.gyToken = gyToken;
    }

    public String getFrameworkSource() {
        return frameworkSource;
    }

    public void setFrameworkSource(String frameworkSource) {
        this.frameworkSource = frameworkSource;
    }

    public String getIdfa() {
        return idfa;
    }

    public void setIdfa(String idfa) {
        this.idfa = idfa;
    }
}

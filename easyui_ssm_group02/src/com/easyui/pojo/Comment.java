package com.easyui.pojo;

import java.util.Date;

public class Comment {
    private Integer ecId;

    private String ecContent;

    private Date ecCreateTime;

    private String ecReply;

    private Date ecReplyTime;

    private String ecNickName;

    public Integer getEcId() {
        return ecId;
    }

    public void setEcId(Integer ecId) {
        this.ecId = ecId;
    }

    public String getEcContent() {
        return ecContent;
    }

    public void setEcContent(String ecContent) {
        this.ecContent = ecContent == null ? null : ecContent.trim();
    }

    public Date getEcCreateTime() {
        return ecCreateTime;
    }

    public void setEcCreateTime(Date ecCreateTime) {
        this.ecCreateTime = ecCreateTime;
    }

    public String getEcReply() {
        return ecReply;
    }

    public void setEcReply(String ecReply) {
        this.ecReply = ecReply == null ? null : ecReply.trim();
    }

    public Date getEcReplyTime() {
        return ecReplyTime;
    }

    public void setEcReplyTime(Date ecReplyTime) {
        this.ecReplyTime = ecReplyTime;
    }

    public String getEcNickName() {
        return ecNickName;
    }

    public void setEcNickName(String ecNickName) {
        this.ecNickName = ecNickName == null ? null : ecNickName.trim();
    }
}
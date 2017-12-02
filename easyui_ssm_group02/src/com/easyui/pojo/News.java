package com.easyui.pojo;

import java.util.Date;

public class News {
    private Integer enId;

    private String enTitle;

    private String enContent;

    private Date enCreateTime;

    public Integer getEnId() {
        return enId;
    }

    public void setEnId(Integer enId) {
        this.enId = enId;
    }

    public String getEnTitle() {
        return enTitle;
    }

    public void setEnTitle(String enTitle) {
        this.enTitle = enTitle == null ? null : enTitle.trim();
    }

    public String getEnContent() {
        return enContent;
    }

    public void setEnContent(String enContent) {
        this.enContent = enContent == null ? null : enContent.trim();
    }

    public Date getEnCreateTime() {
        return enCreateTime;
    }

    public void setEnCreateTime(Date enCreateTime) {
        this.enCreateTime = enCreateTime;
    }
}
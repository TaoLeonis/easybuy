package com.easyui.pojo;

public class Announcement {
    private Integer eaId;

    private String eaTitle;

    private String eaContent;

    public Integer getEaId() {
        return eaId;
    }

    public void setEaId(Integer eaId) {
        this.eaId = eaId;
    }

    public String getEaTitle() {
        return eaTitle;
    }

    public void setEaTitle(String eaTitle) {
        this.eaTitle = eaTitle == null ? null : eaTitle.trim();
    }

    public String getEaContent() {
        return eaContent;
    }

    public void setEaContent(String eaContent) {
        this.eaContent = eaContent == null ? null : eaContent.trim();
    }
}
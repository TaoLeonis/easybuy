package com.easyui.pojo;

import java.util.Date;

public class User {
    private String EU_USER_ID;

    private String EU_USER_NAME;

    private String EU_PASSWORD;

    private String EU_SEX;

    private Date EU_BIRTHDAY;

    private String EU_IDENTITY_CODE;

    private String EU_EMAIL;

    private String EU_MOBILE;

    private String EU_ADDRESS;

    private Integer EU_STATUS;

    private Integer EU_DELETE_STATUS;

    public String getEU_USER_ID() {
        return EU_USER_ID;
    }

    public void setEU_USER_ID(String EU_USER_ID) {
        this.EU_USER_ID = EU_USER_ID == null ? null : EU_USER_ID.trim();
    }

    public String getEU_USER_NAME() {
        return EU_USER_NAME;
    }

    public void setEU_USER_NAME(String EU_USER_NAME) {
        this.EU_USER_NAME = EU_USER_NAME == null ? null : EU_USER_NAME.trim();
    }

    public String getEU_PASSWORD() {
        return EU_PASSWORD;
    }

    public void setEU_PASSWORD(String EU_PASSWORD) {
        this.EU_PASSWORD = EU_PASSWORD == null ? null : EU_PASSWORD.trim();
    }

    public String getEU_SEX() {
        return EU_SEX;
    }

    public void setEU_SEX(String EU_SEX) {
        this.EU_SEX = EU_SEX == null ? null : EU_SEX.trim();
    }

    public Date getEU_BIRTHDAY() {
        return EU_BIRTHDAY;
    }

    public void setEU_BIRTHDAY(Date EU_BIRTHDAY) {
        this.EU_BIRTHDAY = EU_BIRTHDAY;
    }

    public String getEU_IDENTITY_CODE() {
        return EU_IDENTITY_CODE;
    }

    public void setEU_IDENTITY_CODE(String EU_IDENTITY_CODE) {
        this.EU_IDENTITY_CODE = EU_IDENTITY_CODE == null ? null : EU_IDENTITY_CODE.trim();
    }

    public String getEU_EMAIL() {
        return EU_EMAIL;
    }

    public void setEU_EMAIL(String EU_EMAIL) {
        this.EU_EMAIL = EU_EMAIL == null ? null : EU_EMAIL.trim();
    }

    public String getEU_MOBILE() {
        return EU_MOBILE;
    }

    public void setEU_MOBILE(String EU_MOBILE) {
        this.EU_MOBILE = EU_MOBILE == null ? null : EU_MOBILE.trim();
    }

    public String getEU_ADDRESS() {
        return EU_ADDRESS;
    }

    public void setEU_ADDRESS(String EU_ADDRESS) {
        this.EU_ADDRESS = EU_ADDRESS == null ? null : EU_ADDRESS.trim();
    }

    public Integer getEU_STATUS() {
        return EU_STATUS;
    }

    public void setEU_STATUS(Integer EU_STATUS) {
        this.EU_STATUS = EU_STATUS;
    }

    public Integer getEU_DELETE_STATUS() {
        return EU_DELETE_STATUS;
    }

    public void setEU_DELETE_STATUS(Integer EU_DELETE_STATUS) {
        this.EU_DELETE_STATUS = EU_DELETE_STATUS;
    }
}
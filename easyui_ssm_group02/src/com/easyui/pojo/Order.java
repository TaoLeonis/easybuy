package com.easyui.pojo;

import java.util.Date;

public class Order {
    private Integer eoId;

    private String eoUserId;

    private String eoUserName;

    private String eoUserAddress;

    private Date eoCreateTime;

    private Double eoCost;

    private String eoStatus;

    private String eoType;

    public Integer getEoId() {
        return eoId;
    }

    public void setEoId(Integer eoId) {
        this.eoId = eoId;
    }

    public String getEoUserId() {
        return eoUserId;
    }

    public void setEoUserId(String eoUserId) {
        this.eoUserId = eoUserId == null ? null : eoUserId.trim();
    }

    public String getEoUserName() {
        return eoUserName;
    }

    public void setEoUserName(String eoUserName) {
        this.eoUserName = eoUserName == null ? null : eoUserName.trim();
    }

    public String getEoUserAddress() {
        return eoUserAddress;
    }

    public void setEoUserAddress(String eoUserAddress) {
        this.eoUserAddress = eoUserAddress == null ? null : eoUserAddress.trim();
    }

    public Date getEoCreateTime() {
        return eoCreateTime;
    }

    public void setEoCreateTime(Date eoCreateTime) {
        this.eoCreateTime = eoCreateTime;
    }

    public Double getEoCost() {
        return eoCost;
    }

    public void setEoCost(Double eoCost) {
        this.eoCost = eoCost;
    }

    public String getEoStatus() {
        return eoStatus;
    }

    public void setEoStatus(String eoStatus) {
        this.eoStatus = eoStatus;
    }

    public String getEoType() {
        return eoType;
    }

    public void setEoType(String eoType) {
        this.eoType = eoType;
    }
}
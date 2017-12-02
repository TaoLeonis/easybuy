package com.easyui.pojo;

public class Image {
    private Integer eiPid;

    private String eiPicture;

    private String eiUserid;

    public Integer getEiPid() {
        return eiPid;
    }

    public void setEiPid(Integer eiPid) {
        this.eiPid = eiPid;
    }

    public String getEiPicture() {
        return eiPicture;
    }

    public void setEiPicture(String eiPicture) {
        this.eiPicture = eiPicture == null ? null : eiPicture.trim();
    }

    public String getEiUserid() {
        return eiUserid;
    }

    public void setEiUserid(String eiUserid) {
        this.eiUserid = eiUserid == null ? null : eiUserid.trim();
    }
}
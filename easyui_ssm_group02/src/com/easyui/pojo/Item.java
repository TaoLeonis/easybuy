package com.easyui.pojo;

public class Item {
	 /**
     * 商品编号
     */
    private String epId;
    /**
     * 商品名称
     */
    private String epName;
    /**
     * 商品单价
     */
    private Float epPrice;
    /**
     * 商品库存数量
     */
    private int epCount = 1 ;
    /**
     * 商品图片名称
     */
    private String epFileName;
	public String getEpId() {
		return epId;
	}
	public void setEpId(String epId) {
		this.epId = epId;
	}
	public String getEpName() {
		return epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}
	public Float getEpPrice() {
		return epPrice;
	}
	public void setEpPrice(Float epPrice) {
		this.epPrice = epPrice;
	}
	public int getEpCount() {
		return epCount;
	}
	public void setEpCount(int epCount) {
		this.epCount = epCount;
	}
	public String getEpFileName() {
		return epFileName;
	}
	public void setEpFileName(String epFileName) {
		this.epFileName = epFileName;
	}
	public float getTotal(){
		System.out.println(this.epPrice*this.epCount);
		return this.epPrice*this.epCount;
	}
	@Override
	public String toString() {
		return "Item [epId=" + epId + ", epName=" + epName + ", epPrice="
				+ epPrice + ", epCount=" + epCount + ", epFileName="
				+ epFileName + "]";
	}
    
    
}

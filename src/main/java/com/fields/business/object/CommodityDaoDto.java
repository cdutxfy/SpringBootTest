package com.fields.business.object;

import java.util.Date;

/**
 * 
 * @author bbx_刘府
 * @Description: 商品信息表
 * @ClassName: 商品信息表
 * @CreateDate: 2018/10/19 11:00
 * @UpdateDate: 2018/10/19 11:00
 *
 */
public class CommodityDaoDto {
	// 条形码
	private String barCode;
	// 分类ID
	private String categoryId;
	// 分类名称
	private String categoryName;
	// 图片番号
	private String pictureNumber;
	// 进价
	private double purchasePrice;
	// 定价
	private double price;
	// 商品名
	private String commodityName;
	// 商品副标题
	private String subTitle;
	// 商品详细
	private String detail;
	// 商品状态
	private String status;
	// 保质期(小时)
	private String periodHour;
	// 创建时间
	private Date createTime;
	// 更新时间
	private Date updateTime;

	/**
	 * @return the barCode
	 */
	public String getBarCode() {
		return barCode;
	}

	/**
	 * @param barCode the barCode to set
	 */
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	/**
	 * @return the categoryId
	 */
	public String getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @return the pictureNumber
	 */
	public String getPictureNumber() {
		return pictureNumber;
	}

	/**
	 * @param pictureNumber the pictureNumber to set
	 */
	public void setPictureNumber(String pictureNumber) {
		this.pictureNumber = pictureNumber;
	}

	/**
	 * @return the purchasePrice
	 */
	public double getPurchasePrice() {
		return purchasePrice;
	}

	/**
	 * @param purchasePrice the purchasePrice to set
	 */
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the commodityName
	 */
	public String getCommodityName() {
		return commodityName;
	}

	/**
	 * @param commodityName the commodityName to set
	 */
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	/**
	 * @return the subTitle
	 */
	public String getSubTitle() {
		return subTitle;
	}

	/**
	 * @param subTitle the subTitle to set
	 */
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	/**
	 * @return the detail
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the periodHour
	 */
	public String getPeriodHour() {
		return periodHour;
	}

	/**
	 * @param periodHour the periodHour to set
	 */
	public void setPeriodHour(String periodHour) {
		this.periodHour = periodHour;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}

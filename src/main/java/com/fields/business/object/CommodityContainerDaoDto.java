package com.fields.business.object;

import java.util.Date;

/**
 * 
 * @author bbx_刘府
 * @Description: 货柜商品表
 * @ClassName: 货柜商品表
 * @CreateDate: 2018/10/19 11:00
 * @UpdateDate: 2018/10/19 11:00
 *
 */
public class CommodityContainerDaoDto {
	// 货柜ID
	private String containerId;
	// 商品ID
	private String commodityId;
	// 商品数量
	private int commodityNumber;
	// 售价
	private double sellPrice;
	// 商品状态
	private String Status;
	// 创建时间
	private Date createTime;
	// 更新时间
	private Date updateTime;

	/**
	 * @return the containerId
	 */
	public String getContainerId() {
		return containerId;
	}

	/**
	 * @param containerId the containerId to set
	 */
	public void setContainerId(String containerId) {
		this.containerId = containerId;
	}

	/**
	 * @return the commodityId
	 */
	public String getCommodityId() {
		return commodityId;
	}

	/**
	 * @param commodityId the commodityId to set
	 */
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	/**
	 * @return the commodityNumber
	 */
	public int getCommodityNumber() {
		return commodityNumber;
	}

	/**
	 * @param commodityNumber the commodityNumber to set
	 */
	public void setCommodityNumber(int commodityNumber) {
		this.commodityNumber = commodityNumber;
	}

	/**
	 * @return the sellPrice
	 */
	public double getSellPrice() {
		return sellPrice;
	}

	/**
	 * @param sellPrice the sellPrice to set
	 */
	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return Status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		Status = status;
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

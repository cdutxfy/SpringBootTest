package com.fields.business.mapper;

import com.fields.business.object.CommodityContainerDaoDto;

public interface CommodityContainerDao {

	// 货柜商品登录
	void insertContainerCommodityInfo(CommodityContainerDaoDto commodityContainerDaoDto);
}

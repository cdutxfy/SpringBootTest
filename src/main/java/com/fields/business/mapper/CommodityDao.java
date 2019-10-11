package com.fields.business.mapper;

import java.util.List;

import com.fields.business.object.CommodityDaoDto;

public interface CommodityDao {

	// 商品登录
	void insertCommodityInfo(CommodityDaoDto commodityDaoDto);
	
	List<CommodityDaoDto> selectAll();
}

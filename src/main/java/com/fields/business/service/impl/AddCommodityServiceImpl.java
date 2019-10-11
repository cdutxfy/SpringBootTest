package com.fields.business.service.impl;

import java.awt.List;
import java.io.File;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.fields.business.constant.ContantValue;
import com.fields.business.dto.request.AddCommodityRespDto;
import com.fields.business.mapper.CommodityContainerDao;
import com.fields.business.mapper.CommodityDao;
import com.fields.business.object.CommodityContainerDaoDto;
import com.fields.business.object.CommodityDaoDto;
import com.fields.business.service.AddCommodityService;

/**
 * 
 * @author bbx_黄伟
 * @Description: 新增商品
 * @ClassName: 新增商品
 * @CreateDate: 2019/07/30 16:00
 * @UpdateDate: 2019/07/30 16:00
 *
 */
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 5)
@Service
public class AddCommodityServiceImpl implements AddCommodityService {
	@Autowired
	CommodityDao commodityDao;
	@Autowired
	CommodityContainerDao commodityContainerDao;

	@Override
	public AddCommodityRespDto getAddCommodityResp(MultipartFile uploadFile, String commodityInfo) throws Exception {
		// 将字符串转化为json对象
		JSONObject object = (JSONObject) JSONObject.parse(commodityInfo);
		// 初始化图片名称
		String pictureName = ContantValue.RE_BLANK;
		// 商品编号
		String commodityId = object.getString(ContantValue.COMMODITY_ID);
		// 货柜编号
		String containerId = object.getString(ContantValue.CONTAINER_ID);
		// 商品名称
		String commodityName = object.getString(ContantValue.COMMODITY_NAME);
		// 商品分类名称
		String categoryName = object.getString(ContantValue.CATEGORY_NAME);
		// 商品分类ID
		String categoryId = object.getString(ContantValue.CATEGORY_ID);
		// 商品进价
		double purchasePrice = Double.valueOf(object.getString(ContantValue.PURCHASE_PRICE));
		// 商品定价
		double price = Double.valueOf(object.getString(ContantValue.PRICE));
		// 商品售价
		double sellPrice = Double.valueOf(object.getString(ContantValue.SELL_PRICE));
		// 商品副标题
		String subTitle = object.getString(ContantValue.SUB_TITLE);
		// 商品详情
		String detail = object.getString(ContantValue.DETAIL);
		// 创建返回对象
		AddCommodityRespDto addCommodityRespDto = new AddCommodityRespDto();
		
		// 上传的图片不存在的场合
		if (uploadFile.isEmpty()) {
			// 返回编码
			addCommodityRespDto.setReturnCode(ContantValue.RETURN_CODE_FAIL1);
			// 返回文言
			addCommodityRespDto.setReturnString(ContantValue.RETURN_MSG_FAIL1);
			// 返回对象
			return addCommodityRespDto;
		}
		// 上传的图片存在的场合
		else {
//			try {
				
//				java.util.List<CommodityDaoDto> commodityDaoa = commodityDao.selectAll();
				
				
				
				
				// 获取本地上传的图片的名称
				pictureName = uploadFile.getOriginalFilename();
				// 图片存放路径
				String picturePath = "C:\\images\\goods\\" + pictureName;
				// 将从本地获取的图片上传至指定路径
				uploadFile.transferTo(new File(picturePath));
				// 获取当前日付
				Calendar cal = Calendar.getInstance();
				SimpleDateFormat sdf = new SimpleDateFormat(ContantValue.DATE_FORMAT);
				Timestamp todayDate = Timestamp.valueOf(sdf.format(cal.getTime()));
				
				// TODO 项目Check
				// 商品信息设置,对象实例化
				CommodityDaoDto commodityDaoDto = new CommodityDaoDto();
				// 设置商品编号
				commodityDaoDto.setBarCode(commodityId);
				// 设置商品分类ID
				commodityDaoDto.setCategoryId(categoryId);
				// 设置商品分类名称
				commodityDaoDto.setCategoryName(categoryName);
				// 设置商品名称
				commodityDaoDto.setCommodityName(commodityName);
				// 设置商品详情
				commodityDaoDto.setDetail(detail);
				// 设置商品保质期
				commodityDaoDto.setPeriodHour(ContantValue.PERIOD_HOUR);
				// 设置网络图片路径
				commodityDaoDto.setPictureNumber(ContantValue.SERVICE_PATH + pictureName);
				// 设置商品定价
				commodityDaoDto.setPrice(price);
				// 设置商品进价
				commodityDaoDto.setPurchasePrice(purchasePrice);
				// 设置商品状态
				commodityDaoDto.setStatus(ContantValue.COMMODITY_STATUS);
				// 设置商品副标题
				commodityDaoDto.setSubTitle(subTitle);
				// 设置商品创建时间
				commodityDaoDto.setCreateTime(todayDate);
				// 设置商品修改时间
				commodityDaoDto.setUpdateTime(todayDate);
				// 商品信息表登录
				commodityDao.insertCommodityInfo(commodityDaoDto);
				
				// 货柜商品信息设置，对象实例化
				CommodityContainerDaoDto commodityContainerDaoDto = new CommodityContainerDaoDto();
				// 设置商品编号
				commodityContainerDaoDto.setCommodityId(commodityId);
				// 设置商品数量
				commodityContainerDaoDto.setCommodityNumber(0);
				// 设置货柜ID
				commodityContainerDaoDto.setContainerId(containerId);
				// 设置商品售价
				commodityContainerDaoDto.setSellPrice(sellPrice);
				// 设置商品状态
				commodityContainerDaoDto.setStatus(ContantValue.COMMODITY_STATUS);
				// 设置商品创建时间
				commodityContainerDaoDto.setCreateTime(todayDate);
				// 设置商品修改时间
				commodityContainerDaoDto.setUpdateTime(todayDate);
				// 货柜商品信息表登录
				commodityContainerDao.insertContainerCommodityInfo(commodityContainerDaoDto);
				
				// 返回编码
				addCommodityRespDto.setReturnCode(ContantValue.RETURN_CODE_SUCCESS);
				// 返回文言
				addCommodityRespDto.setReturnString(ContantValue.RETURN_MSG_SUCCESS);
//			} catch (Exception e) {
//				// 返回编码
//				addCommodityRespDto.setReturnCode(ContantValue.RETURN_CODE_FAIL2);
//				// 返回文言
//				addCommodityRespDto.setReturnString(ContantValue.RETURN_MSG_FAIL2);
//				// 返回对象
//				return addCommodityRespDto;
//			}
		}

		// 返回对象，前端接收
		return addCommodityRespDto;
	}

}

package com.fields.business.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fields.business.dto.request.AddCommodityRespDto;
import com.fields.business.service.AddCommodityService;

/**
 * 
 * @author bbx
 * @Description: 主入口
 * @ClassName: 主入口
 * @CreateDate: 2019/08/13
 * @UpdateDate: 2019/08/13
 *
 */
@Controller
public class control {
	@Autowired
	AddCommodityService addCommodityService;

	private static Logger logger = LogManager.getLogger(control.class.getName());

	/**
	 * @Description: 新增商品
	 * @param AddCommodityReqDto
	 * @return AddCommodityRespDto
	 * @throws Exception
	 */
	@RequestMapping(value = "/addCommodity", method = RequestMethod.POST)
	@ResponseBody
	public AddCommodityRespDto addCommodity(MultipartFile uploadFile, String commodityInfo) throws Exception {
		logger.debug("API: /addCommodity");
		AddCommodityRespDto addCommodityRespDto = addCommodityService.getAddCommodityResp(uploadFile, commodityInfo);
		return addCommodityRespDto;
	}
	@RequestMapping("/jsp/addCommodity")
	public String addCommodityUrl() {
		 return "jsp/addCommodity";
	}
}

package com.fields.business.service;

import org.springframework.web.multipart.MultipartFile;

import com.fields.business.dto.request.AddCommodityRespDto;

public interface AddCommodityService {
	AddCommodityRespDto getAddCommodityResp(MultipartFile uploadFile, String commodityInfo) throws Exception;
}

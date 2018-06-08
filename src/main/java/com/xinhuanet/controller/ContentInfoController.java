package com.xinhuanet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xinhuanet.entity.ContentInfo;
import com.xinhuanet.service.ContentInfoService;

@RestController	// 包含@Controller与ResponseBody
public class ContentInfoController {

	@Autowired
	private ContentInfoService contentInfoService;

	@RequestMapping("/findOne")
	public ContentInfo hello(Long id) {
		return contentInfoService.get(id);
	}
}
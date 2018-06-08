package com.xinhuanet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.xinhuanet.entity.ContentInfo;
import com.xinhuanet.mapper.ContentInfoMapper;
import com.xinhuanet.service.ContentInfoService;

@Primary
@Service
public class ContentInfoServiceImpl implements ContentInfoService {

	@Autowired
	private ContentInfoMapper contentInfoMapper;
	
	@Override
	public ContentInfo get(Long id) {
		return contentInfoMapper.get(id);
	}

	
	

}

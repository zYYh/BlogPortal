package com.yh.blog.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.blog.Dao.portalDao;
import com.yh.blog.Model.TfNoticeManager;
import com.yh.blog.Model.User;
import com.yh.blog.Service.PortalService;

@Service
public class PortalServiceImpl implements PortalService{
	
	@Autowired
	private portalDao portalDao;
	
	//mybaties框架测试
	public List<User> mybatiesTest(){
		return portalDao.mybatiesTest();
	}
}

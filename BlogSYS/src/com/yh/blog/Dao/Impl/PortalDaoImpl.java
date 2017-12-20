package com.yh.blog.Dao.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yh.blog.Dao.portalDao;
import com.yh.blog.Model.TfNoticeManager;
import com.yh.blog.Model.User;

import utils.SqlSessionCommDao;

@Repository
public class PortalDaoImpl extends SqlSessionCommDao implements portalDao {
	
	private String sqlId = "user.";

	//mybaties测试
	public List<User> mybatiesTest() {
		return this.getSqlSession().selectList(sqlId+"selectTest");
	}

}

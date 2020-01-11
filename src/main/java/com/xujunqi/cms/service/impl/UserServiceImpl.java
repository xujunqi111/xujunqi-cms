package com.xujunqi.cms.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.xujunqi.cms.common.CmsMd5Util;
import com.xujunqi.cms.dao.UserDao;
import com.xujunqi.cms.pojo.User;
import com.xujunqi.cms.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public boolean register(User user) {
		/** 设置密码 **/
		user.setPassword(CmsMd5Util.md5(user.getPassword()));
		user.setLocked(0);
		user.setScore(0);
		user.setRole("0");
		user.setCreate_time(new Date());
		user.setUpdate_time(new Date());
		return userDao.insert(user)>0;
	}

	@Override
	public User getByUsername(String userName) {
		return userDao.selectByUsername(userName);
	}

	@Override
	public boolean locked(String userName) {
		User userInfo = userDao.selectByUsername(userName);
		return userInfo.getLocked()==1;
	}

}

package com.rent.user.manager.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rent.user.bean.UserBean;
import com.rent.user.dao.UserDao;
import com.rent.user.manager.UserManager;

@Service
public class UserManagerImpl  implements UserManager{
	@Resource
	private UserDao dao;

	public UserBean getUser(UserBean userBean){
		UserBean userBean1=dao.getUser(userBean);
	    return userBean1;
	}

	/**
	 * 检查电话是否重复
	 */
	@Override
	public int checkPhone(UserBean userBean) {
		return dao.checkPhone(userBean);
	}
	@Override
	public int addUser(UserBean userBean) {
		dao.updateInfo(userBean);
		return dao.addUser(userBean);
	}
	
	@Override
	public int updateUser(UserBean userBean) {
		return dao.updateUser(userBean);
	}

	@Override
	public int updatePwd(UserBean userBean) {
		return dao.updatePwd(userBean);
	}

	@Override
	public int deleteUser(UserBean userBean) {
		return dao.deleteUser(userBean);
	}

}
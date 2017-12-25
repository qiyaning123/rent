package com.rent.user.dao;

import org.springframework.stereotype.Repository;

import com.rent.user.bean.UserBean;
@Repository
public  interface UserDao{
	  public  UserBean getUser(UserBean userBean);
	  public  int checkPhone(UserBean userBean);
	  public  int updateInfo(UserBean userBean);
	  public  int addUser(UserBean userBean);
	  public  int updateUser(UserBean userBean);
	  public  int updatePwd(UserBean userBean);
	  public  int deleteUser(UserBean userBean);
}
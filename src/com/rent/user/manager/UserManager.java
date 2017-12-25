package com.rent.user.manager;

import com.rent.user.bean.UserBean;

public interface UserManager
{
  public  UserBean getUser(UserBean userBean);
  public  int addUser(UserBean userBean);
  public  int checkPhone(UserBean userBean);
  public  int updateUser(UserBean userBean);
  public  int updatePwd(UserBean userBean);
  public  int deleteUser(UserBean userBean);
}
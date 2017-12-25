//package com.rent.user.dao.impl;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.apache.commons.lang3.StringUtils;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//
//import com.rent.user.dao.UserDao;
//
//@Repository("UserDaoImpl")
//@Component(value="UserDaoImpl")
//public class UserDaoImpl
//  implements UserDao
//{
//	@Resource(name="sqlSessionFactory")
//  private SqlSessionFactory s;
//
//  @Override
//  public List getList(String name) {
//	  String sql = " SELECT ta.* FROM USER ta  WHERE ta.name ='111' " ;
////    String sql = "select ta.* from user ta  where ta.name like '%" + name + "%' " ;
//	  return this.s.queryForList(sql);
//  }
//
//@Override
//public int save(String name, String phone, String pwd, String type, String valid) {
//	String sql=" insert into user(name,phone,pwd) values('"+name+"','"+phone+"','"+pwd+"')";
//	return s.update(sql);
//}
//
//@Override
//public int update(String id, String name, String phone, String pwd, String type) {
//	String sql="";
//	if(!StringUtils.isEmpty(pwd)){
//		sql="update user set pwd='"+pwd+"' where id='"+id+"'";
//		return j.update(sql);
//	}else if(!StringUtils.isEmpty(type)){
//		sql="update user set type='"+type+"' where id='"+id+"'";
//		return j.update(sql);
//	}else {
//		sql="update user set name='"+name+"' ,phone='"+phone+"' where id='"+id+"'";
//		return s.update(sql);
//	}
//}
//
//@Override
//public int delete(String id) {
//	String sql="update user set valid='0' where id='"+id+"'";
//	return s.update(sql);
//}
//
//}
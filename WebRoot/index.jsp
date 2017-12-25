<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <form action="/rent/user/login" method="post">
    /rent/user/login
    用户名： <input type="text" name="phone" value="186123456789">
    密码：<input type="text" name="pwd" value="123456">
    <input type="submit" value="用户登陆"/>
    </form>
    <form action="/rent/user/register" method="post">
    /rent/user/register
    用户名： <input type="text" name="name" value="user2">
    电话： <input type="text" name="phone" value="18622213321">
    密码：<input type="text" name="pwd" value="123456">
    身份证： <input type="text" name="idnumber" value="1234567890123564568">
    性别1男2女： <input type="text" name="sex" value="1">
    生日（yyyy-MM-dd HH:mm:ss）： <input type="text" name="birthday" value="2017-12-18 21:56:13">
    邮件： <input type="text" name="email" value="333232@qq.com">
    <input type="submit" value="用户注册"/>
    </form>
    
    <form action="/rent/user/update" method="post">
    /rent/user/update
  id： <input type="text" name="id" value="25">
    用户名： <input type="text" name="name" value="user3">
    电话： <input type="text" name="phone" value="18622213321">
    身份证： <input type="text" name="idnumber" value="1234567890123564569">
    性别1男2女： <input type="text" name="sex" value="2">
    生日（yyyy-MM-dd HH:mm:ss）： <input type="text" name="birthday" value="2017-12-18 21:56:13">
    邮件： <input type="text" name="email" value="333232@qq.com">
    <input type="submit" value="用户修改"/>
    </form>
    《房屋》
    <br/><br/><br/><br/>
    <form action="/rent/room/add" method="post">
    /rent/room/add
    标题： <input type="text" name="title" value="出租1">
  类型1出租2出售： <input type="text" name="type" value="1">
    类型id： <input type="text" name="type_id" value="1">
  省id： <input type="text" name="province_id" value="20000">
  省名称： <input type="text" name="province" value="河北">
  市id： <input type="text" name="city_id" value="21000">
  市名称： <input type="text" name="city" value="石家庄">
  区id： <input type="text" name="district_id" value="21100">
  区名称： <input type="text" name="district" value="裕华区">
    小区： <input type="text" name="community" value="东南小区">
    地址： <input type="text" name="address" value="地址地址">
    几室： <input type="text" name="shi" value="3">
   几厅： <input type="text" name="ting" value="2">
    几卫： <input type="text" name="wei" value="1">
    房间面积： <input type="text" name="area" value="103">
    装修类型1毛坯2简装3精装4豪装： <input type="text" name="decoration_id" value="3">
    姓名： <input type="text" name="name" value="出租人">
  1男2女： <input type="text" name="sex" value="1">
  电话： <input type="text" name="phone" value="13212345678">
  价格： <input type="text" name="price" value="1000">
  服务金比例id： <input type="text" name="rate_id" value="1">
  创建人： <input type="text" name="creater" value="1">
    <input type="submit" value="房屋出租（出售）"/>
    </form>
	startPrice	String		否	开始价格
	endPrice	String		否	结束价格
    
    <form action="/rent/room/getlistbycondition" method="post">
    /rent/room/getlistbycondition
  标题（小区名称公用）： <input type="text" name="title" value="出">
    类型1出租2出售： <input type="text" name="type" value="1">
      省id： <input type="text" name="province_id" value="20000">
  省名称： <input type="text" name="province" value="河北">
  市id： <input type="text" name="city_id" value="21000">
  市名称： <input type="text" name="city" value="石家庄">
  区id： <input type="text" name="district_id" value="21100">
  区名称： <input type="text" name="district" value="裕华区">
    几室： <input type="text" name="shi" value="3">
     装修类型1毛坯2简装3精装4豪装： <input type="text" name="decoration_id" value="3">
    邮件： <input type="text" name="email" value="333232@qq.com">
    <input type="submit" value="根据类型获取房间列表"/>
    </form>
  </body>
</html>

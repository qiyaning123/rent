package com.rent.user.bean;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class UserBean
  implements Serializable
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;//id
	private String name;//姓名
	private String pwd;//密码
	private String type;//用户类型1用户2管理员
	private String phone;//电话
	private String idnumber;//身份证
	private String sex;//性别 1男 2女
	private Date birthday;//生日
	private String email;//邮件
	private String valid;//是否有效0无效1有效
	private Date createdatetime;//创建时间
	private Date updatedatetime;//更新时间
	private Date lastlogindatetime;//最后登录时间
	private String lastloginip;//登录ip
	private String lastlogindevice;//登录设备
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getValid() {
		return valid;
	}
	public void setValid(String valid) {
		this.valid = valid;
	}
	
	public Date getCreatedatetime() {
		return createdatetime;
	}
	public void setCreatedatetime(Date createdatetime) {
		this.createdatetime = createdatetime;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getUpdatedatetime() {
		return updatedatetime;
	}
	public void setUpdatedatetime(Date updatedatetime) {
		this.updatedatetime = updatedatetime;
	}
	public Date getLastlogindatetime() {
		return lastlogindatetime;
	}
	public void setLastlogindatetime(Date lastlogindatetime) {
		this.lastlogindatetime = lastlogindatetime;
	}
	public String getLastloginip() {
		return lastloginip;
	}
	public void setLastloginip(String lastloginip) {
		this.lastloginip = lastloginip;
	}
	public String getLastlogindevice() {
		return lastlogindevice;
	}
	public void setLastlogindevice(String lastlogindevice) {
		this.lastlogindevice = lastlogindevice;
	}
}
package com.rent.dictionary.bean;

import java.io.Serializable;

public class DictionaryBean
  implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int id; //id
	private int pid; //上级id
	private String code; //编码
	private int val;//值
	private String dsc;//描述
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public String getDsc() {
		return dsc;
	}
	public void setDsc(String dsc) {
		this.dsc = dsc;
	}
}
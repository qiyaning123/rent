package com.rent.province.bean;

import java.io.Serializable;

public class ProvinceBean
  implements Serializable
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id; //id
	private String name;//名称
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
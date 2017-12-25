package com.rent.city.bean;

import java.io.Serializable;

public class CityBean
  implements Serializable
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;//id
	private String name;//名称
	private String province_id;//省id
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
	public String getProvince_id() {
		return province_id;
	}
	public void setProvince_id(String province_id) {
		this.province_id = province_id;
	}
}
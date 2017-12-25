package com.rent.region.bean;

import java.io.Serializable;

public class RegionBean
  implements Serializable
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;//id
	private String name;//名称
	private String city_id;//省id
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
	public String getCity_id() {
		return city_id;
	}
	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}
}
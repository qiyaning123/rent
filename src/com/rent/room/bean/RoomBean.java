package com.rent.room.bean;

import java.io.Serializable;

public class RoomBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;// id
	private String title;// 标题
	private String type;// 类型1出租2出售
	private int type_id;// 类型表 id
	private int province_id;// 省id
	private String province;// 省名称
	private int city_id;// 市id
	private String city;// 市名称
	private int district_id;// 区id
	private String district;// 区名称
	private String community;// 小区
	private String address;// 地址
	private int shi;// 房间数量
	private int ting;// 客厅数量
	private int wei;// 卫生间数量
	private String area;// 房间面积
	private int decoration_id;// 装修类型1毛坯2简装3精装4豪装
	private String name;// 姓名
	private String sex;// 性别 1男2女
	private String phone;// 电话
	private int price;// 租金
	private int price1;// 租金
	private int price2;// 租金
	private int rate_id;// 服务金比例id
	private int creater;// 创建人id
	private String createdatetime;// 创建时间
	private String valid;// 是否有效0无效1有效
	private String updatedatetime;// 更新时间

	private String type_name;// 类型名称
	private String region_name;// 区域名称
	private String city_name;// 城市名称
	private String decoration_name;// 装修名称
	private String rate_name;// 比例名称
	private String creater_name;// 创建人姓名
	private String pic;// 列表显示一张图片

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getShi() {
		return shi;
	}

	public void setShi(int shi) {
		this.shi = shi;
	}

	public int getTing() {
		return ting;
	}

	public void setTing(int ting) {
		this.ting = ting;
	}

	public int getWei() {
		return wei;
	}

	public void setWei(int wei) {
		this.wei = wei;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getDecoration_id() {
		return decoration_id;
	}

	public void setDecoration_id(int decoration_id) {
		this.decoration_id = decoration_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRate_id() {
		return rate_id;
	}

	public void setRate_id(int rate_id) {
		this.rate_id = rate_id;
	}

	public int getCreater() {
		return creater;
	}

	public void setCreater(int creater) {
		this.creater = creater;
	}

	public String getCreatedatetime() {
		return createdatetime;
	}

	public void setCreatedatetime(String createdatetime) {
		this.createdatetime = createdatetime;
	}

	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	public String getUpdatedatetime() {
		return updatedatetime;
	}

	public void setUpdatedatetime(String updatedatetime) {
		this.updatedatetime = updatedatetime;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	public String getRegion_name() {
		return region_name;
	}

	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}

	public String getDecoration_name() {
		return decoration_name;
	}

	public void setDecoration_name(String decoration_name) {
		this.decoration_name = decoration_name;
	}

	public String getRate_name() {
		return rate_name;
	}

	public void setRate_name(String rate_name) {
		this.rate_name = rate_name;
	}

	public String getCreater_name() {
		return creater_name;
	}

	public void setCreater_name(String creater_name) {
		this.creater_name = creater_name;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public int getPrice1() {
		return price1;
	}

	public void setPrice1(int price1) {
		this.price1 = price1;
	}

	public int getPrice2() {
		return price2;
	}

	public void setPrice2(int price2) {
		this.price2 = price2;
	}

	public int getProvince_id() {
		return province_id;
	}

	public void setProvince_id(int province_id) {
		this.province_id = province_id;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getDistrict_id() {
		return district_id;
	}

	public void setDistrict_id(int district_id) {
		this.district_id = district_id;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	
}
package com.rent.room.bean;

import java.io.Serializable;

public class PicBean
  implements Serializable
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int room_id;//房间id
	private String pic;//图片地址
	private String type;//类型1 主图 2详情 3证明
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
  
}
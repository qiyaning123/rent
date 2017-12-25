package com.rent.room.manager;

import java.util.List;

import com.rent.room.bean.PicBean;
import com.rent.room.bean.RoomBean;

public  interface RoomManager
{
  public  List<RoomBean> getListByCondition(RoomBean roomBean);
  public  RoomBean getRoom(RoomBean roomBean);
  public  int addRoom(RoomBean roomBean);
  public  int deleteRoom(RoomBean roomBean);
  
  public  List<PicBean> getPic(RoomBean roomBean);
  public  int deletePic(RoomBean roomBean);
  public  int addPic(List<PicBean> l);

}
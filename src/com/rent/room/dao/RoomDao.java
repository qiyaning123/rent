package com.rent.room.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rent.room.bean.RoomBean;
@Repository
public  interface RoomDao
{
  public  RoomBean getRoom(RoomBean roomBean);
  public  List<RoomBean> findPageBreakByCondition(RoomBean roomBean);
  public  int addRoom(RoomBean roomBean);
  public  int deleteRoom(RoomBean roomBean);
}
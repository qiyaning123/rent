package com.rent.room.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rent.room.bean.PicBean;
import com.rent.room.bean.RoomBean;
@Repository
public  interface PicDao
{
  public  List<PicBean> getPic(RoomBean roomBean);
  public  int deletePic(RoomBean roomBean);
  public  int addPic(List<PicBean> l);
}
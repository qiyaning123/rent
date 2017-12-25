package com.rent.room.manager.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rent.room.bean.PicBean;
import com.rent.room.bean.RoomBean;
import com.rent.room.dao.PicDao;
import com.rent.room.dao.RoomDao;
import com.rent.room.manager.RoomManager;

@Service
public class RoomManagerImpl  implements RoomManager{
	@Resource
	private RoomDao dao;
	@Resource
	private PicDao pdao;

 
	@Override
	public RoomBean getRoom(RoomBean roomBean)
	{
		return dao.getRoom(roomBean);
	}
  @Override
  public List<RoomBean> getListByCondition(RoomBean roomBean)
  {
    return dao.findPageBreakByCondition(roomBean);
  }
  @Override
  public int addRoom(RoomBean roomBean)
  {
	  return dao.addRoom(roomBean);
  }
  @Override
  public int deleteRoom(RoomBean roomBean)
  {
	  return dao.deleteRoom(roomBean);
  }
@Override
public List<PicBean> getPic(RoomBean roomBean) {
	return pdao.getPic(roomBean);
}
@Override
public int deletePic(RoomBean roomBean) {
	return pdao.deletePic(roomBean);
}
@Override
public int addPic(List<PicBean> l) {
	return pdao.addPic(l);
}
}
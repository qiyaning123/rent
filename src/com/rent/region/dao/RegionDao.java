package com.rent.region.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rent.region.bean.RegionBean;
@Repository
public  interface RegionDao
{
  public  List<RegionBean> getRegion(RegionBean regionBean);
}
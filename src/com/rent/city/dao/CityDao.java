package com.rent.city.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rent.city.bean.CityBean;
@Repository
public  interface CityDao
{
  public  List<CityBean> getCity();
}
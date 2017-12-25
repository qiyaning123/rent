package com.rent.province.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rent.province.bean.ProvinceBean;
@Repository
public  interface ProvinceDao
{
  public  List<ProvinceBean> getProvince();
}
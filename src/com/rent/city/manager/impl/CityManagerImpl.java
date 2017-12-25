package com.rent.city.manager.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rent.city.bean.CityBean;
import com.rent.city.dao.CityDao;
import com.rent.city.manager.CityManager;
@Service
public class CityManagerImpl implements CityManager {
	@Resource
	private CityDao dao;
	@Override
	public  List<CityBean> getCity(){
		return dao.getCity();
	}
}
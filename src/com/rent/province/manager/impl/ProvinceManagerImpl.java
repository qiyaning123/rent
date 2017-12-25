package com.rent.province.manager.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rent.province.bean.ProvinceBean;
import com.rent.province.dao.ProvinceDao;
import com.rent.province.manager.ProvinceManager;
@Service
public class ProvinceManagerImpl implements ProvinceManager{
	@Resource
	private ProvinceDao dao;
	@Override
	public  List<ProvinceBean> getProvince(){
		return dao.getProvince();
	}
}

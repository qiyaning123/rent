package com.rent.region.manager.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rent.region.bean.RegionBean;
import com.rent.region.dao.RegionDao;
import com.rent.region.manager.RegionManager;
@Service
public class RegionManagerImpl implements RegionManager {
	@Resource
	private RegionDao dao;
	@Override
	public  List<RegionBean> getRegion(RegionBean regionBean){
		return dao.getRegion(regionBean);
	}
}
package com.rent.region.manager;
import java.util.List;

import com.rent.region.bean.RegionBean;

public interface RegionManager {
	public  List<RegionBean> getRegion(RegionBean regionBean);
}
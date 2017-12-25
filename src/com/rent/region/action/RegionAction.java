package com.rent.region.action;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import until.JH;
import until.ResponseUtil;

import com.rent.region.bean.RegionBean;
import com.rent.region.manager.RegionManager;

@Controller  
@RequestMapping("/region") 
public class RegionAction {
	@Resource  
	@Autowired 
    private RegionManager manager;  
    
	/**
	 * 区域信息
	 * @param res
	 * @return
	 */
    @RequestMapping(value = "/getregion") 
    public String getRegion(HttpServletResponse res,RegionBean regionBean){  
    	List<RegionBean> p=manager.getRegion( regionBean);
        JH jh = JH.newJH();
        if(p!=null){
	        jh.set("success", true);
	        jh.set("rows", p);
	        try {
				ResponseUtil.writeJson(res, jh.getJSON());
			} catch (IOException e) {
				e.printStackTrace();
			}
        }else {
	        jh.set("success", false);
	        try {
				ResponseUtil.writeJson(res, jh.getJSON());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
        return null;  
	}
    
}
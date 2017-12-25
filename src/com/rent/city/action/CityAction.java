package com.rent.city.action;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import until.JH;
import until.ResponseUtil;

import com.rent.city.bean.CityBean;
import com.rent.city.manager.CityManager;

@Controller  
@RequestMapping("/city") 
public class CityAction {
	@Resource  
	@Autowired 
    private CityManager manager;  
    
	/**
	 * 城市信息
	 * @param res
	 * @return
	 */
    @RequestMapping(value = "/getcity")
    public String getCity(HttpServletResponse res){  
    	List<CityBean> p=manager.getCity();
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
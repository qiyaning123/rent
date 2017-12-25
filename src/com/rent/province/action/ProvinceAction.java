package com.rent.province.action;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import until.JH;
import until.ResponseUtil;

import com.rent.province.bean.ProvinceBean;
import com.rent.province.manager.ProvinceManager;

@Controller  
@RequestMapping("/province") 
public class ProvinceAction {
	@Resource  
	@Autowired 
    private ProvinceManager manager;  
    
	/**
	 * 获取省份信息
	 * @param res
	 * @return
	 */
    @RequestMapping(value = "/getprovince") 
    public String getProvince(HttpServletResponse res,ProvinceBean provinceBean){  
    	List<ProvinceBean> p=manager.getProvince();
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
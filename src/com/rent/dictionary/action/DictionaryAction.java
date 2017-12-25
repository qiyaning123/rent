package com.rent.dictionary.action;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import until.JH;
import until.ResponseUtil;

import com.rent.dictionary.bean.DictionaryBean;
import com.rent.dictionary.manager.DictionaryManager;

@Controller  
@RequestMapping("/dic") 
public class DictionaryAction {
	@Resource  
	@Autowired 
    private DictionaryManager manager;  
    
	/**
	 * 根据比例信息
	 * @param res
	 * @return
	 */
    @RequestMapping(value = "/getdic") 
    public String getDictionary(HttpServletResponse res,DictionaryBean dictionaryBean){  
    	List<DictionaryBean> p=manager.getDictionary(dictionaryBean);
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
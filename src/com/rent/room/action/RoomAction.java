package com.rent.room.action;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import until.JH;
import until.ResponseUtil;

import com.rent.base.controller.BaseController;
import com.rent.room.bean.PicBean;
import com.rent.room.bean.RoomBean;
import com.rent.room.manager.RoomManager;

@Controller  
@RequestMapping("/room") 
public class RoomAction extends BaseController{
	@Resource  
	@Autowired 
    private RoomManager roomManager;  
    
	/**
	 * 根据id获取房间信息
	 * @param res
	 * @param roomBean  只传id
	 * @return
	 */
    @RequestMapping(value = "/getroom") 
    public String getRoom(HttpServletResponse res,RoomBean roomBean){  
    	RoomBean r=roomManager.getRoom(roomBean);
    	List<PicBean> list=roomManager.getPic(roomBean);
        JH jh = JH.newJH();
        if(r!=null){
	        jh.set("success", true);
	        jh.set("rows", r);
	        jh.set("picaddress", list);
	        jh.set("msg", "获取成功");
	        try {
				ResponseUtil.writeJson(res, jh.getJSON());
			} catch (IOException e) {
				e.printStackTrace();
			}
        }else {
	        jh.set("success", false);
	        jh.set("msg", "没有数据");
	        try {
				ResponseUtil.writeJson(res, jh.getJSON());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
        return null;  
	}
    /**
     * 根据类型获取房间列表（租房、出租列表）
     * @param res
     * @param roomBean  只传type 或type_id
     * @return
     *//*
    @RequestMapping(value = "/getlistbytype") 
    public String getListByType(HttpServletResponse res,RoomBean roomBean){  
    	List<RoomBean> r=roomManager.getListByType(roomBean);
//    	System.out.println(((RoomBean)r.get(0)).getAddress());
    	JH jh = JH.newJH();
    	System.out.println(r+"");
    	if(r.size()>0){
    		jh.set("success", true);
    		jh.set("rows", r);
    		jh.set("msg", "获取成功");
    		System.out.println(jh.getJSONString());
    		try {
    			ResponseUtil.writeJson(res, jh.getJSON());
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}else {
    		jh.set("success", false);
    		jh.set("msg", "没有数据");
    		try {
    			ResponseUtil.writeJson(res, jh.getJSON());
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
    	return null;  
    }*/
    
    /**
     * 根据条件获取房间列表
     * @param res
     * @param roomBean
     * @return
     */
    @RequestMapping(value = "/getlistbycondition") 
    public String getListByCondition(HttpServletResponse res,RoomBean roomBean){  
    	List<RoomBean> r=roomManager.getListByCondition(roomBean);
    	JH jh = JH.newJH();
    	if(r.size()>0){
    		jh.set("success", true);
    		jh.set("rows", r);
    		jh.set("msg", "获取成功");
    		try {
    			ResponseUtil.writeJson(res, jh.getJSON());
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}else {
    		jh.set("success", false);
    		jh.set("msg", "没有数据");
    		try {
    			ResponseUtil.writeJson(res, jh.getJSON());
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
    	return null;  
    }
    /**
     * 添加房间信息
     * @param res
     * @param roomBean  房间信息
     * @return
     */
    @RequestMapping(value = "/add") 
    public String addRoom(HttpServletResponse res,RoomBean roomBean){  
    	
    	int r=roomManager.addRoom(roomBean);
    	JH jh = JH.newJH();
    	if(r>0){
    		jh.set("success", true);
    		jh.set("rows", r);
    		jh.set("msg", "发布成功");
    		try {
    			ResponseUtil.writeJson(res, jh.getJSON());
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}else {
    		jh.set("success", false);
    		jh.set("msg", "发布失败");
    		try {
    			ResponseUtil.writeJson(res, jh.getJSON());
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
    	return null;  
    }
    /**
     * 删除房间信息
     * @param res
     * @param roomBean  只传id
     * @return
     */
    @RequestMapping(value = "/delete") 
    public String deleteRoom(HttpServletResponse res,RoomBean roomBean){  
    	int r=roomManager.deleteRoom(roomBean);
    	JH jh = JH.newJH();
    	if(r>0){
    		jh.set("success", true);
    		jh.set("rows", r);
    		jh.set("msg", "删除成功");
    		try {
    			ResponseUtil.writeJson(res, jh.getJSON());
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}else {
    		jh.set("success", false);
    		jh.set("msg", "删除失败");
    		try {
    			ResponseUtil.writeJson(res, jh.getJSON());
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
    	return null;  
    }
    
}
package com.rent.user.action;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rent.base.controller.BaseController;
import com.rent.user.bean.UserBean;
import com.rent.user.manager.UserManager;

import until.JH;
import until.ResponseUtil;
import until.Tools;

@Controller  
@RequestMapping("/user")
public class UserAction extends BaseController{
	@Resource  
	@Autowired
    private UserManager userManager;  
	

    /**
     * 根据 电话 密码 登录
     * @param phone 电话
     * @param pwd 密码
     * @param res 返回response
     * @return 返回json 成功true rows：userBean 失败 false
     * @throws IOException 
     * @throws Exception
     */
    @RequestMapping(value = "/login")
    public String getUser(UserBean userBean,HttpServletResponse res) throws IOException{
    	JH jh = JH.newJH();
    	try {
	        if(userBean.getPwd()==null) userBean.setPwd("");
	    	String pwd=Tools.MD5Code(userBean.getPwd());
	    	userBean.setPwd(pwd);
	    	UserBean u=userManager.getUser(userBean);
	        if(u!=null){
		        jh.set("success", true);
		        jh.set("rows", u);
		        jh.set("msg", "验证成功");
				ResponseUtil.writeJson(res, jh.getJSON());
				return null;
	        }else {
		        jh.set("success", false);
		        jh.set("msg", "验证失败");
				ResponseUtil.writeJson(res, jh.getJSON());
				return null;
			}
    	} catch (Exception e) {
			e.printStackTrace();
			jh.set("success", false);
		    jh.set("msg", "验证失败");
			ResponseUtil.writeJson(res, jh.getJSON());
			return null;
		}
    }
    
    /**
     * 用户注册
     * name 姓名&phone 电话 &pwd 密码 &idnumber 身份证 &sex 性别 1男2女 &birthday 生日 &email 邮件
     * @param res response
     * @return 返回 json 成功 true  失败  false
     * @throws Exception
     */
    @RequestMapping(value = "/register")
    public String addUser(UserBean userBean,HttpServletResponse res) throws Exception{
    	
    	JH jh = JH.newJH();
    	if(userBean.getPwd()==null) userBean.setPwd("");
    	String pwd=Tools.MD5Code(userBean.getPwd());
    	userBean.setPwd(pwd);
//    	检查电话是否重复
    	int e=userManager.checkPhone(userBean);
    	if(e>0){
    		jh.set("success", false);
    		jh.set("msg", "本电话已经注册");
    		ResponseUtil.writeJson(res, jh.getJSON());
    		return null;
    	}
//    	添加用户
    	int i =userManager.addUser(userBean);
    	
    	if(i>0){
    		jh.set("success", true);
    		jh.set("msg", "注册成功");
    		ResponseUtil.writeJson(res, jh.getJSON());
    		return null;
    	}else {
    		jh.set("success", false);
    		jh.set("msg", "注册异常");
    		ResponseUtil.writeJson(res, jh.getJSON());
    		return null;
    	}
    }
    
    /**
     * 修改信息
     * @param id id
     * @param name 姓名
     * @param phone 电话
     * @param res response
     * @return 返回 json 成功 true  失败  false
     * @throws Exception
     */
    @RequestMapping(value = "/update")
    public String updateUser(UserBean userBean,HttpServletResponse res) throws Exception{
    	int i =userManager.updateUser(userBean);
    	JH jh = JH.newJH();
    	if(i>0){
    		jh.set("success", true);
    		jh.set("msg", "修改成功");
    		ResponseUtil.writeJson(res, jh.getJSON());
    	}else {
    		jh.set("success", false);
    		jh.set("msg", "修改失败");
    		ResponseUtil.writeJson(res, jh.getJSON());
    	}
    	return null;
    }
    
    /**
     * 更新密码
     * @param id
     * @param pwd 密码
     * @param res response
     * @return 返回 json 成功 true  失败  false
     * @throws Exception
     */
    @RequestMapping(value = "/updatepwd")
    public String updatePwd(UserBean userBean,HttpServletResponse res) throws Exception{
    	String pwd=Tools.MD5Code(userBean.getPwd());
    	userBean.setPwd(pwd);
    	int i=userManager.updatePwd(userBean);
    	JH jh = JH.newJH();
    	if(i>0){
    		jh.set("success", true);
    		jh.set("msg", "修改成功");
    		ResponseUtil.writeJson(res, jh.getJSON());
    	}else {
    		jh.set("success", false);
    		jh.set("msg", "修改失败");
    		ResponseUtil.writeJson(res, jh.getJSON());
    	}
    	return null;
    }
    
    /**
     * 删除用户
     * @param id
     * @param res response
     * @return 返回 json 成功 true  失败  false
     * @throws Exception
     */
    @RequestMapping(value = "/delete")
    public String deleteUser(UserBean userBean,HttpServletResponse res) throws Exception{
    	int i =userManager.deleteUser(userBean);
    	JH jh = JH.newJH();
    	if(i>0){
    		jh.set("success", true);
    		jh.set("msg", "删除成功");
    		ResponseUtil.writeJson(res, jh.getJSON());
    	}else {
    		jh.set("success", false);
    		jh.set("msg", "删除失败");
    		ResponseUtil.writeJson(res, jh.getJSON());
    	}
    	return null;
    }
	
}
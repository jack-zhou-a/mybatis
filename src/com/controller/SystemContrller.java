package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.entity.User;
/*
 * 控制器类
 */
@Controller
@RequestMapping("/system")
public class SystemContrller {
	
	@RequestMapping(value="/index",method = RequestMethod.GET)
	public ModelAndView index(ModelAndView model) {
		model.addObject("name", "对方答复");
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping(value = "/lohin",method = RequestMethod.POST)
	@ResponseBody
	public Map<String,String> loginAct(User user,String capcha,HttpServletRequest request){
		
		Map<String,String> ret=new HashMap<String,String>();
		if(user==null) {
			ret.put("type", "error");
			ret.put("msg","请填写用户信息！ ");
		}
		if(StringUtils.isEmpty(user.getUsername())) {
			
		}
		Object obj=request.getSession().getAttribute("");
		return ret;
	}
	
	//返回登录页面
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public ModelAndView login(ModelAndView model) {
		
		model.setViewName("login");
		
		return model;
		
	}
	
}

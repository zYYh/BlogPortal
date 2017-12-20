package com.yh.blog.Controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yh.blog.Model.TfNoticeManager;
import com.yh.blog.Model.User;
import com.yh.blog.Service.PortalService;
/**
 * 前台控制层
 * @author YH
 *
 */

@Controller
@RequestMapping(value="/PortalController")
public class PortalController {
	
	@Autowired
	private PortalService service;
	
	//日志
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 博客首页转发
	 * @param model
	 * @param code 用户标识
	 * @return
	 */
	@RequestMapping(value="/toIndex")
	public String toIndex(Model model,String code,HttpSession session){
		/*List<User> user = service.mybatiesTest();
		model.addAttribute("user",user);*/
		try{
			if(code.equals("1")){
				model.addAttribute("name", "ZYP");
			}else if(code.equals("2")){
				model.addAttribute("name", "YHwin");
			}
			session.setAttribute("code", code);
		}catch(Exception e){
			logger.error("system error,usercode:"+code+e.getMessage());
			return "404";
		}
		return "index";
	}
	
	@RequestMapping(value="/toSingle")
	public String toSingle(){
		
		return "single";
	}
	
}

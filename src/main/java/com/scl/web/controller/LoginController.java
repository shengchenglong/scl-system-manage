package com.scl.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manage")
public class LoginController {
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request, Model model) {
		String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
		String error = null;
		
		if(UnknownAccountException.class.getName().equals(exceptionClassName)) {
			error = "用户名错误";
		}
		else if(IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
			error = "密码错误";
		}
		else if(LockedAccountException.class.getName().equals(exceptionClassName)) {
			error = "用户被锁定";
		}
		else if(exceptionClassName != null) {
			error = "其他错误：" + exceptionClassName;
		}
		model.addAttribute("error", error);
		return "sign/signIn";
		
	}
}

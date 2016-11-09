package com.scl.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scl.manage.domain.SysResource;
import com.scl.manage.domain.SysRole;
import com.scl.manage.domain.SysUser;
import com.scl.manage.service.SysResourceService;
import com.scl.manage.service.SysRoleService;
import com.scl.web.annotation.CurrentUser;

@Controller
@RequestMapping("/manage")
public class IndexController {
	
	@Autowired
	private SysResourceService resourceService;
	@Autowired
	private SysRoleService roleService;
	
	@RequestMapping("/index")
	public String index(@CurrentUser SysUser loginUser, Model model) {
		//String username = loginUser.getUsername();
		
		String username = "admin";
		List<SysRole> roles = roleService.getByUsername(username);
		List<SysResource> resources = resourceService.getByRoles(roles);
		model.addAttribute("menus", resources);
		return "index";
	}
	

}

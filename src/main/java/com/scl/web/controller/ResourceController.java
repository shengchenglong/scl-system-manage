package com.scl.web.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scl.manage.domain.SysResource;
import com.scl.manage.service.SysResourceService;

@Controller
@RequestMapping("/manage/resource")
public class ResourceController {
	
	@Autowired
	private SysResourceService resourceService;
	
	@RequiresPermissions("resource:view")
	@RequestMapping("index")
	public String index(Model model) {
		List<SysResource> list = resourceService.getAll();
		model.addAttribute("resourceList", list);
		return "resource/resource_index";
	}

}

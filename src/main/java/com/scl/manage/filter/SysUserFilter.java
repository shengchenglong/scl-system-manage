package com.scl.manage.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.springframework.beans.factory.annotation.Autowired;

import com.scl.manage.service.SysUserService;
import com.scl.util.Constants;

/**
 * 将user对象放入request中
 * @author shengchenglong
 *
 */
public class SysUserFilter extends PathMatchingFilter {
	
	@Autowired
	private SysUserService userService;

	@Override
	protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue)
			throws Exception {

		String username = (String) SecurityUtils.getSubject().getPrincipal();
		request.setAttribute(Constants.CURRENT_USER, userService.selectByUsername(username));
		return true;
	}

}

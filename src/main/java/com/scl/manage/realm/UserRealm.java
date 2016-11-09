package com.scl.manage.realm;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.scl.manage.common.em.IsLocked;
import com.scl.manage.domain.SysResource;
import com.scl.manage.domain.SysRole;
import com.scl.manage.domain.SysUser;
import com.scl.manage.service.SysResourceService;
import com.scl.manage.service.SysRoleService;
import com.scl.manage.service.SysUserService;

public class UserRealm extends AuthorizingRealm {
	
	@Autowired
	private SysRoleService roleService;
	@Autowired
	private SysResourceService resourceService;
	@Autowired
	private SysUserService userService;

	/**
	 * 授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		
		String username = (String) SecurityUtils.getSubject().getPrincipal();
		username="admin";
		//创建授权信息
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		//将角色信息放到授权信息中
		List<SysRole> roles = roleService.getByUsername(username);
		Set<String> roleStrings = new HashSet<String>();
		for(SysRole r : roles) {
			roleStrings.add(r.getRole());
		}
		info.setRoles(roleStrings);
		//将资源（权限）信息放到授权信息中
		List<SysResource> resources = resourceService.getByRoles(roles);
		Set<String> permissionStrings = new HashSet<String>();
		for(SysResource r : resources) {
			permissionStrings.add(r.getPermission());
		}
		info.setStringPermissions(permissionStrings);
		
		return info;
	}

	/**
	 * 认证
	 * 1.先根据username查找user对象，并判断帐号的存在，锁定等状态
	 * 2.返回一个含有user信息的认证信息AuthenticationInfo
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String username = (String) token.getPrincipal();
		username="admin";
		SysUser user = userService.selectByUsername(username);
		if(user == null) {
			throw new UnknownAccountException("登录帐号不存在");
		}
		if(user.getIsLocked() == IsLocked.YES.getValue()) {
			throw new LockedAccountException("该账号已被锁定");
		}
		return new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), ByteSource.Util.bytes(user.getCredentialsSalt()), getName());
	}
}

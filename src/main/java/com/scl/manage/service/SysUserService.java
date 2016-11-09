package com.scl.manage.service;

import com.scl.manage.domain.SysUser;

/**
 * 用户（后台管理用户）接口
 * @author shengchenglong
 *
 */
public interface SysUserService {
	
    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
    
    SysUser selectByUsername(String username);

}

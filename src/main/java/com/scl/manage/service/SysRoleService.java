package com.scl.manage.service;

import java.util.List;
import java.util.Set;

import com.scl.manage.domain.SysRole;

/**
 * 角色接口
 * @author shengchenglong
 *
 */
public interface SysRoleService {
	
    int deleteByPrimaryKey(String id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
    
    /**
     * 根据username获得该user对象相应的角色
     * @param username
     * @return
     */
    List<SysRole> getByUsername(String username);
}

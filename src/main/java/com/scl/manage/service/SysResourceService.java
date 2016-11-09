package com.scl.manage.service;

import java.util.List;

import com.scl.manage.domain.SysResource;
import com.scl.manage.domain.SysRole;

/**
 * 资源接口
 * @author shengchenglong
 *
 */
public interface SysResourceService {
	
    int deleteByPrimaryKey(String id);

    int insert(SysResource record);

    int insertSelective(SysResource record);

    SysResource selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysResource record);

    int updateByPrimaryKey(SysResource record);

    /**
     * 根据角色来获取资源
     * @param roleId
     * @return
     */
    List<SysResource> getByRoles(List<SysRole> roles);
    
    List<SysResource> getAll();
}

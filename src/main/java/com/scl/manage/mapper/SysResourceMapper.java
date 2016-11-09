package com.scl.manage.mapper;

import java.util.List;

import com.scl.manage.domain.SysResource;
import com.scl.manage.domain.SysRole;

public interface SysResourceMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysResource record);

    int insertSelective(SysResource record);

    SysResource selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysResource record);

    int updateByPrimaryKey(SysResource record);
    
    /**
     * *******
     * @param roles 这里穿的参数名 在xml中都是list
     * @return
     */
    List<SysResource> getByRoles(List<SysRole> roles);
    
    /**
     * 获取所有资源
     * @return
     */
    List<SysResource> getAll();
    
}
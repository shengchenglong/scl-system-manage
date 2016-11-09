package com.scl.manage.service;

import com.scl.manage.domain.SysOrganization;

/**
 * 组织接口
 * @author shengchenglong
 *
 */
public interface SysOrganizationService {

    int deleteByPrimaryKey(String id);

    int insert(SysOrganization record);

    int insertSelective(SysOrganization record);

    SysOrganization selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysOrganization record);

    int updateByPrimaryKey(SysOrganization record);
}

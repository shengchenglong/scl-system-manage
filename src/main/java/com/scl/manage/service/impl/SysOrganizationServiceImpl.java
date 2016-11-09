package com.scl.manage.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scl.manage.domain.SysOrganization;
import com.scl.manage.mapper.SysOrganizationMapper;
import com.scl.manage.service.SysOrganizationService;

/**
 * 组织接口实现类
 * @author shengchenglong
 *
 */
@Service
@Transactional
public class SysOrganizationServiceImpl implements SysOrganizationService {

	@Resource
	private SysOrganizationMapper organizationMapper;
	
	@Override
	public int deleteByPrimaryKey(String id) {
		return organizationMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SysOrganization record) {
		return organizationMapper.insert(record);
	}

	@Override
	public int insertSelective(SysOrganization record) {
		return organizationMapper.insertSelective(record);
	}

	@Override
	public SysOrganization selectByPrimaryKey(String id) {
		return organizationMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(SysOrganization record) {
		return organizationMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SysOrganization record) {
		return organizationMapper.updateByPrimaryKey(record);
	}

}

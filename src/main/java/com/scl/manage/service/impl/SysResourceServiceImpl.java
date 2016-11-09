package com.scl.manage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scl.manage.domain.SysResource;
import com.scl.manage.domain.SysRole;
import com.scl.manage.mapper.SysResourceMapper;
import com.scl.manage.service.SysResourceService;

/**
 * 资源接口实现类
 * @author shengchenglong
 *
 */
@Service
@Transactional
public class SysResourceServiceImpl implements SysResourceService {
	
	@Resource
	private SysResourceMapper resourceMapper;

	@Override
	public int deleteByPrimaryKey(String id) {
		return resourceMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SysResource record) {
		return resourceMapper.insert(record);
	}

	@Override
	public int insertSelective(SysResource record) {
		return resourceMapper.insertSelective(record);
	}

	@Override
	public SysResource selectByPrimaryKey(String id) {
		return resourceMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(SysResource record) {
		return resourceMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SysResource record) {
		return resourceMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<SysResource> getByRoles(List<SysRole> roles) {
		return resourceMapper.getByRoles(roles);
	}

	@Override
	public List<SysResource> getAll() {
		return resourceMapper.getAll();
	}


}

package com.scl.manage.service.impl;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scl.manage.domain.SysRole;
import com.scl.manage.mapper.SysRoleMapper;
import com.scl.manage.service.SysRoleService;

/**
 * 角色接口实现类
 * @author shengchenglong
 *
 */
@Service
@Transactional
public class SysRoleServiceImpl implements SysRoleService {

	@Resource
	private SysRoleMapper roleMapper;
	
	@Override
	public int deleteByPrimaryKey(String id) {
		return roleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SysRole record) {
		return roleMapper.insert(record);
	}

	@Override
	public int insertSelective(SysRole record) {
		return roleMapper.insertSelective(record);
	}

	@Override
	public SysRole selectByPrimaryKey(String id) {
		return roleMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(SysRole record) {
		return roleMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SysRole record) {
		return roleMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<SysRole> getByUsername(String username) {
		return roleMapper.getByUsername(username);
	}


}

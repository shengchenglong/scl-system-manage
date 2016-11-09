package com.scl.manage.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scl.manage.domain.SysUser;
import com.scl.manage.mapper.SysUserMapper;
import com.scl.manage.service.SysUserService;

/**
 * 后台管理用户接口实现类
 * @author shengchenglong
 *
 */
@Service
@Transactional
public class SysUserServiceImpl implements SysUserService {

	@Resource
	private SysUserMapper userMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SysUser record) {
		return userMapper.insert(record);
	}

	@Override
	public int insertSelective(SysUser record) {
		return userMapper.insertSelective(record);
	}

	@Override
	public SysUser selectByPrimaryKey(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(SysUser record) {
		return userMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SysUser record) {
		return userMapper.updateByPrimaryKey(record);
	}

	@Override
	public SysUser selectByUsername(String username) {
		return userMapper.selectByUsername(username);
	}

}

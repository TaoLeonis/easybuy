package com.easyui.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easyui.mapper.UserMapper;
import com.easyui.pojo.News;
import com.easyui.pojo.User;
import com.easyui.pojo.UserExample;
import com.easyui.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public long countByExample(UserExample example) {
		// TODO Auto-generated method stub
		return userMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(UserExample example) {
		// TODO Auto-generated method stub
		return userMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String EU_USER_ID) {
		// TODO Auto-generated method stub
		return userMapper.deleteByPrimaryKey(EU_USER_ID);
	}

	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return userMapper.insert(record);
	}

	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return userMapper.insertSelective(record);
	}

	@Override
	public List<User> selectByExample(UserExample example) {
		// TODO Auto-generated method stub
		return userMapper.selectByExample(example);
	}

	@Override
	public User selectByPrimaryKey(String EU_USER_ID) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(EU_USER_ID);
	}

	@Override
	public int updateByExampleSelective(User record, UserExample example) {
		// TODO Auto-generated method stub
		return userMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(User record, UserExample example) {
		// TODO Auto-generated method stub
		return userMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKey(record);
	}

	@Override
	public PageInfo<User> queryCurrPageUser(UserExample example, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		return new PageInfo<User>(userMapper.selectByExample(example)) ;
	}

}

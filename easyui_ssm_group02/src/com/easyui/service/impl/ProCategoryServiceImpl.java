package com.easyui.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easyui.mapper.ProCategoryMapper;
import com.easyui.pojo.ProCategory;
import com.easyui.pojo.ProCategoryExample;
import com.easyui.pojo.ProCategoryExample.Criteria;
import com.easyui.pojo.User;
import com.easyui.service.ProCategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class ProCategoryServiceImpl implements ProCategoryService {
	@Autowired
	private ProCategoryMapper proCategoryMapper;
	@Override
	public long countByExample(ProCategoryExample example) {
		// TODO Auto-generated method stub
		return proCategoryMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ProCategoryExample example) {
		// TODO Auto-generated method stub
		return proCategoryMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer epcId) {
		// TODO Auto-generated method stub
		return proCategoryMapper.deleteByPrimaryKey(epcId);
	}

	@Override
	public int insert(ProCategory record) {
		// TODO Auto-generated method stub
		return proCategoryMapper.insert(record);
	}

	@Override
	public int insertSelective(ProCategory record) {
		// TODO Auto-generated method stub
		return proCategoryMapper.insertSelective(record);
	}

	@Override
	public List<ProCategory> selectByExample(ProCategoryExample example) {		
		return proCategoryMapper.selectByExample(example);
	}

	@Override
	public ProCategory selectByPrimaryKey(Integer epcId) {
		// TODO Auto-generated method stub
		return proCategoryMapper.selectByPrimaryKey(epcId);
	}

	@Override
	public int updateByExampleSelective(ProCategory record, ProCategoryExample example) {
		// TODO Auto-generated method stub
		return proCategoryMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(ProCategory record, ProCategoryExample example) {
		// TODO Auto-generated method stub
		return proCategoryMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(ProCategory record) {
		// TODO Auto-generated method stub
		return proCategoryMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ProCategory record) {
		// TODO Auto-generated method stub
		return proCategoryMapper.updateByPrimaryKey(record);
	}

	@Override
	public PageInfo<ProCategory> queryCurrPageCategory(ProCategoryExample example, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		return new PageInfo<ProCategory>(proCategoryMapper.selectByExample(example)) ;
	}

}

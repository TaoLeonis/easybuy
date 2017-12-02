package com.easyui.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easyui.mapper.OrderMapper;
import com.easyui.pojo.Comment;
import com.easyui.pojo.Order;
import com.easyui.pojo.OrderExample;
import com.easyui.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderMapper orderMapper;
	@Override 
	public long countByExample(OrderExample example) {
		// TODO Auto-generated method stub
		return orderMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(OrderExample example) {
		// TODO Auto-generated method stub
		return orderMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer eoId) {
		// TODO Auto-generated method stub
		return orderMapper.deleteByPrimaryKey(eoId);
	}

	@Override
	public int insert(Order record) {
		// TODO Auto-generated method stub
		return orderMapper.insert(record);
	}

	@Override
	public int insertSelective(Order record) {
		// TODO Auto-generated method stub
		return orderMapper.insertSelective(record);
	}

	@Override
	public List<Order> selectByExample(OrderExample example) {
		// TODO Auto-generated method stub
		return orderMapper.selectByExample(example);
	}

	@Override
	public Order selectByPrimaryKey(Integer eoId) {
		// TODO Auto-generated method stub
		return orderMapper.selectByPrimaryKey(eoId);
	}

	@Override
	public int updateByExampleSelective(Order record, OrderExample example) {
		// TODO Auto-generated method stub
		return orderMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Order record, OrderExample example) {
		// TODO Auto-generated method stub
		return orderMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Order record) {
		// TODO Auto-generated method stub
		return orderMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Order record) {
		// TODO Auto-generated method stub
		return orderMapper.updateByPrimaryKey(record);
	}

	@Override
	public PageInfo<Order> queryCurrPageOrder(OrderExample example, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		return new PageInfo<Order>(orderMapper.selectByExample(example)) ;
	}

}

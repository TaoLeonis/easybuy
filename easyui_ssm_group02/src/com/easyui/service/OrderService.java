package com.easyui.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.easyui.pojo.Comment;
import com.easyui.pojo.Order;
import com.easyui.pojo.OrderExample;
import com.github.pagehelper.PageInfo;

public interface OrderService {
	long countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Integer eoId);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer eoId);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

	PageInfo<Order> queryCurrPageOrder(OrderExample example, Integer pageNum, Integer pageSize);
}

package com.easyui.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easyui.mapper.ProductMapper;
import com.easyui.pojo.News;
import com.easyui.pojo.Product;
import com.easyui.pojo.ProductExample;
import com.easyui.service.ProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductMapper productMapper;
	@Override
	public long countByExample(ProductExample example) {
		// TODO Auto-generated method stub
		return productMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ProductExample example) {
		// TODO Auto-generated method stub
		return productMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer epId) {
		// TODO Auto-generated method stub
		return productMapper.deleteByPrimaryKey(epId);
	}

	@Override
	public int insert(Product record) {
		// TODO Auto-generated method stub
		return productMapper.insert(record);
	}

	@Override
	public int insertSelective(Product record) {
		// TODO Auto-generated method stub
		return productMapper.insertSelective(record);
	}

	@Override
	public List<Product> selectByExample(ProductExample example) {
		// TODO Auto-generated method stub
		return productMapper.selectByExample(example);
	}

	@Override
	public Product selectByPrimaryKey(Integer epId) {
		// TODO Auto-generated method stub
		return productMapper.selectByPrimaryKey(epId);
	}

	@Override
	public int updateByExampleSelective(Product record, ProductExample example) {
		// TODO Auto-generated method stub
		return productMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Product record, ProductExample example) {
		// TODO Auto-generated method stub
		return productMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Product record) {
		// TODO Auto-generated method stub
		return productMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Product record) {
		// TODO Auto-generated method stub
		return productMapper.updateByPrimaryKey(record);
	}

	@Override
	public PageInfo<Product> queryCurrPageProduct(ProductExample example, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		return new PageInfo<Product>(productMapper.selectByExample(example)) ;
	}

}

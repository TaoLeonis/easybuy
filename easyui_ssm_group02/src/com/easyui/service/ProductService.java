package com.easyui.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.easyui.pojo.News;
import com.easyui.pojo.Product;
import com.easyui.pojo.ProductExample;
import com.github.pagehelper.PageInfo;

public interface ProductService {
	long countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Integer epId);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(Integer epId);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

	PageInfo<Product> queryCurrPageProduct(ProductExample example, Integer pageNum, Integer pageSize);
}

package com.easyui.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.easyui.pojo.News;
import com.easyui.pojo.ProCategory;
import com.easyui.pojo.ProCategoryExample;
import com.github.pagehelper.PageInfo;

public interface ProCategoryService {
	long countByExample(ProCategoryExample example);

    int deleteByExample(ProCategoryExample example);

    int deleteByPrimaryKey(Integer epcId);

    int insert(ProCategory record);

    int insertSelective(ProCategory record);

    List<ProCategory> selectByExample(ProCategoryExample example);

    ProCategory selectByPrimaryKey(Integer epcId);

    int updateByExampleSelective(@Param("record") ProCategory record, @Param("example") ProCategoryExample example);

    int updateByExample(@Param("record") ProCategory record, @Param("example") ProCategoryExample example);

    int updateByPrimaryKeySelective(ProCategory record);

    int updateByPrimaryKey(ProCategory record);

	PageInfo<ProCategory> queryCurrPageCategory(ProCategoryExample example, Integer pageNum, Integer pageSize);
}

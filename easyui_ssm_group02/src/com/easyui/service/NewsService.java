package com.easyui.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.easyui.pojo.News;
import com.easyui.pojo.NewsExample;
import com.github.pagehelper.PageInfo;

public interface NewsService {
	long countByExample(NewsExample example);

    int deleteByExample(NewsExample example);

    int deleteByPrimaryKey(Integer enId);

    int insert(News record);

    int insertSelective(News record);

    List<News> selectByExample(NewsExample example);

    News selectByPrimaryKey(Integer enId);

    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
    
    PageInfo<News> queryCurrPageNews(NewsExample example,int pageNum,int pageSize);

	List<News> queryTop7News();
}

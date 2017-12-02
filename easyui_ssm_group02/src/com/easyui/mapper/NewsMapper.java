package com.easyui.mapper;

import com.easyui.pojo.News;
import com.easyui.pojo.NewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsMapper {
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
}
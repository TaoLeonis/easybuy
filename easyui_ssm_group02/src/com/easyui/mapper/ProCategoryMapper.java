package com.easyui.mapper;

import com.easyui.pojo.ProCategory;
import com.easyui.pojo.ProCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProCategoryMapper {
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
}
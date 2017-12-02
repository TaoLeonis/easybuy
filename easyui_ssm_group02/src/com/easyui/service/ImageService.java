package com.easyui.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.easyui.pojo.Image;
import com.easyui.pojo.ImageExample;


public interface ImageService {
	long countByExample(ImageExample example);

    int deleteByExample(ImageExample example);

    int deleteByPrimaryKey(Integer eiPid);

    int insert(Image record);

    int insertSelective(Image record);

    List<Image> selectByExample(ImageExample example);

    Image selectByPrimaryKey(Integer eiPid);

    int updateByExampleSelective(@Param("record") Image record, @Param("example") ImageExample example);

    int updateByExample(@Param("record") Image record, @Param("example") ImageExample example);

    int updateByPrimaryKeySelective(Image record);

    int updateByPrimaryKey(Image record);
}

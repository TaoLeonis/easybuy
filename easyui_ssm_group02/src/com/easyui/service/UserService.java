package com.easyui.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.easyui.pojo.News;
import com.easyui.pojo.NewsExample;
import com.easyui.pojo.User;
import com.easyui.pojo.UserExample;
import com.github.pagehelper.PageInfo;

public interface UserService {
	long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String EU_USER_ID);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String EU_USER_ID);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	PageInfo<User> queryCurrPageUser(UserExample example, Integer pageNum, Integer pageSize);

}

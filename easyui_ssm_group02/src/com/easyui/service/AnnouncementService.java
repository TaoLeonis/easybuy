package com.easyui.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.easyui.pojo.Announcement;
import com.easyui.pojo.AnnouncementExample;
import com.github.pagehelper.PageInfo;

public interface AnnouncementService {
	long countByExample(AnnouncementExample example);

    int deleteByExample(AnnouncementExample example);

    int deleteByPrimaryKey(Integer eaId);

    int insert(Announcement record);

    int insertSelective(Announcement record);

    List<Announcement> selectByExample(AnnouncementExample example);

    Announcement selectByPrimaryKey(Integer eaId);

    int updateByExampleSelective(@Param("record") Announcement record, @Param("example") AnnouncementExample example);

    int updateByExample(@Param("record") Announcement record, @Param("example") AnnouncementExample example);

    int updateByPrimaryKeySelective(Announcement record);

    int updateByPrimaryKey(Announcement record);

	PageInfo<Announcement> queryCurrPageAnnouncement(AnnouncementExample example, int i, int j);
}

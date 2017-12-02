package com.easyui.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easyui.mapper.AnnouncementMapper;
import com.easyui.pojo.Announcement;
import com.easyui.pojo.AnnouncementExample;
import com.easyui.service.AnnouncementService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class AnnouncementServiceImpl implements AnnouncementService{
	
	@Autowired
	private AnnouncementMapper announcementMapper;
	
	@Override
	public long countByExample(AnnouncementExample example) {
		// TODO Auto-generated method stub
		return announcementMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(AnnouncementExample example) {
		// TODO Auto-generated method stub
		return announcementMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer eaId) {
		// TODO Auto-generated method stub
		return announcementMapper.deleteByPrimaryKey(eaId);
	}

	@Override
	public int insert(Announcement record) {
		// TODO Auto-generated method stub
		return announcementMapper.insert(record);
	}

	@Override
	public int insertSelective(Announcement record) {
		// TODO Auto-generated method stub
		return announcementMapper.insertSelective(record);
	}

	@Override
	public List<Announcement> selectByExample(AnnouncementExample example) {
		// TODO Auto-generated method stub
		return announcementMapper.selectByExample(example);
	}

	@Override
	public Announcement selectByPrimaryKey(Integer eaId) {
		// TODO Auto-generated method stub
		return announcementMapper.selectByPrimaryKey(eaId);
	}

	@Override
	public int updateByExampleSelective(Announcement record, AnnouncementExample example) {
		// TODO Auto-generated method stub
		return announcementMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Announcement record, AnnouncementExample example) {
		// TODO Auto-generated method stub
		return announcementMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Announcement record) {
		// TODO Auto-generated method stub
		return announcementMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Announcement record) {
		// TODO Auto-generated method stub
		return announcementMapper.updateByPrimaryKey(record);
	}
	
	@Override
	public PageInfo<Announcement> queryCurrPageAnnouncement(AnnouncementExample example, int i, int j) {
		PageHelper.startPage(i,j);
		return new PageInfo<Announcement>(announcementMapper.selectByExample(example)) ;
	}
}

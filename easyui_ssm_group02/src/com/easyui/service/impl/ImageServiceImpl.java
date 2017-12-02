package com.easyui.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easyui.mapper.ImageMapper;
import com.easyui.pojo.Image;
import com.easyui.pojo.ImageExample;
import com.easyui.service.ImageService;

@Service
public class ImageServiceImpl implements ImageService{
	@Autowired
	private ImageMapper imageMapper;
	
	@Override
	public long countByExample(ImageExample example) {
		// TODO Auto-generated method stub
		return imageMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ImageExample example) {
		// TODO Auto-generated method stub
		return imageMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer eiPid) {
		// TODO Auto-generated method stub
		return imageMapper.deleteByPrimaryKey(eiPid);
	}

	@Override
	public int insert(Image record) {
		// TODO Auto-generated method stub
		return imageMapper.insert(record);
	}

	@Override
	public int insertSelective(Image record) {
		// TODO Auto-generated method stub
		return imageMapper.insertSelective(record);
	}

	@Override
	public List<Image> selectByExample(ImageExample example) {
		// TODO Auto-generated method stub
		return imageMapper.selectByExample(example);
	}

	@Override
	public Image selectByPrimaryKey(Integer eiPid) {
		// TODO Auto-generated method stub
		return imageMapper.selectByPrimaryKey(eiPid);
	}

	@Override
	public int updateByExampleSelective(Image record, ImageExample example) {
		// TODO Auto-generated method stub
		return imageMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Image record, ImageExample example) {
		// TODO Auto-generated method stub
		return imageMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Image record) {
		// TODO Auto-generated method stub
		return imageMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Image record) {
		// TODO Auto-generated method stub
		return imageMapper.updateByPrimaryKey(record);
	}

}

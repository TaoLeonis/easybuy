package com.easyui.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easyui.mapper.CommentMapper;
import com.easyui.pojo.Comment;
import com.easyui.pojo.CommentExample;
import com.easyui.service.CommentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentMapper commentMapper; 
	@Override
	public long countByExample(CommentExample example) {
		// TODO Auto-generated method stub
		return commentMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CommentExample example) {
		// TODO Auto-generated method stub
		return commentMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer ecId) {
		// TODO Auto-generated method stub
		return commentMapper.deleteByPrimaryKey(ecId);
	}

	@Override
	public int insert(Comment record) {
		// TODO Auto-generated method stub
		return commentMapper.insert(record);
	}

	@Override
	public int insertSelective(Comment record) {
		// TODO Auto-generated method stub
		return commentMapper.insertSelective(record);
	}

	@Override
	public List<Comment> selectByExample(CommentExample example) {
		// TODO Auto-generated method stub
		return commentMapper.selectByExample(example);
	}

	@Override
	public Comment selectByPrimaryKey(Integer ecId) {
		// TODO Auto-generated method stub
		return commentMapper.selectByPrimaryKey(ecId);
	}

	@Override
	public int updateByExampleSelective(Comment record, CommentExample example) {
		// TODO Auto-generated method stub
		return commentMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Comment record, CommentExample example) {
		// TODO Auto-generated method stub
		return commentMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Comment record) {
		// TODO Auto-generated method stub
		return commentMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Comment record) {
		// TODO Auto-generated method stub
		return commentMapper.updateByPrimaryKey(record);
	}

	@Override
	public PageInfo<Comment> queryCurrPageComment(CommentExample example, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		return new PageInfo<Comment>(commentMapper.selectByExample(example)) ;
	}

}

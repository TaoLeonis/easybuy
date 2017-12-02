package com.easyui.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.easyui.mapper.NewsMapper;
import com.easyui.mapper.NewsRedisMapper;
import com.easyui.pojo.News;
import com.easyui.pojo.NewsExample;
import com.easyui.service.NewsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class NewsServiceImpl implements NewsService {
	@Autowired
	private NewsMapper newsMapper;
	@Autowired // key "top7newList" 前7条记录 -->创建 dao 使用redis实现 操作
	private RedisTemplate<String, List<News>> redisTemplate;

	@Override
	public int deleteByPrimaryKey(Integer enId) {
		if(newsMapper.deleteByPrimaryKey(enId)==1){
			redisTemplate.delete("top7NewsList") ;
		}
		return 1;
	}

	@Override
	public int insert(News record) {
		if(newsMapper.insert(record)==1){
			redisTemplate.delete("top7NewsList") ;
		}
		return 1;
	}

	@Override
	public int insertSelective(News record) {
		// TODO Auto-generated method stub
		return newsMapper.insertSelective(record);
	}

	@Override
	public News selectByPrimaryKey(Integer enId) {
		// TODO Auto-generated method stub
		return newsMapper.selectByPrimaryKey(enId);
	}

	@Override
	public int updateByPrimaryKeySelective(News record) {
		if(newsMapper.updateByPrimaryKeySelective(record)==1){
			redisTemplate.delete("top7NewsList") ;
		}
		return 1;
	}

	@Override
	public int updateByPrimaryKey(News record) {
		if(newsMapper.updateByPrimaryKey(record)==1){
			redisTemplate.delete("top7NewsList") ;
		}
		return 1;
	}

	@Override
	public long countByExample(NewsExample example) {
		// TODO Auto-generated method stub
		return newsMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(NewsExample example) {
		// TODO Auto-generated method stub
		return newsMapper.deleteByExample(example);
	}

	@Override
	public List<News> selectByExample(NewsExample example) {
		// TODO Auto-generated method stub
		return newsMapper.selectByExample(example);
	}

	@Override
	public int updateByExampleSelective(News record, NewsExample example) {
		// TODO Auto-generated method stub
		return newsMapper.updateByExample(record, example);
	}

	@Override
	public int updateByExample(News record, NewsExample example) {
		// TODO Auto-generated method stub
		return newsMapper.updateByExample(record, example);
	}

	@Override
	public PageInfo<News> queryCurrPageNews(NewsExample example, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<News>(newsMapper.selectByExample(example));
	}

	@Override
	public List<News> queryTop7News() {
		// 从redis查询
		List<News> newsList = redisTemplate.opsForValue().get("top7NewsList");
		// 如果查询不到，从 mysql数据库查询
		if (newsList == null || newsList.isEmpty()) {
			NewsExample example = new NewsExample();
			example.setOrderByClause(" EN_CREATE_TIME DESC ");
			PageHelper.startPage(1, 7);
			// 从mysql中捞出数据
			newsList = newsMapper.selectByExample(example);
			// 存放 redis中
			redisTemplate.opsForValue().set("top7NewsList", newsList);
		}
		return newsList;
	}

}

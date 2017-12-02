package com.easyui.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;


import com.easyui.pojo.News;

@Repository
public class NewsRedisMapper {
	@Autowired
	private RedisTemplate<String, List<News>> redisTemplate ;
	
	public List<News> get(String param){
		List<News> newsList = redisTemplate.opsForValue().get(param);
		if(newsList==null || newsList.isEmpty()){

		}
		return newsList;
	}
	
	public void set(String param,List<News> newsList){
		redisTemplate.opsForValue().set(param, newsList);
	}
	
}

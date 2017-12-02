package com.easyui.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.easyui.pojo.News;
import com.easyui.pojo.NewsExample;
import com.easyui.service.NewsService;
import com.easyui.utils.IDUtil;

@Controller
public class NewsController {
	@Autowired 
	private NewsService newsService;
	
	//使用ajax + redis 读取数据
	@RequestMapping(value="newsAjax",method=RequestMethod.GET)
	@ResponseBody
	public List<News> newsListAjaxTop7(){
		return newsService.queryTop7News() ;
	}
	
	
	/* 使用ajax 从数据库中 捞出 前7条记录
	@RequestMapping(value="newsAjax",method=RequestMethod.GET)
	@ResponseBody
	public List<News> newsListAjaxTop7(){
		NewsExample example = new NewsExample() ;
		example.setOrderByClause(" EN_CREATE_TIME DESC ");
		return newsService.queryCurrPageNews(example, 1, 7).getList() ;
	}*/
	
	/**
	 * 前台根据id查询商品
	 * @param enId
	 * @return
	 */
	@RequestMapping(value="newsAjaxView",method=RequestMethod.GET)
	@ResponseBody
	public News loadNewsView(Integer enId){
		News news = newsService.selectByPrimaryKey(enId);
		return news ;
	}
	
	@RequestMapping(value="news",method=RequestMethod.GET)
	public String toPageList(){
		return "redirect:/news/1/3//.do" ;
	}
	/**
	 * @return
	 */
	/*@RequestMapping(value="news",method=RequestMethod.GET)
	public ModelAndView listNews(){
		NewsExample example = new NewsExample() ;
		ModelAndView md = new ModelAndView() ;
		md.setViewName("manage/news-list");
		md.addObject("newsList",newsService.selectByExample(example)) ;
		return md ;
	}*/
	
	/**
	 * 实现分页+模糊查询 处理
	 * @return
	 */
	@RequestMapping(value="news/{pageNum}/{pageSize}/{enTitle}",method=RequestMethod.GET)
	public ModelAndView listCurrPageNews(@PathVariable Integer pageNum,@PathVariable Integer pageSize,@PathVariable String enTitle){
		ModelAndView md = new ModelAndView() ;
		md.addObject("enTitle",enTitle);
		md.setViewName("manage/news-list");
		NewsExample example = new NewsExample();
		example.createCriteria().andEnTitleLike("%"+enTitle+"%") ;
		md.addObject("pageInfo",newsService.queryCurrPageNews(example, pageNum, pageSize)) ;
		return md ;
	}
	
	@RequestMapping(value="news",method=RequestMethod.DELETE)
	public String removeNews(Integer enId){
		newsService.deleteByPrimaryKey(enId);
		return "redirect:/news/1/3//.do" ;
	}
	
	
	@RequestMapping(value="news/{enId}",method=RequestMethod.GET)
	public ModelAndView loadNews(@PathVariable Integer enId){
		ModelAndView md = new ModelAndView() ;
		md.setViewName("manage/news-modify");
		md.addObject("news",newsService.selectByPrimaryKey(enId)) ;
		return md ;
	}
	
	@RequestMapping(value="news",method=RequestMethod.PUT)
	public String modifyNews(News news){
		newsService.updateByPrimaryKey(news);
		return "redirect:/news/1/3//.do" ;
	}
	
	@RequestMapping(value="news",method=RequestMethod.POST)
	public String addNews(News news){
		news.setEnId(IDUtil.randId());
		news.setEnCreateTime(new Date());
		newsService.insert(news);
		return "redirect:/news/1/3//.do" ;
	}
	
	@RequestMapping(value="news1/{toNewsPage}",method=RequestMethod.GET)
	public String toNewsPage(@PathVariable String toNewsPage){
		return "manage/"+toNewsPage;
	}

	
}

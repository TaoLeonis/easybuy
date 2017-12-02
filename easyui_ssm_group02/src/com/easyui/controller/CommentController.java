package com.easyui.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.easyui.pojo.Comment;
import com.easyui.pojo.CommentExample;
import com.easyui.service.CommentService;

@Controller
public class CommentController {
	@Autowired
	private CommentService commentService;
	
//	@RequestMapping(value="comment",method=RequestMethod.GET)
//	public ModelAndView listComment(){
//		CommentExample example = new CommentExample() ;
//		ModelAndView md = new ModelAndView() ;
//		md.setViewName("manage/comment-list");
//		md.addObject("commentList",commentService.selectByExample(example)) ;
//		return md ;
//	}
	
	/**
	 * 实现分页+模糊查询 处理
	 * @return
	 */
	@RequestMapping(value="comment/{pageNum}/{pageSize}/{ecNickName}",method=RequestMethod.GET)
	public ModelAndView listCurrPageComment(@PathVariable Integer pageNum,@PathVariable Integer pageSize,@PathVariable String ecNickName){
		ModelAndView md = new ModelAndView() ;
		md.addObject("ecNickName",ecNickName);
		md.setViewName("manage/comment-list");
		CommentExample example = new CommentExample() ;
		example.createCriteria().andEcNickNameLike("%"+ecNickName+"%");
		md.addObject("pageInfo",commentService.queryCurrPageComment(example, pageNum, pageSize)) ;
		return md ;
	}
	
	@RequestMapping(value="comment",method=RequestMethod.DELETE)
	public String removeComment(Integer ecId){
		commentService.deleteByPrimaryKey(ecId);
		return "redirect:/comment/1/3//.do" ;
	}
	
	
	@RequestMapping(value="comment/{ecId}",method=RequestMethod.GET)
	public ModelAndView loadComment(@PathVariable Integer ecId){
		ModelAndView md = new ModelAndView() ;
		md.setViewName("manage/guestbook-modify");
		md.addObject("comment",commentService.selectByPrimaryKey(ecId)) ;
		return md ;
	}

	@RequestMapping(value="comment",method=RequestMethod.PUT)
	public String updateComment(Comment comment){
		comment.setEcCreateTime(new Date());
		comment.setEcReplyTime(new Date());
		commentService.updateByPrimaryKey(comment);
		return "redirect:/comment/1/3//.do";

	}
}

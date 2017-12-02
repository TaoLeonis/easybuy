package com.easyui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.easyui.pojo.Announcement;
import com.easyui.pojo.AnnouncementExample;
import com.easyui.service.AnnouncementService;


@Controller
public class AnnouncementController {	
	@Autowired 
	private AnnouncementService announcementService;
	
	@RequestMapping(value="announcementAjax",method=RequestMethod.GET)
	@ResponseBody
	public List<Announcement> announcementListAjaxTop7(){
		AnnouncementExample example = new AnnouncementExample() ;
		example.setOrderByClause(" EA_ID DESC ");
		return announcementService.queryCurrPageAnnouncement(example, 1, 7).getList() ;
	}
	
	/**
	 * 前台根据id查询商品
	 * @param eaId
	 * @return
	 */
	@RequestMapping(value="announcementAjaxView",method=RequestMethod.GET)
	@ResponseBody
	public Announcement loadAnnouncementView(Integer eaId){
		Announcement announcement = announcementService.selectByPrimaryKey(eaId);
		return announcement ;
	}
	
}

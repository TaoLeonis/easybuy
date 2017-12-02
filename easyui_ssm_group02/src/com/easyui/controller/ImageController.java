package com.easyui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.easyui.pojo.Image;
import com.easyui.service.ImageService;
import com.easyui.utils.IDUtil;

@Controller
public class ImageController {
	@Autowired
	private ImageService imageService;
	
	@RequestMapping(value="image",method=RequestMethod.POST)
	public String addNews(Image image){
		image.setEiPid(IDUtil.randId());
		imageService.insert(image);
		return "redirect:/image.do";
	}
}

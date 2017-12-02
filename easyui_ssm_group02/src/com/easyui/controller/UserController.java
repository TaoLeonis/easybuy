package com.easyui.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.easyui.pojo.User;
import com.easyui.pojo.UserExample;
import com.easyui.service.UserService;
import com.easyui.utils.IDUtil;

@Controller
public class UserController {
	@Autowired 
	private UserService userService;
	@Value("${userHeader.upload.path}")
	private String IMG_UPLOAD_PATH;
	/*@RequestMapping(value="user",method=RequestMethod.GET)
	public ModelAndView listUser(){
		UserExample example = new UserExample() ;
		ModelAndView md = new ModelAndView() ;
		md.setViewName("manage/user-list");
		md.addObject("userList",userService.selectByExample(example)) ;
		return md ;
	}*/
	
	/**
	 * 实现分页+模糊查询 处理
	 * @return
	 */
	@RequestMapping(value="user/{pageNum}/{pageSize}/{EU_USER_NAME}",method=RequestMethod.GET)
	public ModelAndView listCurrPageUser(@PathVariable Integer pageNum,@PathVariable Integer pageSize,@PathVariable String EU_USER_NAME){
		ModelAndView md = new ModelAndView() ;
		md.addObject("EU_USER_NAME",EU_USER_NAME);
		md.setViewName("manage/user-list");
		UserExample example = new UserExample();
		example.createCriteria().andEU_USER_NAMELike("%"+EU_USER_NAME+"%");
		md.addObject("pageInfo",userService.queryCurrPageUser(example, pageNum, pageSize)) ;
		return md ;
	}
	
	@RequestMapping(value="user",method=RequestMethod.DELETE)
	public String removeUser(String EU_USER_ID){
		userService.deleteByPrimaryKey(EU_USER_ID);
		return "redirect:/user/1/3//.do" ;
	}
	
	@RequestMapping(value="user/{EU_USER_ID}",method=RequestMethod.GET)
	public ModelAndView loadUser(@PathVariable String EU_USER_ID){
		ModelAndView md = new ModelAndView() ;
		md.setViewName("manage/user-modify");
		md.addObject("user",userService.selectByPrimaryKey(EU_USER_ID)) ;
		return md ;
	}
	
	@RequestMapping(value="user",method=RequestMethod.PUT)
	public String modifyUser(User user){
		user.setEU_STATUS(1);
		user.setEU_DELETE_STATUS(0);
		userService.updateByPrimaryKey(user);
		return "redirect:/user/1/3//.do";
	}
	
	/*@RequestMapping(value="user",method=RequestMethod.POST)
	public String addUser(User user){
		user.setEU_STATUS(1);
		user.setEU_DELETE_STATUS(0);
		System.out.println(IDUtil.randStringId());
		user.setEU_USER_ID(IDUtil.randStringId());
		userService.insert(user);
		return "redirect:/user/1/3//.do" ;
	}*/
	
	@RequestMapping(value="user1/{toUserPage}",method=RequestMethod.GET)
	public String toUserPage(@PathVariable String toUserPage){
		return "manage/"+toUserPage;
	}
	
	/**
	 * @param photo
	 * @param user
	 * @return
	 */
	@RequestMapping(value="user",method=RequestMethod.POST)
	public String saveUser(@RequestParam("photo") CommonsMultipartFile photo,HttpServletRequest request, User user){
		System.out.println("--------->"+IMG_UPLOAD_PATH);
		user.setEU_STATUS(1);
		user.setEU_DELETE_STATUS(0);
		user.setEU_USER_ID(IDUtil.randStringId());
//		String tomcatPath = request.getServletContext().getRealPath("/images/userHeader/") ;
//		File target = new File(tomcatPath+user.getEuUserId()+"."+photo.getOriginalFilename()) ;
		String extendsName = photo.getOriginalFilename().substring(photo.getOriginalFilename().lastIndexOf(".")) ;
		File target = new File(IMG_UPLOAD_PATH+user.getEU_USER_ID()+extendsName) ;
		try {
			//进行文件上传
			photo.transferTo(target);
			//上传无异常，写入数据库
			userService.insert(user);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/user/1/3//.do" ;
	}
}

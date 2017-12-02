package com.easyui.controller;

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
import com.easyui.pojo.ProCategory;
import com.easyui.pojo.ProCategoryExample;
import com.easyui.pojo.ProCategoryExample.Criteria;
import com.easyui.service.ProCategoryService;
import com.easyui.utils.IDUtil;

@Controller
public class ProCategoryController {
	@Autowired
	private ProCategoryService proCategoryService;
	
	@RequestMapping(value="categoryAjax",method=RequestMethod.GET)
	@ResponseBody
	public List<ProCategory> categoryListAjax(){
		ProCategoryExample example = new ProCategoryExample() ;
		
		//example.createCriteria().andEpcParentIdEqualTo(0);
		/*List<ProCategory> parentCategory = proCategoryService.selectByExample(example);
		System.out.println(parentCategory);
		for (ProCategory proCategory : parentCategory) {
			ProCategoryExample example1 = new ProCategoryExample() ;
			example1.createCriteria().andEpcParentIdEqualTo(proCategory.getEpcId());
			List<ProCategory> sonCategory = proCategoryService.selectByExample(example1);
			for (ProCategory proCategory2 : sonCategory) {
				parentCategory.add(proCategory2);
			}
		}*/
		return proCategoryService.selectByExample(example);
	}
//	@RequestMapping(value="category",method=RequestMethod.GET)
//	public ModelAndView listCategory(){
//		ProCategoryExample example = new ProCategoryExample() ;
//		ModelAndView md = new ModelAndView() ;
//		md.setViewName("manage/category-list");
//		md.addObject("categoryList",proCategoryService.selectByExample(example)) ;
//		return md ;
//	}
	
	/**
	 * 实现分页+模糊查询 处理
	 * @return
	 */
	@RequestMapping(value="category/{pageNum}/{pageSize}/{epcName}",method=RequestMethod.GET)
	public ModelAndView listCurrPageCategory(@PathVariable Integer pageNum,@PathVariable Integer pageSize,@PathVariable String epcName){
		ModelAndView md = new ModelAndView();
		md.addObject("epcName",epcName);
		md.setViewName("manage/category-list");
		ProCategoryExample example = new ProCategoryExample();
		example.createCriteria().andEpcNameLike("%"+epcName+"%");
		md.addObject("pageInfo",proCategoryService.queryCurrPageCategory(example, pageNum, pageSize)) ;
		return md ;
	}
	
	@RequestMapping(value="category",method=RequestMethod.DELETE)
	public String removeCategory(Integer epcId){
		proCategoryService.deleteByPrimaryKey(epcId);
		return "redirect:/category/1/3//.do";
	}
	
	@RequestMapping(value="category/{epcId}",method=RequestMethod.GET)
	public ModelAndView loadCategory(@PathVariable Integer epcId){
		ProCategoryExample example = new ProCategoryExample() ;
		ModelAndView md = new ModelAndView() ;
		md.setViewName("manage/category-modify");
		md.addObject("categoryList",proCategoryService.selectByExample(example));
		md.addObject("category",proCategoryService.selectByPrimaryKey(epcId)) ;
		return md ;
	}
	
	@RequestMapping(value="category",method=RequestMethod.PUT)
	public String modifyCategory(ProCategory proCategory){
		proCategoryService.updateByPrimaryKey(proCategory);
		return "redirect:/category/1/3//.do" ;
	}
	
	@RequestMapping(value="category",method=RequestMethod.POST)
	public String addCategory(ProCategory proCategory){
		System.out.println(proCategory.toString());
		proCategory.setEpcId(IDUtil.randId());
		proCategoryService.insert(proCategory);
		return "redirect:/category/1/3//.do" ;
	}
	
	@RequestMapping(value="category1/{toCategoryPage}",method=RequestMethod.GET)
	public ModelAndView toCategoryPage(@PathVariable String toCategoryPage){
		ProCategoryExample example = new ProCategoryExample() ;
		ModelAndView md = new ModelAndView() ;
		md.setViewName("manage/"+toCategoryPage);
		md.addObject("categoryList",proCategoryService.selectByExample(example));
		return md;
	}
	
}

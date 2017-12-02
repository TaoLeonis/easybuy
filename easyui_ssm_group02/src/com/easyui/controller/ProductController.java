package com.easyui.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.easyui.pojo.News;
import com.easyui.pojo.NewsExample;
import com.easyui.pojo.ProCategory;
import com.easyui.pojo.ProCategoryExample;
import com.easyui.pojo.ProCategoryExample.Criteria;
import com.easyui.pojo.Product;
import com.easyui.pojo.ProductExample;
import com.easyui.pojo.User;
import com.easyui.service.ProCategoryService;
import com.easyui.service.ProductService;
import com.easyui.utils.IDUtil;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	@Autowired
	private ProCategoryService proCategoryService;
	
	@Value("${userHeader.upload.path}")
	private String IMG_UPLOAD_PATH;
//	@RequestMapping(value="product",method=RequestMethod.GET)
//	public ModelAndView listProduct(){
//		ProductExample example = new ProductExample() ;
//		ModelAndView md = new ModelAndView() ;
//		md.setViewName("manage/product-list");
//		md.addObject("productList",productService.selectByExample(example)) ;
//		return md ;
//	}
//	
	
	@RequestMapping(value="productAjax",method=RequestMethod.GET)
	@ResponseBody
	public List<Product> newsListAjaxTop7(){
		ProductExample example = new ProductExample() ;
		example.setOrderByClause(" EP_PRICE ");
		return productService.queryCurrPageProduct(example, 1, 8).getList() ;
	}
	
	@RequestMapping(value="productAjax1",method=RequestMethod.GET)
	@ResponseBody
	public List<Product> newsListAjaxTop12(){
		ProductExample example = new ProductExample() ;
		example.setOrderByClause(" EP_STOCK ");
		return productService.queryCurrPageProduct(example, 1, 12).getList() ;
	}
	/**
	 * 实现分页+模糊查询 处理
	 * http://localhost:8080/easyui_ssm_group02/product/1/3/2/.do
	 * 
	 * @return
	 */
	@RequestMapping(value="product/{pageNum}/{pageSize}/{epId}/{epName}",method=RequestMethod.GET)
	public ModelAndView listCurrPageProduct(@PathVariable Integer pageNum,@PathVariable Integer pageSize,@PathVariable Integer epId,@PathVariable String epName){
		ModelAndView md = new ModelAndView() ;
		md.addObject("epId",epId);
		md.addObject("epName",epName);
		md.setViewName("manage/product-list");
		ProductExample example = new ProductExample();
		example.createCriteria().andEpNameLike("%"+epName+"%") ;
		example.createCriteria().andEpIdEqualTo(epId);
		md.addObject("pageInfo",productService.queryCurrPageProduct(example, pageNum, pageSize)) ;
		return md ;
	}
	
	@RequestMapping(value="product",method=RequestMethod.DELETE)
	public String removeProduct(Integer epId){
		productService.deleteByPrimaryKey(epId);
		return "redirect:/product/1/3/1/.do" ;
	}
	/**
	 * 后台根据id查询商品
	 * @param epId
	 * @return
	 */
	@RequestMapping(value="product/{epId}",method=RequestMethod.GET)
	public ModelAndView loadProduct(@PathVariable Integer epId){
		ModelAndView md = new ModelAndView() ;
		md.setViewName("manage/product-modify");
		md.addObject("product",productService.selectByPrimaryKey(epId)) ;
		return md ;
	}
	
	/**
	 * 前台根据id查询商品
	 * @param epId
	 * @return
	 */
	@RequestMapping(value="productAjaxView",method=RequestMethod.GET)
	@ResponseBody
	public Product loadProductView(Integer epId){
		Product product = productService.selectByPrimaryKey(epId);
		return product ;
	}
	
	@RequestMapping(value="product",method=RequestMethod.PUT)
	public String modifyProduct(Product product){
		productService.updateByPrimaryKey(product);
		return "redirect:/product/1/3/1/.do" ;
	}
	
	/*@RequestMapping(value="product",method=RequestMethod.POST)
	public String addProduct(Product product){
		product.setEpId(IDUtil.randId());
		productService.insert(product);
		return "redirect:/product/1/3/1/.do" ;
	}*/
	
	@RequestMapping(value="product1/{toProductPage}",method=RequestMethod.GET)
	public ModelAndView toProductPage(@PathVariable String toProductPage){
		ModelAndView md = new ModelAndView();
		ProCategoryExample example = new ProCategoryExample();
		//实现or 查询
		/*Criteria criteria1 = example.createCriteria(); 
		criteria1.andEpcParentIdEqualTo(0);
		Criteria criteria2 = example.createCriteria(); 
		criteria2.andEpcParentIdIsNull();*/
		md.addObject("categoryList",proCategoryService.selectByExample(example));
		md.setViewName("manage/"+toProductPage);
		return md;
	}
	
	/**
	 * @param photo
	 * @param user
	 * @return
	 */
	@RequestMapping(value="product",method=RequestMethod.POST)
	public String saveProduct(@RequestParam("photo") CommonsMultipartFile photo,HttpServletRequest request, Product product){
		System.out.println("--------->"+IMG_UPLOAD_PATH);
		product.setEpId(IDUtil.randId());
		String extendsName = photo.getOriginalFilename().substring(photo.getOriginalFilename().lastIndexOf(".")) ;
		File target = new File(IMG_UPLOAD_PATH+product.getEpId()+extendsName) ;
		try {
			//进行文件上传
			photo.transferTo(target);
			//上传无异常，写入数据库
			productService.insert(product);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/product/1/3/1/.do" ;
	}
}

package com.easyui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.easyui.pojo.OrderExample;
import com.easyui.pojo.Order;
import com.easyui.service.OrderService;


@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;
	
//	@RequestMapping(value="order",method=RequestMethod.GET)
//	public ModelAndView listOrder(){
//		OrderExample example = new OrderExample() ;
//		ModelAndView md = new ModelAndView() ;
//		md.setViewName("manage/order-list");
//		md.addObject("orderList",orderService.selectByExample(example)) ;
//		return md ;
//	}
	
	/**
	 * 实现分页+模糊查询 处理
	 * @return
	 */
	@RequestMapping(value="order/{pageNum}/{pageSize}/{eoId}/{eoUserName}",method=RequestMethod.GET)
	public ModelAndView listCurrPageOrder(@PathVariable Integer pageNum,@PathVariable Integer pageSize,@PathVariable Integer eoId,@PathVariable String eoUserName){
		ModelAndView md = new ModelAndView() ;
		md.addObject("eoId",eoId);
		md.addObject("eoUserName",eoUserName);
		md.setViewName("manage/order-list");
		OrderExample example = new OrderExample() ;
		example.createCriteria().andEoUserNameLike("%"+eoUserName+"%");
		example.createCriteria().andEoIdEqualTo(eoId);
		md.addObject("pageInfo",orderService.queryCurrPageOrder(example, pageNum, pageSize)) ;
		return md ;
	}
	
	@RequestMapping(value="order",method=RequestMethod.DELETE)
	public String removeOrder(Integer eoId){
		orderService.deleteByPrimaryKey(eoId);
		return "redirect:/order/1/3/1/.do" ;
	}
	
	@RequestMapping(value="order/{eoId}",method=RequestMethod.GET)
	public ModelAndView loadOrder(@PathVariable Integer eoId){
		ModelAndView md = new ModelAndView() ;
		md.setViewName("manage/order-modify");
		md.addObject("order",orderService.selectByPrimaryKey(eoId)) ;
		return md ;
	}
	
	@RequestMapping(value="order",method=RequestMethod.PUT)
	public String modifyOrder(Order order){
		orderService.updateByPrimaryKey(order);
		return "redirect:/order/1/3/1/.do" ;
	}
	

}

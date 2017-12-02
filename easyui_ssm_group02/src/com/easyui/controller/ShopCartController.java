package com.easyui.controller;

import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.easyui.pojo.Item;
import com.easyui.service.ShopCartService;
import com.easyui.service.impl.ShopCartServiceImpl;

@Controller
public class ShopCartController {
	
	@RequestMapping(value="shopcart",method=RequestMethod.POST)
	@ResponseBody
	public boolean addItem(Item it,HttpSession session){
		System.out.println(it);
		//用户是否已经有购物车
		ShopCartService sc = (ShopCartService)session.getAttribute("sc");
		if(sc==null){
			sc = new ShopCartServiceImpl() ;
			session.setAttribute("sc", sc); 
		}
		sc.addItem(it);
		return true ;
	}
	
	@RequestMapping(value="shopcart",method=RequestMethod.GET)
	@ResponseBody
	public Collection<Item> listItem(HttpSession session){
		//用户是否已经有购物车
		ShopCartService sc = (ShopCartService)session.getAttribute("sc");
		return sc.showItems() ;
	}
}

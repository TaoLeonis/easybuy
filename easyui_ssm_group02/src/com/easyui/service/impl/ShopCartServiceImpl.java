package com.easyui.service.impl;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import com.easyui.pojo.Item;
import com.easyui.service.ShopCartService;

public class ShopCartServiceImpl implements ShopCartService{
	private Map<String,Item> items = new LinkedHashMap<String,Item>();
	/**
	 * 显示购物车中 所有的商品
	 * @return
	 */
	public Collection<Item> showItems(){
		return items.values();
	}
	
	/**
	 * 向购物中添加商品
	 * @param it
	 */
	public void addItem(Item it){
		if(items.containsKey(it.getEpId())){
			Item carIt = items.get(it.getEpId()) ;
			carIt.setEpCount(carIt.getEpCount()+1);
			return ;
		}
		items.put(it.getEpId(), it) ;
	}
	
	// ....   修改数量 ，删除
}

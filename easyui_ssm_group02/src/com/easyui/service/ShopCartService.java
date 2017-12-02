package com.easyui.service;

import java.util.Collection;

import com.easyui.pojo.Item;

public interface ShopCartService {
	Collection<Item> showItems();
	
	void addItem(Item it);
}

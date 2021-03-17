package com.reljicd.model;

import java.util.List;

public class Cart {

	Integer userId;

	List<Item> item;
	
	

	public Cart() {
		
	}

	public Cart(Integer userId, List<Item> item) {
		this.userId = userId;
		this.item = item;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public synchronized List<Item> getItem() {
		return item;
	}

	public synchronized void setItem(List<Item> item) {
		this.item = item;
	}

	
}

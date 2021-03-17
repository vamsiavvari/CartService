package com.reljicd.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.reljicd.model.Cart;
import com.reljicd.model.Item;
import com.reljicd.service.CartInterface;
@Service
public class CartServiceImpl implements CartInterface {
	
	
	static List<Item> listItemOne = new ArrayList<Item>(Arrays.asList(new Item(1, 2, "Bulk", new BigDecimal(20), "INR"),new Item(1, 3, "Bulk", new BigDecimal(50), "INR"),new Item(5, 3, "Bulk", new BigDecimal(50), "INR")));
	static List<Item> listItemTwo = new ArrayList<Item>(Arrays.asList(new Item(3, 5, "Bulk", new BigDecimal(20), "INR"),new Item(4, 1, "Single", new BigDecimal(70), "INR")));
	
	static Cart cartUserOne = new Cart(1, listItemOne);
	static Cart cartUserTwo = new Cart(2, listItemTwo);
	static public Map<Integer, Cart> mapOfUserCarts = new HashMap<Integer, Cart>();
	static
	{
		mapOfUserCarts.put(1, cartUserOne);
		mapOfUserCarts.put(2, cartUserTwo);
	}

	
    
    @Override
    public Cart getCartForUser(Integer userid) throws Exception
    {
       return mapOfUserCarts.get(userid);
    
    }
    @Override
    public Cart deleteCart(Integer userid) {
    	Cart removedCartEntries = mapOfUserCarts.remove(userid);
		return removedCartEntries;
    }

    
    @Override
    public Map<Integer, Cart> addItemsInCart(Integer userId, Cart cart)
    {
    	if(cartUserOne.getUserId().equals(userId)) {
    		cartUserOne.getItem().addAll(cart.getItem());
    	} else if (cartUserTwo.getUserId().equals(userId)) {
    		cartUserTwo.getItem().addAll(cart.getItem());
    	}
    	return mapOfUserCarts;
    }
}

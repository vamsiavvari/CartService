package com.reljicd.service;

import java.util.Map;

import com.reljicd.model.Cart;

public interface CartInterface
{
    Cart getCartForUser(Integer userid) throws Exception;
    Map<Integer, Cart> addItemsInCart(Integer userId, Cart cart);
    Cart deleteCart(Integer userid);
}

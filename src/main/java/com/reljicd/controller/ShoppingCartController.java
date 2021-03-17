package com.reljicd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.reljicd.model.Cart;
import com.reljicd.service.impl.CartServiceImpl;

@Controller
public class ShoppingCartController {

	CartServiceImpl cartServiceImpl;

	ShoppingCartController(CartServiceImpl cartServiceImpl) {
		this.cartServiceImpl = cartServiceImpl;

	}

	@CrossOrigin("*")
	@GetMapping("/cart/user/{userid}")
	@ResponseBody
	public Cart getAllItemsForUser(@PathVariable Integer userid) throws Exception {
		return cartServiceImpl.getCartForUser(userid);
	}

	@CrossOrigin("*")
	@PostMapping("/cart/{userid}")
	@ResponseBody
	public void addItemsInCart(@PathVariable Integer userid,@RequestBody Cart cart) {
		cartServiceImpl.addItemsInCart(userid, cart);
	}

	@CrossOrigin("*")
	@DeleteMapping("/cart/delete/{userid}")
	@ResponseBody
	public void addItemInCart(@PathVariable Integer userid) {
		cartServiceImpl.deleteCart(userid);
	}

}

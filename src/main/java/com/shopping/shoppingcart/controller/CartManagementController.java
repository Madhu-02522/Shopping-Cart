package com.shopping.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.shoppingcart.dto.CartManagementDto;
import com.shopping.shoppingcart.service.CartManagementService;

@RestController
public class CartManagementController {

	@Autowired

	private CartManagementService cartManagementService;

	@PostMapping("/cartmanagement")
	public CartManagementDto saveCart(@RequestBody CartManagementDto cartDto) {

		CartManagementDto cartdto = new CartManagementDto();
		cartdto = cartManagementService.saveCart(cartDto);
		return cartdto;

	}
}

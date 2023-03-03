package com.shopping.shoppingcart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.shoppingcart.converters.CartManagementConverter;
import com.shopping.shoppingcart.dao.CartManagementRepository;
import com.shopping.shoppingcart.dto.CartManagementDto;
import com.shopping.shoppingcart.entity.CartManagementEntity;

@Service

public class CartManagementServiceimpl implements CartManagementService {
	@Autowired
	private CartManagementRepository cartManagementRepository;
	
	@Autowired
	private CartManagementConverter cartManagementConverter;

	@Override
	public CartManagementDto saveCart(CartManagementDto cartDto) {
		// TODO Auto-generated method stub
		
		CartManagementEntity cartEntity=new CartManagementEntity();
		cartEntity=cartManagementConverter.convertToEntity(cartDto, null);
		cartEntity=cartManagementRepository.save(cartEntity);
		CartManagementDto dto=new CartManagementDto();
		dto=cartManagementConverter.convertToDto(cartEntity, null);
		return dto;
	}
	


	
	

	

	
	
		
		
	

	
}

package com.shopping.shoppingcart.converters;

import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.shopping.shoppingcart.dto.CartManagementDto;
import com.shopping.shoppingcart.entity.CartManagementEntity;
@Service
@Qualifier("CartManagementConverter")
public class CartManagementConverter implements EntityDtoConverter<CartManagementEntity, CartManagementDto> {

	@Override
	public CartManagementEntity convertToEntity(CartManagementDto dto, Map<String, Object> propertyMap) {
		// TODO Auto-generated method stub

		CartManagementEntity entity = new CartManagementEntity();

		entity.setCartid(dto.getcId());
		entity.setProductid(dto.getpId());
		entity.setQuantity(dto.getQuantity());
		entity.setUserid(dto.getuId());
		
		return entity;
	}

	@Override
	public CartManagementDto convertToDto(CartManagementEntity entity, Map<String, Object> propertyMap) {

		CartManagementDto dto = new CartManagementDto();
		dto.setcId(entity.getCartid());
		dto.setpId(entity.getProductid());
		dto.setQuantity(entity.getQuantity());
		dto.setuId(entity.getUserid());
		
		return dto;

	}

}

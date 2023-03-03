package com.shopping.shoppingcart.converters;

import java.util.Map;

import com.shopping.shoppingcart.dto.CartManagementDto;
import com.shopping.shoppingcart.entity.CartManagementEntity;

public interface EntityDtoConverter <E extends CartManagementEntity,D extends CartManagementDto> {
	
	E convertToEntity(D dto, Map<String,Object>propertyMap);
	
	D convertToDto(E entity, Map<String,Object>propertyMap);

}

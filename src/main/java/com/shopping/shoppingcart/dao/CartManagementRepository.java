package com.shopping.shoppingcart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.shoppingcart.entity.CartManagementEntity;

@Repository
public interface CartManagementRepository extends JpaRepository<CartManagementEntity, Long>{
               
}

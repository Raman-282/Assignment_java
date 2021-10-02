package com.mapping.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.database.entity.CartItem;

@Repository
public interface CartItemRepo extends JpaRepository<CartItem, Integer>{

}

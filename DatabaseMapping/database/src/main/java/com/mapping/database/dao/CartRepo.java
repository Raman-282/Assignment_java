package com.mapping.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mapping.database.entity.Cart;

@Repository
public interface CartRepo extends JpaRepository<Cart, Integer> {

}

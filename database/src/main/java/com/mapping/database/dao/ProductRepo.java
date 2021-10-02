package com.mapping.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.database.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}

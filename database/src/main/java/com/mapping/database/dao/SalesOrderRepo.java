package com.mapping.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.database.entity.SalesOrder;

@Repository
public interface SalesOrderRepo  extends JpaRepository<SalesOrder, Integer>{

}

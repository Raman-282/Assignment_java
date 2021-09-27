package com.mapping.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.database.entity.BillingAddress;

@Repository
public interface BillingRepo extends JpaRepository<BillingAddress, Integer> {

}


package com.mapping.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.database.entity.ShippingAddress;

@Repository
public interface ShippingAddressRepo extends JpaRepository<ShippingAddress, Integer>{

}

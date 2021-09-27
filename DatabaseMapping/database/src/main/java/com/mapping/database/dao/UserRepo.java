package com.mapping.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.database.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}

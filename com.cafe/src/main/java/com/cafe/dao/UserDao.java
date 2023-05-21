package com.cafe.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cafe.POJO.User;

public interface UserDao extends JpaRepository<User, Integer>{

}

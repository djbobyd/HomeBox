package com.adraood.homebox.dao.user;

import com.adraood.homebox.dao.Dao;
import com.adraood.homebox.entity.User;

import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserDao extends Dao<User, Long>, UserDetailsService {

	User findByName(String name);

}

package com.hotel.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.user.entity.User2;

public interface UserDao extends JpaRepository<User2,String> {
	//User2 findUser2ByUsernameAndPasswordIsLike(String username,String password); 
}

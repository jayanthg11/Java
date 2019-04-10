package com.hotel.user.service;

import java.util.List;

import com.hotel.user.entity.User2;

public interface UserInterface {

	//boolean verifyCredentials(String username, String password);

	List<User2> listAll();

}
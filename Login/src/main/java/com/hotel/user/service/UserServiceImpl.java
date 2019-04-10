package com.hotel.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.user.dao.UserDao;
import com.hotel.user.entity.User2;

@Service
public class UserServiceImpl implements UserInterface {
	
	
	@Autowired
	UserDao us;
	
	@Override
	public List<User2> listAll(){
		return us.findAll();
	}

	
	
//	@Override
//	public boolean verifyCredentials(String username,String password) {
//		System.out.println("***************name");
//		User2 user=us.findUser2ByUsernameAndPasswordIsLike(username, password);
//		System.out.println("***************name"+user.getUsername());
//		if(user==null)
//			return false;
//		else
//			return true;
//		
//	}

}

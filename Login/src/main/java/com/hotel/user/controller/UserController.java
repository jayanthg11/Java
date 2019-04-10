package com.hotel.user.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hotel.user.entity.User2;
import com.hotel.user.service.UserInterface;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	UserInterface ui;
	
	
	
	
	
//	@PostMapping("/api")
//	public void verifyCredentials(@RequestBody User2 user) {
//		String username=user.getUsername();
//		String password=user.getPassword();
//		System.out.print("************************************************************************");
//		if(ui.verifyCredentials(username, password)) {
//			System.out.print("************************************************************************");
//		}
////			return "true";
//		else {
//			System.out.print("************************************************************************");
//		}
////			return "false";
//	}
	
	
	
	@GetMapping
	public List<User2> list() {
		List<User2> list=ui.listAll();
		return list;
	}

}

package com.project.LoginAuthentication.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.LoginAuthentication.entity.UserInfo;
import com.project.LoginAuthentication.service.UserService;

@RestController
@RequestMapping("/register")
public class RegistrationController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/RegisterUser")
	public void RegisterUser(@RequestBody UserInfo hotelUser) {
		userService.RegisterUser(hotelUser);
	}

}

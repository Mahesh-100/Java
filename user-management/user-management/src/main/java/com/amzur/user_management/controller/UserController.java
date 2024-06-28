package com.amzur.user_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.amzur.user_management.dto.request.UserRequest;
import com.amzur.user_management.entities.User;
import com.amzur.user_management.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userservice;
	
	
	@PostMapping("/register")
	@ResponseStatus(value = HttpStatus.CREATED)
	public User register(@RequestBody UserRequest userRequest) {
		
		return userservice.save(userRequest);
	}
	
	
	
}

package com.user_management.user_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.user_management.user_management.dto.request.UserRequest;
import com.user_management.user_management.dto.response.UserResponse;
import com.user_management.user_management.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	@ResponseStatus(value = HttpStatus.CREATED)
	public UserResponse register(@RequestBody UserRequest userRequest) {
		
		return userService.save(userRequest);
	}
	
	
}

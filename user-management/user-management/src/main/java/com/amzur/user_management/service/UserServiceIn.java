package com.amzur.user_management.service;

import java.util.List;

import com.amzur.user_management.dto.request.UserRequest;
import com.amzur.user_management.dto.response.UserResponse;


public interface UserServiceIn {
	
	public UserResponse save(UserRequest userRequest);
	
	 public List<UserResponse> findAll();
	 
	public UserResponse findByEmail(String email);

	public void deleteById(long userId);

}

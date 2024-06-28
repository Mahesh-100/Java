package com.amzur.user_management.service;

import com.amzur.user_management.dto.request.UserRequest;
import com.amzur.user_management.entities.User;

public interface UserServiceIn {
	
	public User save(UserRequest userRequest);
	
	public User findByEmail(String email);

}

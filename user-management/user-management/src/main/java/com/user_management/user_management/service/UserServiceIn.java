package com.user_management.user_management.service;

import com.user_management.user_management.dto.request.UserRequest;
import com.user_management.user_management.dto.response.UserResponse;


public interface UserServiceIn {

	public UserResponse save(UserRequest userRequest);
}

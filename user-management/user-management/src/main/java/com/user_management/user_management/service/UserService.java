package com.user_management.user_management.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user_management.user_management.dto.request.UserRequest;
import com.user_management.user_management.dto.response.UserResponse;
import com.user_management.user_management.entity.UserEntity;
import com.user_management.user_management.repository.UserRepository;

@Service
public class UserService implements UserServiceIn{

	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserResponse save(UserRequest userRequest) {
		UserEntity userEntity=new UserEntity();
		BeanUtils.copyProperties(userRequest, userEntity);
		userEntity=userRepository.save(userEntity);
		UserResponse userResponse=new UserResponse();
		BeanUtils.copyProperties(userEntity, userResponse);
		return userResponse;
	}

	
	
}

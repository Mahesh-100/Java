package com.amzur.user_management.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.amzur.user_management.dto.request.UserRequest;
import com.amzur.user_management.entities.User;
import com.amzur.user_management.repository.UserRepository;
@Service
public class UserService implements UserServiceIn{

	
	private UserRepository userRepository;

                                                                   
	@Override
	public User save(UserRequest userRequest) {
		User user=new User();
		BeanUtils.copyProperties(userRequest, user);
		return userRepository.save(user);
	}

	@Override
	public User findByEmail(String email) {
		
		return userRepository.findByEmail(email);
	}

	
	
}

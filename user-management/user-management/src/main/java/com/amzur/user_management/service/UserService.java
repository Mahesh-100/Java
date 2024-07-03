package com.amzur.user_management.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amzur.user_management.dto.request.UserRequest;
import com.amzur.user_management.dto.response.UserResponse;
import com.amzur.user_management.entities.UserEntity;
import com.amzur.user_management.repository.UserRepository;
@Service
public class UserService implements UserServiceIn{

	@Autowired
	
	private UserRepository userRepository;

                                                                   
	@Override
	public UserResponse save(UserRequest userRequest) {
		UserEntity userEntity=new UserEntity();
		BeanUtils.copyProperties(userRequest, userEntity);
		userEntity=userRepository.save(userEntity);
//		UserResponse userResponse=new UserResponse();
//		BeanUtils.copyProperties(userEntity, userResponse);
	  return convertEntityToResponse(userEntity);
		
	}

	@Override
	public UserResponse findByEmail(String email) {
		UserEntity userEntity=userRepository.findByEmail(email);
		//UserResponse userResponse=new UserResponse();
		
		
		// by using setters and getters method
//		userResponse.setUserId(user.getUserId());
//		userResponse.setName(user.getName());
//		userResponse.setPhoneNumber(user.getPhoneNumber());
//		userResponse.setAddress(user.getAddress());
//		userResponse.setEmail(user.getEmail());
		
		
		//BeanUtils.copyProperties(userEntity, userResponse);
		return convertEntityToResponse(userEntity);
	}

	@Override
	public List<UserResponse> findAll() {
//		List<UserEntity> users=userRepository.findAll();
//		List<UserResponse>userResponses=new ArrayList<UserResponse>();
//		for(UserEntity userEntity:users) {
////			UserResponse userReponse=new UserResponse();
////			BeanUtils.copyProperties(userEntity, userReponse);
//			userResponses.add(convertEntityToResponse(userEntity));
//		}
		return userRepository.findAll().stream().map(this::convertEntityToResponse).collect(Collectors.toList()
				);
	}

	@Override
	public void deleteById(long userId) {
		userRepository.deleteById(userId);

	}
	
	public UserResponse convertEntityToResponse(UserEntity userEntity) {
		UserResponse userReponse=new UserResponse();
		BeanUtils.copyProperties(userEntity, userReponse);
		return userReponse;
	}

	

	
	

	
	
}

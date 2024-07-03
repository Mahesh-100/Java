package com.amzur.user_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.amzur.user_management.dto.request.UserRequest;
import com.amzur.user_management.dto.response.UserResponse;
import com.amzur.user_management.service.UserServiceIn;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceIn userService;
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public String register( @Valid @RequestBody UserRequest userRequest) {
		userService.save(userRequest);
		return "Successfully Registered";
	}
	
	@GetMapping
	public List<UserResponse> getAllUsers(){
		return userService.findAll();	
		
	}
	@GetMapping("/login/{email}/{password}")
	public ResponseEntity<?> getUserDetails(@PathVariable String email,@PathVariable String password ) {
		UserResponse userResponse=userService.findByEmail(email);
		
		if(userResponse.getPassword().equals(password)) {
		   return ResponseEntity.ok(userResponse);
		}else {
			return ResponseEntity.status(401).body("Invalid Credentials");
		}	
	}
	
	@PutMapping
	public String updateUser(@RequestBody UserRequest userRequest) {
		userService.save(userRequest);
		return "Updated Successfully";
	
} 
	@DeleteMapping("/{userId}")
	public String deleteUser(@PathVariable long userId) {
		userService.deleteById(userId);
		return "Deleted Successfully";
	}
	
}

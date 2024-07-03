package com.amzur.user_management.dto.request;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data

public class UserRequest {
	private long userId;
	 @NotNull(message = "Please provide name")
	    @NotEmpty(message = "name should not be empty")
	private String name;
	 @NotNull(message = "Please provide Phone Number")
	    @NotEmpty(message = "Phone Number should not be empty")
	private String phoneNumber;
	 @NotNull(message = "Please provide Email")
	    @NotEmpty(message = "Email should not be empty")
	private String email;
	 @NotNull(message = "Please provide Password")
	    @NotEmpty(message = "Password should not be empty")
	private String password;
	 @NotNull(message = "Please provide Address")
	    @NotEmpty(message = "Address should not be empty")
	private String address;
	
	
	
	
	
	
}

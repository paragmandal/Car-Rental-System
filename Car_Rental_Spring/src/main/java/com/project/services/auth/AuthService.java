package com.project.services.auth;

import com.project.dto.SignupRequest;
import com.project.dto.UserDto;

public interface AuthService {
	
	UserDto createCustomer(SignupRequest signupRequest);

}

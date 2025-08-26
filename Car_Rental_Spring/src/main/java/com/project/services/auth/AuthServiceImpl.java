package com.project.services.auth;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.project.dto.SignupRequest;
import com.project.dto.UserDto;
import com.project.enums.UserRole;
import com.project.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{
	
	private final UserRepository userRepository ;
	
//	 public AuthServiceImpl(UserRepository userRepository) {
//	        this.userRepository = userRepository;
//	    }

	@Override
	public UserDto createCustomer(SignupRequest signupRequest) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setName(signupRequest.getName());
		user.setEmail(signupRequest.getEmail());
		user.setPassword(signupRequest.getPassword());
		user.setUserRole(UserRole.CUSTOMER);
		User createdUser= userRepository.save(user);
		
		UserDto userDto= new UserDto();
		userDto.setId(createdUser.getId());
		return userDto;
		
	}

	

}

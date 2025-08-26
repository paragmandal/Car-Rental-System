package com.project.dto;

import com.project.enums.UserRole;

import lombok.Data;

@Data
public class UserDto {
	
	private long id;
	private String name;
	private String email;
	
	
	private UserRole userRole;

}

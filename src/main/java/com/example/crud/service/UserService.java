package com.example.crud.service;

import com.example.crud.dto.UserDto;

public interface UserService {
	UserDto register(UserDto dto);
	UserDto login(String email, String password);
}

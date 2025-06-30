package com.example.crud.service.impl;

import org.springframework.stereotype.Service;

import com.example.crud.dto.UserDto;
import com.example.crud.entity.User;
import com.example.crud.mapper.UserMapper;
import com.example.crud.repository.UserRepository;
import com.example.crud.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	private final UserRepository userRepo;
	private final UserMapper userMapper;

	public UserServiceImpl(UserRepository userRepo, UserMapper userMapper) {
		this.userRepo = userRepo;
		this.userMapper = userMapper;
	}

	@Override
	public UserDto login(String email, String password) {
		 User user = userRepo.findByEmail(email).orElseThrow(() -> new RuntimeException("Email không tồn tại"));
		  if (!user.getPassword().equals(password)) {
	            throw new RuntimeException("Mật khẩu không đúng");
	        }
		  return userMapper.toDto(user);
	}

	public UserDto register(UserDto dto) {
        User user = userMapper.toEntity(dto);
        return userMapper.toDto(userRepo.save(user));
    }
	
	
}
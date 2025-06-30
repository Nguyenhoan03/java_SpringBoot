package com.example.crud.mapper;

import org.springframework.stereotype.Component;

import com.example.crud.dto.UserDto;
import com.example.crud.entity.User;

@Component
public class UserMapper {

	  public UserDto toDto(User user) {
	        UserDto dto = new UserDto();
	        dto.setId(user.getId());
	        dto.setName(user.getName());
	        dto.setEmail(user.getEmail());
	        dto.setPhone(user.getPhone());
	        dto.setAddress(user.getAddress());
	        // Không nên set password khi trả về DTO
	        return dto;
	    }

	    public User toEntity(UserDto dto) {
	        User user = new User();
	        user.setId(dto.getId());
	        user.setName(dto.getName());
	        user.setEmail(dto.getEmail());
	        user.setPhone(dto.getPhone());
	        user.setAddress(dto.getAddress());
	        user.setPassword(dto.getPassword());
	        return user;
	    }

}

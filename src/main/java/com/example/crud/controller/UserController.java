package com.example.crud.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.dto.UserDto;
import com.example.crud.service.UserService;

@RestController
public class UserController {
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/register")
	public ResponseEntity<UserDto> register(@RequestBody UserDto dto) {
		return ResponseEntity.ok(userService.register(dto));
	}

	@PostMapping("/login")
	public ResponseEntity<UserDto> login(@RequestBody Map<String, String> payload) {
		String email = payload.get("email");
		String password = payload.get("password");
		return ResponseEntity.ok(userService.login(email, password));
	}
}

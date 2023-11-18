package com.sol.vicariussolassignment.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.sol.vicariussolassignment.entity.User;
import com.sol.vicariussolassignment.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/getAll")
	Iterable<User> getAll() {
		return service.getUsers();
	}
	
	@PostMapping("/insert")
	public User insert(@RequestBody User user) {
		return service.createUser(user);
		
	}
	
	@GetMapping("/getUser")
	public Optional<User> getUserById(@RequestParam int id) {
		return service.getUserById(id);
		
	}

}

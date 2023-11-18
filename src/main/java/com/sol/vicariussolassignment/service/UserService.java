package com.sol.vicariussolassignment.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sol.vicariussolassignment.entity.User;
import com.sol.vicariussolassignment.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Iterable<User> getUsers() {
		return userRepository.findAll();
	}
	public User createUser(User user) {
		return userRepository.save(user);
	}
	public Optional<User> getUserById(int id) {
		return userRepository.findById(id);
	}

}

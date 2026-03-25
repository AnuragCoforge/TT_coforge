package com.coforge.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.controllers.UserController;
import com.coforge.entities.User;
import com.coforge.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	public List<User> findAll() {
		logger.info("Fetching All Users Info");
		return userRepository.findAll();
	}
	
	public User save(User user) {
		logger.info("Saving User info {}", user);
		return userRepository.save(user);
	}
	
	public Optional<User> findById(long id) {
		logger.info("Fetching user by user id {}", id);
		return userRepository.findById(id);
	}
	
}

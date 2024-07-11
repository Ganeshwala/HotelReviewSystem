package com.micro.userService.serivces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.micro.userService.entites.User;

@Service
public interface UserService {

	User saveNewUser(User newUser);
	
	List<User> getAllUser();
	
	User getUserById(String userId);
}

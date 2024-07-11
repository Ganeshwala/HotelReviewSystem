package com.micro.userService.serivces.Implementation;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.userService.entites.User;
import com.micro.userService.repository.UserRepo;
import com.micro.userService.serivces.UserService;

@Service
public class UserServiceImp implements UserService{
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public User saveNewUser(User newUser) {
		// TODO Auto-generated method stub
		String userId = UUID.randomUUID().toString();
		newUser.setUserId(userId);
		return userRepo.save(newUser);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		return userRepo.findById(userId).orElseThrow();
	}

}

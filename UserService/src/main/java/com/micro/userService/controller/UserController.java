package com.micro.userService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.userService.entites.User;
import com.micro.userService.serivces.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userSer;
	
	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User user){
		User newUser = userSer.saveNewUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
	}
	
	@GetMapping("/{user_Id}")
	public ResponseEntity<User> getUserDetail(@PathVariable String user_Id){
		User user = userSer.getUserById(user_Id);
		return ResponseEntity.ok(user);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> allUser = userSer.getAllUser();
		return ResponseEntity.ok(allUser);
	}
}

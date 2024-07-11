package com.micro.userService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.userService.entites.User;

@Repository
public interface UserRepo extends JpaRepository<User, String>{

}

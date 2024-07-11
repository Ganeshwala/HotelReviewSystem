package com.micro.userService.entites;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Table(name = "micro_user")
@Data
public class User {

	@Id
	private String userId;
	private String name;
	private String email;
	private String password;
	private String about;
	
	// this feild will not going to store in userService DB
	@Transient
	private List<Rating> hotelRating = new ArrayList<>();
}

package com.micro.userService.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
}

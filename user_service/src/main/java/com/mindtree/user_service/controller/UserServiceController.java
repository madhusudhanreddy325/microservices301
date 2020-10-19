package com.mindtree.user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.user_service.entity.User;
import com.mindtree.user_service.service.UserService;

@RestController
public class UserServiceController {

	@Autowired
	private UserService userService;

	@RequestMapping("/newUser")
	public String addUserToDatabase(@RequestBody User user) {
		return userService.addNewUser(user);

	}

	@RequestMapping("/checkUserRole/{userId}")
	public boolean checkUserRole(@PathVariable String userId) {
		return userService.checkRoleOfUser(userId);
	}

//	@RequestMapping("/login/{userName}/{password}")
//	public boolean userLogin(@PathVariable String userName, @PathVariable String password) {
//		return userService.checkUserLogin(userName, password);
//	}
//	
	@GetMapping("/")
	public String helloWorld() {
		return "Hello World";
	}
}

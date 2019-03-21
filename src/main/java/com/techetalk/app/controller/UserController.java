package com.techetalk.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techetalk.app.model.User;
import com.techetalk.app.service.UserServiceImpl;

@RestController
public class UserController {

	/*
	 * @Autowired UserServiceImpl userServiceImpl;
	 */

	@Autowired
	private UserServiceImpl userService;

	@RequestMapping("/")
	public List getUsers() {
		List<User> users = userService.getAllUsers();
		System.out.println(users.toString());
		return users;
	}

	@PostMapping(path = "/saveuser", consumes = "application/json", produces = "application/json")
	public void saveUsers(@RequestBody User user) {
		System.out.println("inside save");
		// User saveUser = new
		// User(user.getId(),user.getName(),user.getEmailId(),(Date)
		// user.getcreationDate());
		System.out.println("saveUser" + user.getName());
		// System.out.println("saveUser"+userServiceImpl.saveUser(saveUser));
	}
}

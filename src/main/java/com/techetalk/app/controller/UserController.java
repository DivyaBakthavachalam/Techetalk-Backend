package com.techetalk.app.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techetalk.app.model.Users;
import com.techetalk.app.service.UserServiceImpl;
import com.techtalk.app.dao.model.User;

@RestController
public class UserController {
		
	@Autowired
	UserServiceImpl userServiceImpl;
	@RequestMapping("/")
    public List getUsers() 
    {
		List employeesList = new ArrayList();
		List tagList = new ArrayList();
		tagList.add("hmysql");
		tagList.add("java");
		tagList.add("hmysql");
		tagList.add("java");
		tagList.add("hmysql");
		System.out.println("show all"+userServiceImpl.getAllUsers());
		return tagList;
    }
	@PostMapping(path="/saveuser",consumes = "application/json", produces = "application/json")
    public void saveUsers(@RequestBody Users user) 
    {System.out.println("inside save");
		//User saveUser = new User(user.getId(),user.getName(),user.getEmailId(),(Date) user.getcreationDate());
		System.out.println("saveUser"+user.getName());
		//System.out.println("saveUser"+userServiceImpl.saveUser(saveUser));
    }
}

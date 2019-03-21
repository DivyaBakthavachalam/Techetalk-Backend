package com.techetalk.app.service;

import java.util.List;

import com.techetalk.app.model.User;


public interface UserService {

	User findById(int id);
	public List<User> findAll();
}

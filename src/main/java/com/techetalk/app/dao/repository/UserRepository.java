package com.techetalk.app.dao.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.techetalk.app.model.User;


public interface UserRepository<U> extends CrudRepository<User, Long>{
	List<User> findByName(String name);
	//void saveUser(User user);
}

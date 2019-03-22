package com.techetalk.app.dao.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.techetalk.app.dao.model.UserDao;


public interface UserRepository<U> extends CrudRepository<UserDao, Long>{
	List<UserDao> findByName(String name);
	//void saveUser(User user);
}

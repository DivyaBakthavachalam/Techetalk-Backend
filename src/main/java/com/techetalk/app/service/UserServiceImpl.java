package com.techetalk.app.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techetalk.app.dao.model.UserDao;
import com.techetalk.app.dao.repository.UserRepository;
import com.techetalk.app.model.User;

@Service
public class UserServiceImpl {
	@Autowired
	UserRepository<User> userRepository;
	private static final AtomicLong counter = new AtomicLong();

	@Transactional
	public List<UserDao> getAllUsers() {
		return (List<UserDao>) userRepository.findAll();
	}

	/*@Transactional
	public boolean saveUser(User user) {
		user.setId(counter.incrementAndGet());
		return userRepository.save(user) != null;
	}*/

}

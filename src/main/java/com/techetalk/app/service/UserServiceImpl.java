package com.techetalk.app.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techetalk.app.dao.repository.UserRepository;
import com.techtalk.app.dao.model.User;

@Service
public class UserServiceImpl {
   @Autowired
   UserRepository<User> userRepository;
   private static final AtomicLong counter = new AtomicLong();
   @Transactional
   public List<User> getAllUsers()
   {
	   return(List<User>)userRepository.findAll();
   }

   @Transactional
   public boolean saveUser(User user)
   {
	   user.setId(counter.incrementAndGet());
	   return userRepository.save(user) != null;
   }

}

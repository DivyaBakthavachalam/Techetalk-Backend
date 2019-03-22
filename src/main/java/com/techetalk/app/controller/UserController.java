package com.techetalk.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techetalk.app.dao.model.QuestionsDao;
import com.techetalk.app.dao.model.UserDao;
import com.techetalk.app.model.Questions;
import com.techetalk.app.model.User;
import com.techetalk.app.service.QuestionServiceImpl;
import com.techetalk.app.service.UserServiceImpl;

@RestController
public class UserController {

	/*
	 * @Autowired UserServiceImpl userServiceImpl;
	 */

	@Autowired
	private UserServiceImpl userService;
	
	@Autowired
	private QuestionServiceImpl questionService;

	@RequestMapping("/")
	public List getUsers() {
		List<UserDao> users = userService.getAllUsers();
		System.out.println(users.toString());
		return users;
	}
	
	@RequestMapping("/getquestions")
	public List getQuestions() {
		List<QuestionsDao> question = questionService.getAllUsers();
		System.out.println(question.toString());
		return question;
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
	
	@RequestMapping(value="/savequestion", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
	public void saveQuestions(@RequestBody Questions question) {
		 questionService.saveQuestion(question);
		System.out.println(question.toString());
	}
}

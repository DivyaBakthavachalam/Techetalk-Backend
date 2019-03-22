package com.techetalk.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techetalk.app.dao.model.AnswerDao;
import com.techetalk.app.dao.model.QuestionsDao;
import com.techetalk.app.dao.model.UserDao;
import com.techetalk.app.dao.repository.AnswerRepository;
import com.techetalk.app.dao.repository.UserRepository;
import com.techetalk.app.model.Answer;

@Service
public class AnswerServiceImpl {

	@Autowired
	AnswerRepository<QuestionsDao> answerRepository;
	@Autowired
	UserRepository<UserDao> userRepository;
	
	@Transactional
	public void saveAnswer(Answer answer)
	{
		List<UserDao> userDao =userRepository.findByName(answer.getUserName());
		AnswerDao answerDao = new AnswerDao(answer.getAnswer(),answer.getUserName(),userDao.get(0).getId(),answer.getQuestionId(), answer.getCreationDate());
		answerRepository.save(answerDao);
	}
}

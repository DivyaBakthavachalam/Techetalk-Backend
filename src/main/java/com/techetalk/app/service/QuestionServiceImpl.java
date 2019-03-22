package com.techetalk.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techetalk.app.dao.model.QuestionsDao;
import com.techetalk.app.dao.model.UserDao;
import com.techetalk.app.dao.repository.QuestionRepository;
import com.techetalk.app.dao.repository.UserRepository;
import com.techetalk.app.model.Questions;

@Service
public class QuestionServiceImpl {

	@Autowired
	QuestionRepository<QuestionsDao> questionRepository;
	@Autowired
	UserRepository<UserDao> userRepository;
	@Transactional
	public List<QuestionsDao> getAllQuestions() {
		return (List<QuestionsDao>) questionRepository.findAll();
	}
	
	@Transactional
	public void saveQuestion(Questions question)
	{
		List<UserDao> userDao =userRepository.findByName(question.getUserName());
		QuestionsDao questionsDao = new QuestionsDao(question.getQuestion(),question.getUserName(),userDao.get(0).getId(), question.getCreationDate());
		questionRepository.save(questionsDao);
	}
}

package com.techetalk.app.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.techetalk.app.dao.model.AnswerDao;

public interface AnswerRepository<U> extends CrudRepository<AnswerDao,Long>{

	public AnswerDao save(AnswerDao answerDao);
}

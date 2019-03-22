package com.techetalk.app.dao.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.techetalk.app.dao.model.QuestionsDao;

public interface QuestionRepository<U> extends CrudRepository<QuestionsDao, Long> {
	//List<QuestionsDao> findByName(String name);
	QuestionsDao findById(int id);
	public List<QuestionsDao> findAll();
	public QuestionsDao save(QuestionsDao uestionsDao);
}

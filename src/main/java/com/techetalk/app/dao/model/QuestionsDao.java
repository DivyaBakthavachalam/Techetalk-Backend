package com.techetalk.app.dao.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class QuestionsDao {

	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "question")
	private String question;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "user_fk")
	private Long userId;
	@Column(name = "creation_date")
	private Date creationDate;
	
	
	public QuestionsDao()
	{
	}
	
	public QuestionsDao(Long id, String question, String userName, Long userId, Date creationDate) {
		super();
		this.id = id;
		this.question = question;
		this.userName = userName;
		this.userId = userId;
		this.creationDate = creationDate;
	}
	public QuestionsDao(String question, String userName, Long userId, Date creationDate) {
		super();
		this.question = question;
		this.userName = userName;
		this.userId = userId;
		this.creationDate = creationDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "QuestionsDAO [id=" + id + ", question=" + question + ", userName=" + userName + ", userId=" + userId
				+ ", creationDate=" + creationDate + "]";
	}
	
	
	
}

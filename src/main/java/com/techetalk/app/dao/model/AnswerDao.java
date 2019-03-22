package com.techetalk.app.dao.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "answer")
public class AnswerDao {

	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "answer")
	private String answer;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "user_fk")
	private Long userId;
	@Column(name = "question_fk")
	private Long questionId;
	@Column(name = "creation_date")
	private Date creationDate;
	
	public AnswerDao(){
		
	}
	
	public AnswerDao(Long id, String answer, String userName, Long userId, Long questionId, Date creationDate) {
		super();
		this.id = id;
		this.answer = answer;
		this.userName = userName;
		this.userId = userId;
		this.questionId = questionId;
		this.creationDate = creationDate;
	}
	
	public AnswerDao(String answer, String userName, Long userId, Long questionId, Date creationDate) {
		super();
		this.answer = answer;
		this.userName = userName;
		this.userId = userId;
		this.questionId = questionId;
		this.creationDate = creationDate;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
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
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	@Override
	public String toString() {
		return "AnswerDao [id=" + id + ", answer=" + answer + ", userName=" + userName + ", userId=" + userId
				+ ", questionId=" + questionId + ", creationDate=" + creationDate + "]";
	}
	
	
}

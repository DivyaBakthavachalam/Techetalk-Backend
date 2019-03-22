package com.techetalk.app.model;

import java.util.Date;


public class Questions {

	
	private Long id;
	private String question;
	private String userName;
	private Long userId;
	private Date creationDate;
	
	public Questions()
	{
	}
	
	public Questions(Long id, String question, String userName, Long userId, Date creationDate) {
		super();
		this.id = id;
		this.question = question;
		this.userName = userName;
		this.userId = userId;
		this.creationDate = creationDate;
	}
	
	public Questions(String question, String userName, Long userId, Date creationDate) {
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
		return "Questions [id=" + id + ", question=" + question + ", userName=" + userName + ", userId=" + userId
				+ ", creationDate=" + creationDate + "]";
	}
	
	
	
}

package com.techetalk.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class Answer {

	
		private Long id;
		private String answer;
		private String userName;
		private Long userId;
		private Long questionId;
		private Date creationDate;
		
		public Answer(){
			
		}
		
		public Answer(Long id, String answer, String userName, Long userId, Long questionId, Date creationDate) {
			super();
			this.id = id;
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
			return "Answer [id=" + id + ", answer=" + answer + ", userName=" + userName + ", userId=" + userId
					+ ", questionId=" + questionId + ", creationDate=" + creationDate + "]";
		}
		
		
}

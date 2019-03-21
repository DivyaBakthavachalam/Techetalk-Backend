package com.techetalk.app.model;

import java.util.Date;

public class Users {
	
	private int id;
	private String name;
	private String emailId;
	private String creationDate;
	
	public Users(int id, String name, String emailId, String creationDate) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.creationDate = creationDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getcreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailId=" + emailId + ",creationDate= "+creationDate+"]";
	}

	
}

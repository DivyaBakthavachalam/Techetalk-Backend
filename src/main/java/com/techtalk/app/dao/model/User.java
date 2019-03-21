/*package com.techtalk.app.dao.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
    @GeneratedValue
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "emailid")
	private String email;
	@Column(name = "creation_date")
	private Date creationDate;
	
	public User()
	{
		
	}
	
	public User(long id, String name, String email, Date creationDate) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.creationDate = creationDate;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", creationDate=" + creationDate + "]";
	}
	
	
}
*/
package com.rest.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@XmlRootElement
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
property = "userId")
@Entity
public class User {
	@Id@GeneratedValue
	private int userId;
	private String userName;
	private String  mail;
	private String password;
	@OneToMany(mappedBy="user")
	
	private List<Problem> problemList = new ArrayList<Problem>();
	
	public User() {
		super();
	}

	public User(int userId, String userName, String mail, String password,List<Problem> problemList) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.mail = mail;
		this.problemList = problemList;
	}

	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Problem> getProblemList() {
		return problemList;
	}

	public void setProblemList(List<Problem> problemList) {
		this.problemList = problemList;
	}

	
}
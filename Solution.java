package com.rest.dto;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@Entity
@Table(name="solution")
public class Solution
{

	@Id@GeneratedValue
	@Column(name="ProblemId",length=20)
	int ProblemID;
	@Column(name="Suggestion",length=500)
	String Suggestion;
	@Column(name="Date",length=10)
	String Date;

	@Column(name="Supplementaries" ,length=300)
	//@Transient //it does not involve the column in persistence
	String Supplementaries;
	
	@ManyToOne
	@JoinColumn(name ="userId")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "ProblemID")
	private Problem problem;
	
	public Solution() {
		super();
	}
	
	
	
	public Solution(int problemID, String suggestion, String date, String supplementaries, User user,
			Problem problem) {
		super();
		ProblemID = problemID;
		Suggestion = suggestion;
		Date = date;
		Supplementaries = supplementaries;
		this.user= user;
		this.problem = problem;
	}



	public int getProblemID() {
		return ProblemID;
	}



	public void setProblemID(int problemID) {
		ProblemID = problemID;
	}



	public String getSuggestion() {
		return Suggestion;
	}



	public void setSuggestion(String suggestion) {
		Suggestion = suggestion;
	}



	public String getDate() {
		return Date;
	}



	public void setDate(String date) {
		Date = date;
	}



	public String getSupplementaries() {
		return Supplementaries;
	}



	public void setSupplementaries(String supplementaries) {
		Supplementaries = supplementaries;
	}



	public User getUser() {
		return user;
	}



	public void setRegister(User user) {
		this.user = user;
	}



	public Problem getProblem() {
		return problem;
	}



	public void setProblem(Problem problem) {
		this.problem = problem;
	}
}

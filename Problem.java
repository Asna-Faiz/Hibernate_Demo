package com.rest.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@Entity
public class Problem{
	@Id@GeneratedValue
	private int problemId;
	private String problemName;
	private String problemDescription;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	
	
	@OneToMany(mappedBy = "problem")
	public List<Solution> solutions = new ArrayList<Solution>();


	public Problem() {
		super();
	}

	public Problem(int problemId, String problemName, String problemDescription, User user) {
		super();
		this.problemId = problemId;
		this.problemName = problemName;
		this.problemDescription = problemDescription;
		this.user = user;
		
	}

	public int getProblemId() {
		return problemId;
	}

	public void setProblemId(int problemId) {
		this.problemId = problemId;
	}

	public String getProblemName() {
		return problemName;
	}

	public void setProblemName(String problemName) {
		this.problemName = problemName;
	}

	public String getProblemDescription() {
		return problemDescription;
	}

	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Solution> getSolutions() {
		return solutions;
	}

	public void setSolutions(List<Solution> solutions) {
		this.solutions = solutions;
	}




	
}
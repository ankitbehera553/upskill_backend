package com.upskill.upskill.model;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "answer")
public class Answer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "submit_id")
	private int submitId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "roll_no")
	private String rollno;
	
	@ElementCollection
	@CollectionTable(name = "exam_answers", joinColumns = @JoinColumn(name = "submit_id"))
	@Column(name = "answers")
	private List<String> answers;
	
	@Column(name = "exam_id")
	private int examId;
	
	public Answer() {}
	public Answer(int submitId, String name, String email, String rollno, List<String> answers, int examId) {
		super();
		this.submitId = submitId;
		this.name = name;
		this.email = email;
		this.rollno = rollno;
		this.answers = answers;
		this.examId = examId;
	}
	
	
	public int getSubmitId() {
		return submitId;
	}
	
	public void setSubmitId(int submitId) {
		this.submitId = submitId;
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

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}
	
	@Override
	public String toString() {
		return "Answer [submitId=" + submitId + ", name=" + name + ", email=" + email + ", rollno=" + rollno
				+ ", answers=" + answers + ", examId=" + examId + "]";
	}


}

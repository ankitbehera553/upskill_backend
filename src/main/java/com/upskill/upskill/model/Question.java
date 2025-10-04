package com.upskill.upskill.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "exam_questions")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "question_id")
	private int questionId;
	
	@Column(name = "exam_id")
	private int examId;
	
	@Column(name = "question")
	private String question;

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}	
	
	public Question() {}
	
	public Question(int examId, String question) {
		this.examId = examId;
		this.question = question;
	}

	@Override
	public String toString() {
		return "Question [examId=" + examId + ", question=" + question + "]";
	}
	
	

}

package com.upskill.upskill.model;

import jakarta.persistence.*;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "examcard")
public class ExamCard {

	@Id
	@Column(name="exam_id",nullable = false, unique = true)
	@JsonProperty("examID")
	private int examId;

	@Column(name="exam_type")
	@JsonProperty("examType")
    private String examType;
	
	@Column(nullable = false,name="subject")
	@JsonProperty("subject")
    private String subject;
    
	@Column(nullable = false,name="department")
	@JsonProperty("department")
    private String department;
    
	@Column(nullable = false,name="teacher_name")
	@JsonProperty("teacherName")
    private String teacherName;
    
	@Column(name="end_date")
	@JsonProperty("endDate")
    private LocalDate endDate;
    
	@Column(nullable = false,name="total_mark")
	@JsonProperty("totalMark")
    private int totalMark;
    
	@Column(nullable = false,name="exam_name")
	@JsonProperty("examName")
    private String examName;
	
	@Column(nullable = false,name="created_by")
	@JsonProperty("createdBy")
    private String createdBy;
    
	    // Constructors
    public ExamCard() {
    }

    public ExamCard(String examType, String subject, String department, String teacherName, LocalDate endDate, int totalMark, String examName, String createdBy) {
        this.examType = examType;
        this.subject = subject;
        this.department = department;
        this.teacherName = teacherName;
        this.endDate = endDate;
        this.totalMark = totalMark;
        this.examName = examName;
        this.createdBy = createdBy;
    }
	    // Getters and Setters
    public int getExamId() {
        return examId;
    }
    public void setExamId(int examId) {
        this.examId = examId;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subjectName) {
        this.subject = subjectName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "ExamCard [examId=" + examId + ", examType=" + examType + ", subject=" + subject + ", department="
				+ department + ", teacherName=" + teacherName + ", endDate=" + endDate + ", totalMark=" + totalMark
				+ ", examName=" + examName + ", createdBy=" + createdBy + "]";
	}

	
    
}

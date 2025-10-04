package com.upskill.upskill.QuestionRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upskill.upskill.model.Question;


@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

	List<Question> findByExamId(int examId);
	
}

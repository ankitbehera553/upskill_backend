package com.upskill.upskill.answerRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upskill.upskill.model.Answer;

@Repository
public interface answerRepository extends JpaRepository<Answer, Integer> {

	List<Answer> findByExamId(int examId);

}

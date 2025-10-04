package com.upskill.upskill.QuestionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.upskill.upskill.QuestionRepository.QuestionRepository;
import com.upskill.upskill.model.Question;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@GetMapping
	public List<Question> getQuestions(int examId) {
		// TODO Auto-generated method stub
		return questionRepository.findByExamId(examId);
	}

}

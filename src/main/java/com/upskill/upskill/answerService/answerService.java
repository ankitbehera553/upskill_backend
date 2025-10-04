package com.upskill.upskill.answerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.upskill.upskill.answerRepository.answerRepository;
import com.upskill.upskill.model.Answer;

@Service
public class answerService {

	@Autowired
	private answerRepository answerRepository;
	
	public String submitAnswer(Answer answer) {
		// TODO Auto-generated method stub
		if(answerRepository.save(answer) != null) {
			return "Success";
		} else {
			return "Faild";
		}
	}
	
	@GetMapping
	public List<Answer> getByExamId(int examId) {
		// TODO Auto-generated method stub
		return answerRepository.findByExamId(examId);
	}

}

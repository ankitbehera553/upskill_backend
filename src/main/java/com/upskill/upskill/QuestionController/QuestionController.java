package com.upskill.upskill.QuestionController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.upskill.upskill.model.Question;
import com.upskill.upskill.QuestionService.QuestionService;

@RestController
@RequestMapping("/api/question")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@GetMapping("/getQuestion")
	public List<Question> getQuestions(@RequestParam int examId){
		return questionService.getQuestions(examId);
		
	}

}

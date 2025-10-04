package com.upskill.upskill.answerController;

import com.upskill.upskill.answerService.answerService;
import com.upskill.upskill.model.Answer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/answer")
@CrossOrigin(origins = "http://localhost:3000")
public class answerController {
	
	@Autowired
	private answerService answerService;
	
	@PostMapping("/submitAnswer")
	public String submitAnswer(@RequestBody Answer answer) {
		return answerService.submitAnswer(answer);
	}
	
	@GetMapping("/getByExamId")
	public List<Answer> getByExamId(@RequestParam int examId){
		return answerService.getByExamId(examId);
	}
	  
	
}

package com.upskill.upskill.ExamCardController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.upskill.upskill.ExamCardService.ExamCardService;
import com.upskill.upskill.model.ExamCard;


@RestController
@RequestMapping("/api/examcard")
@CrossOrigin(origins = "http://localhost:3000")
public class ExamCardController {
	
	@Autowired
	private ExamCardService examCardService;
	
	
	@GetMapping("/getAllExamCard")
	public List<ExamCard> getAllExamCard(){
		return examCardService.getAll();
	}
	
	@GetMapping("/getExamCardForTeacher")
	public List<ExamCard> getExamCardForTeacher(@RequestParam String createdBy){
		return examCardService.getByEmail(createdBy);
	}
	
	@GetMapping("/getExamCardForUser")
	public List<ExamCard> getExamCardForUser(@RequestParam String department){
		return examCardService.getByDepartment(department);
	}
	
	@PostMapping("/createExamCard")
	public String createExam(@RequestBody ExamCard examCard) {
		return examCardService.createExamCard(examCard);
	}
}

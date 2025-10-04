package com.upskill.upskill.ExamCardService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.upskill.upskill.ExamCardRepository.ExamCardRepository;
import com.upskill.upskill.model.ExamCard;

@Service
public class ExamCardService {
	
	@Autowired
	private ExamCardRepository examCardRepository;

	@GetMapping
	public List<ExamCard> getAll() {
		return examCardRepository.findAll();
	}
	
	@GetMapping
	public List<ExamCard> getByEmail(String createdBy){
		return examCardRepository.findByCreatedBy(createdBy);
	}

	public List<ExamCard> getByDepartment(String department) {
		return examCardRepository.findByDepartment(department);
	}

	public String createExamCard(ExamCard examCard) {
		if(examCardRepository.save(examCard) != null) {
			return "Success";
		}
		else {
			return "Faild";
		}
	}

}

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

}

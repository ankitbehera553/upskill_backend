package com.upskill.upskill.ExamCardRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upskill.upskill.model.ExamCard;

@Repository
public interface ExamCardRepository extends JpaRepository<ExamCard, Integer> {

	List<ExamCard> findByCreatedBy(String createdBy);

	List<ExamCard> findByDepartment(String department);

}

package com.upskill.upskill.ExamCardRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upskill.upskill.model.ExamCard;

@Repository
public interface ExamCardRepository extends JpaRepository<ExamCard, Integer> {

}

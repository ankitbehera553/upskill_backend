package com.upskill.upskill.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.upskill.upskill.model.Users;

import jakarta.transaction.Transactional;

public interface UserRepository extends JpaRepository<Users, String> {
	
	Users findByEmailAndPassword(String email,String password);
	
	
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM upskill.users WHERE email = :email", nativeQuery = true)
	int deleteByEmail(@Param("email") String email);

}

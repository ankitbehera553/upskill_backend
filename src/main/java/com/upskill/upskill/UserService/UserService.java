package com.upskill.upskill.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.upskill.upskill.UserRepository.UserRepository;
import com.upskill.upskill.model.Users;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public List<Users> getAll() {
		return userRepository.findAll();
	}
	
	@PostMapping
	public String createUser(Users user) {
		if(userRepository.save(user) != null) 
			return "Success";
		else
			return "Failed";
	}
	
	@GetMapping
	public Users getByEmailAndPassword(String email, String password) {
		return userRepository.findByEmailAndPassword(email,password);
	}

	public String removeUser(String email) {
		int no = userRepository.deleteByEmail(email);
		return "SUceess";
				
	}

}

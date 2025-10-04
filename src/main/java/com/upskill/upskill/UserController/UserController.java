package com.upskill.upskill.UserController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.upskill.upskill.UserRepository.UserRepository;
import com.upskill.upskill.UserService.UserService;
import com.upskill.upskill.model.Users;


@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/getAllUser")
	public List<Users> getAll(){
		return userService.getAll();
	}
	
	@PostMapping("/createUser")
	public String createUser(@RequestBody Users user) {
		return userService.createUser(user);
	}
	
	@GetMapping("/getUserByEmail")
	public Users getByEmailAndPassword(@RequestParam String email, @RequestParam String password) {
		return userService.getByEmailAndPassword(email,password);
	}
	
	@DeleteMapping("/removeUser")
	public String removeUser(@RequestParam String email) {
		return userService.removeUser(email);
	}
	
	@PutMapping("/replaceAllField")
	public Optional<Object> updateUser(@RequestParam String email, @RequestBody Users updatedUser) {
	    return userRepository.findById(email).map(existingUser -> {
	        existingUser.setFirstName(updatedUser.getFirstName());
	        existingUser.setLastName(updatedUser.getLastName());
	        existingUser.setPassword(updatedUser.getPassword());
	        existingUser.setDepartment(updatedUser.getDepartment());
	        existingUser.setRole(updatedUser.getRole());
	        userRepository.save(existingUser);
	        return "User updated successfully (PUT).";
	    });
	}
	
	@PatchMapping("/patchUser")
	public Optional<Object> patchUser(@RequestParam String email, @RequestBody Users partialUser) {
	    return userRepository.findById(email).map(existingUser -> {
	        if (partialUser.getFirstName() != null) {
	            existingUser.setFirstName(partialUser.getFirstName());
	        }
	        if (partialUser.getLastName() != null) {
	            existingUser.setLastName(partialUser.getLastName());
	        }
	        if (partialUser.getEmail() != null) {
	            existingUser.setEmail(partialUser.getEmail());
	        }
	        if (partialUser.getPassword() != null) {
	            existingUser.setPassword(partialUser.getPassword());
	        }
	        if (partialUser.getDepartment() != null) {
	            existingUser.setDepartment(partialUser.getDepartment());
	        }
	        if (partialUser.getRole() != null) {
	            existingUser.setRole(partialUser.getRole());
	        }
	        userRepository.save(existingUser);
	        return "User updated successfully (PATCH).";
	    });
	}


}

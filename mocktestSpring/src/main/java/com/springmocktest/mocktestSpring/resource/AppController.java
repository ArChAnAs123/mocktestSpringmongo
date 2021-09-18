package com.springmocktest.mocktestSpring.resource;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmocktest.mocktestSpring.domain.Users;
import com.springmocktest.mocktestSpring.repository.UsersRepository;
import com.springmocktest.mocktestSpring.service.UsersService;

@RestController
public class AppController {
	
	
	@Autowired
	private UsersService services;
	
	@Autowired
	private UsersRepository repo;
	
	@GetMapping(value="/users", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Users> getStudents(){
		return services.fetchAllUsers();
		
	}
	
	@PostMapping("/saveUsers")
	public ResponseEntity<Users> createTutorial(@RequestBody Users u) {
	  try {
	    Users listusers = repo.save(new Users(u.getIduser(), u.getFirstname(),u.getLast_name(), u.getEmail(),u.getGender(),u.getIp_address()));
	    return new ResponseEntity<Users>(listusers, HttpStatus.CREATED);
	  } catch (Exception e) {
	    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	  }
	}

}

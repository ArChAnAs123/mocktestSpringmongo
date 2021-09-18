package com.springmocktest.mocktestSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmocktest.mocktestSpring.domain.Users;
import com.springmocktest.mocktestSpring.repository.UsersRepository;


@Service
public class UsersService {
	
   @Autowired
   private UsersRepository repo;
  
   public List<Users> fetchAllUsers(){
		return repo.findAll();
	}
	
  
}

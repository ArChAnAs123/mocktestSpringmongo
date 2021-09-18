package com.springmocktest.mocktestSpring.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springmocktest.mocktestSpring.domain.Users;

public interface UsersRepository extends MongoRepository<Users, String> {
	
	List<Users> findByEmail(String email);
	
}

package com.devdaviuc.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdaviuc.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByEmail(String email);
	

}

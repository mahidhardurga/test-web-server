package com.practice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.model.user;

public interface userRepository extends JpaRepository<user, Long> {
	
	user findByUsername(String username);

}

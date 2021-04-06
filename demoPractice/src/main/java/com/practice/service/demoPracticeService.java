package com.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.practice.dao.demoPracticeDao;
import com.practice.dao.userRepository;
import com.practice.model.Student;
import com.practice.model.user;

@Service
public class demoPracticeService implements UserDetailsService{
	@Autowired
	private demoPracticeDao daoImpl;
	
	@Autowired
	private userRepository repo;
	
	public void save(Student s) {
		daoImpl.save(s);
	}

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		user user = repo.findByUsername(username);
		if(user==null)
			throw new UsernameNotFoundException("User NotFound");
		return new userDetailsImpl(user);
	}
}

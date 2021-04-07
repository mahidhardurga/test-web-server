package com.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.model.student;

public interface repository extends JpaRepository<student, Long>{

}

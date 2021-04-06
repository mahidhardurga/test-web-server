package com.practice.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practice.model.Student;

@Repository
public interface demoPracticeDao extends CrudRepository<Student, Integer>{

}

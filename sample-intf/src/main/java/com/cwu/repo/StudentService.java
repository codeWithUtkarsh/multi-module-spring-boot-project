package com.cwu.repo;

import java.util.List;

import com.cwu.model.Student;

public interface StudentService {

	public Student persist(Student student);
	public List<Student> getAll();
	
}

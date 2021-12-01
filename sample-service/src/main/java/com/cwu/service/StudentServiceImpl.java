package com.cwu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cwu.model.Student;
import com.cwu.repo.StudentService;

@Component
public class StudentServiceImpl implements StudentService{

	private List<Student> students = new ArrayList<>();
	
	public Student persist(Student student) {
		students.add(student);
		return student;
	}

	public List<Student> getAll() {
		return this.students;
	}

}

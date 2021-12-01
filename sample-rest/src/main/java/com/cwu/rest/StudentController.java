package com.cwu.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cwu.model.Student;
import com.cwu.repo.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/getAll")
	public List<Student> getStudent() {
		return service.getAll();
	}

	@PostMapping("/save")
	public Student save(Student student) {
		return service.persist(student);
	}
}

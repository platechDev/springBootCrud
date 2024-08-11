package com.example.springBootCrud.service;

import com.example.springBootCrud.repository.StudentRepository;
import com.example.springBootCrud.entity.Student;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getStudents(){
		return studentRepository.findAll();
	}
	
	
	public Optional<Student> getStudent(Long id){
		return studentRepository.findById(id);
	}
	
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	
	
}

package com.mvcproject.studentmanagementsystem.service;

import java.util.List;

import com.mvcproject.studentmanagementsystem.entity.Student;

public interface StudentService {
	
	public List<Student> getAllStudents();
	public Student saveStudent(Student student);
	public Student getStudentById(Long id);
	public Student updateStudent(Student student);
	public void deleteStudentById(Long id);
}

package com.mvcproject.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvcproject.studentmanagementsystem.entity.Student;

// no need to add @Repository since JpaRepository already has this
public interface StudentRepository extends JpaRepository<Student, Long>{

}

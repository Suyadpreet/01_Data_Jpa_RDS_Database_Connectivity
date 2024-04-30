package com.suyad.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suyad.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> 
{

}

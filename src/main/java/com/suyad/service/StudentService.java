package com.suyad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suyad.Entity.Student;
import com.suyad.repo.StudentRepo;

@Service
public class StudentService
{
	@Autowired
	private StudentRepo repo;
	
	public String saveData()
	{
		Student s1 = new Student();
		s1.setName("Suyadpreet Singh");
		Student s2 = new Student();
		s2.setName("Kamalpreet Singh");
		Student s3 = new Student();
		s3.setName("Varunpreet Singh");
		List<Student> list = List.of(s1,s2,s3);
		repo.saveAll(list);
		
		return "Data has been saved Successfully.....";
	}
}

package com.suyad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suyad.service.StudentService;

@RestController
public class StudentController
{
	@Autowired
	private StudentService service;
	
	
	@GetMapping("/hi")
	public ResponseEntity<String> getHi()
	{
		return new ResponseEntity<>("Hi welcome to Home page......",HttpStatus.CREATED);
	}
	
	@GetMapping("/save")
	public ResponseEntity<String> saveAlldata()
	{
		String data = service.saveData();
		return new ResponseEntity<>(data,HttpStatus.CREATED);
	}
}

package com.boot_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot_demo.services.PersonService;

@RestController
public class PersonController {
	
	@Autowired PersonService personService;
	
	@GetMapping("/persons")
	public ResponseEntity<?> getAllStudents(){
		System.out.println("getAllstudent");
		return ResponseEntity.ok(this.personService.getAllPerson());
	}

	@GetMapping("/Test")
	public String Test(){
		System.out.println("getAllstudent");
		return "Test";
	}

}

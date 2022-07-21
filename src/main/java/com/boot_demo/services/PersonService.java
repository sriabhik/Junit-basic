package com.boot_demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot_demo.entites.Person;
import com.boot_demo.repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired 
	private PersonRepo personRepo;



	public List<Person> getAllPerson(){
		return this.personRepo.findAll();
	}

//	this for testing
	public PersonService(PersonRepo personRepo) {
		this.personRepo = personRepo;
	}
}

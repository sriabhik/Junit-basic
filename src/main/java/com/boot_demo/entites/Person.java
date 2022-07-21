package com.boot_demo.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Entity
public class Person {
	
	@Id
	private  int personId;
	private String personName;
	private String personCity;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonCity() {
		return personCity;
	}

	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}

	public Person(int personId, String personName, String personCity) {
		this.personId = personId;
		this.personName = personName;
		this.personCity = personCity;
	}

	public Person() {
	}
}

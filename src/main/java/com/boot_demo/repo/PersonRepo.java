package com.boot_demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.boot_demo.entites.Person;

public interface PersonRepo extends JpaRepository<Person,Long>{

	    @Query("SELECT CASE WHEN COUNT(s)>0 THEN TRUE ELSE FALSE END FROM Person s WHERE s.personId = ?1")
		Boolean isPersonExitsById(Integer id);
}

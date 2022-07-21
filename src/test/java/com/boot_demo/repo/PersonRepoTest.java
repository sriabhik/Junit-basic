package com.boot_demo.repo;

import com.boot_demo.entites.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonRepoTest {

    @Autowired
    private PersonRepo personRepo;

    @Test
    void isPersonExitsById() {
        Person p = new Person(123,"Abhishek Srivastava","Delhi");
        personRepo.save(p);

        Boolean  actualResult = personRepo.isPersonExitsById(123);

        assertThat(actualResult).isTrue();
    }
}
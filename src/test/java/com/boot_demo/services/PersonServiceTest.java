package com.boot_demo.services;

import com.boot_demo.entites.Person;
import com.boot_demo.repo.PersonRepo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PersonServiceTest {

//    if need m=fake data,don't autowired,use mock

    @Mock
    private PersonRepo personRepo;


    private  PersonService personService;

//    AutoCloseable autoCloseable;
//passing mock reference in service
    @BeforeEach
    void setUp(){
//        AutoCloseable autoCloseable = MockitoAnnotations.openMocks(this);
        this.personService = new PersonService(this.personRepo);
    }
//    @AfterEach
//    void tearDown() throws Exception {
//        this.autoCloseable.close();
//    }
    //here we will use mockito
    @Test
    void getAllPerson() {

        personService.getAllPerson();
        verify(personRepo).findAll();
    }
}
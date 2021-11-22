package com.poc.gitactions.controller;

import com.poc.gitactions.model.Person;
import com.poc.gitactions.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(path = "person/{id}")
    public Person getById(@PathVariable Long id) {
        return personService.getById(id);
    }

    @GetMapping(path = "person")
    public Collection<Person> getAll() {
        return personService.getAll();
    }

    @PostMapping(path = "/person")
    public Person addPerson(@RequestBody Person person) {
        return personService.save(person);
    }
}

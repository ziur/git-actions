package com.poc.gitactions.service;

import com.poc.gitactions.model.Person;

import java.util.Collection;

public interface PersonService {
    Person getById(Long id);

    Person save(Person person);

    Collection<Person> getAll();
}

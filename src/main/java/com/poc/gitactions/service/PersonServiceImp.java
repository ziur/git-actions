package com.poc.gitactions.service;

import com.poc.gitactions.model.Person;

import java.util.Collection;
import java.util.Map;

public class PersonServiceImp implements PersonService {
    public static Map<Long, Person> people = Map.of(
            1L, new Person("John", "Doe", "jd@mail.com"),
            2L, new Person("Bob", "Dawson", "bm@mail.com"),
            3L, new Person("Mary", "Bob", "jd@mail.com")
            );

    @Override
    public Person getById(Long id) {
        return people.get(id);
    }

    @Override
    public Person save(Person person) {
        people.put(person.getId(), person);
        return person;
    }

    @Override
    public Collection<Person> getAll() {
        return people.values();
    }
}

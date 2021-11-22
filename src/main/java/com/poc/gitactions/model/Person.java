package com.poc.gitactions.model;

import java.util.concurrent.atomic.AtomicLong;

public class Person {
    private static final AtomicLong ID = new AtomicLong(0);

    private final long id;
    private final String firstName;
    private final String lastName;
    private final String email;

    public Person(String firstName, String lastName, String email) {
        this.id = ID.addAndGet(1L);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}

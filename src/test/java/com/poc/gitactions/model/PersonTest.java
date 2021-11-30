package com.poc.gitactions.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {

    Person person1;

    @BeforeEach
    void setUp() {
        person1 = new Person("Bruno", "Dias", "bd@bat.man");
    }

    @Test
    void getFirstName() {
        Assertions.assertEquals("Bruno", person1.getFirstName());
    }

    @Test
    void getEmail() {
        Assertions.assertEquals("bd@bat.man", person1.getEmail());
    }

    @Test
    void getFullName() {
        Assertions.assertEquals("Bruno Dias", person1.getFullName());
    }
}

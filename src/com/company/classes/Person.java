package com.company.classes;

import com.company.enums.Country;
import com.company.enums.Gender;

import java.time.LocalDate;

public class Person extends Passport{

    public Person(int id, String lastName, String firstName, LocalDate birthDay, Country country, Gender gender) {
        super(id, lastName, firstName, birthDay, country, gender);
    }
}
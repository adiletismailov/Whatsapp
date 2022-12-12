package com.company.classes;

import com.company.enums.Country;
import com.company.enums.Gender;

import java.time.LocalDate;

public class Passport {
    private int id;
    private String lastName;
    private String firstName;
    private LocalDate birthDay;
    private Country country;
    private Gender gender;

    public Passport(int id, String lastName, String firstName, LocalDate birthDay, Country country, Gender gender) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDay = birthDay;
        this.country = country;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nPassport{" +
                "\nid=" + id +
                ", \nlastName='" + lastName + '\'' +
                ", \nfirstName='" + firstName + '\'' +
                ", \nbirthDay=" + birthDay +
                ", \ncountry=" + country +
                ", \ngender=" + gender +
                '}'+"\n";
    }
}
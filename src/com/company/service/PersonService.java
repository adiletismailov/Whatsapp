package com.company.service;

import com.company.classes.Passport;
import com.company.enums.Country;

import java.util.List;

public interface PersonService {
    List<Passport> getAllPassport() throws Exception;
    List<Passport> getPassportByFirstName();
    String createPassport();
    List<Country> getAllCountries();
}


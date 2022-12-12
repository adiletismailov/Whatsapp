package com.company.service.impl;

import com.company.classes.Passport;
import com.company.enums.Country;
import com.company.enums.Gender;
import com.company.service.PersonService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PersonImpl implements PersonService {
    private List<Passport> passportList = new ArrayList<>();

    public List<Passport> getPassportList() {
        return passportList;
    }

    public void setPassportList(List<Passport> passportList) {
        this.passportList = passportList;
    }


    @Override
    public String createPassport() {
        boolean a = false;
        try {
            System.out.print("Id: ");
            int getId = new Scanner(System.in).nextInt();
            System.out.print("Lastname: ");
            String getLastName = new Scanner(System.in).nextLine();
            System.out.print("Firstname: ");
            String getFirstName = new Scanner(System.in).nextLine();
            System.out.print("BirthDay: ");
            String[] dateOfBirthList = new Scanner(System.in).nextLine().trim().split("-");
            System.out.print("Country: ");
            Country getCountry = Country.valueOf(new Scanner(System.in).nextLine());
            System.out.print("Gender: ");
            Gender getGender = Gender.valueOf(new Scanner(System.in).nextLine());
            LocalDate dateOfBirth =LocalDate.of(
                    Integer.parseInt(dateOfBirthList[0]),
                    Integer.parseInt(dateOfBirthList[1]),
                    Integer.parseInt(dateOfBirthList[2]));

            Passport passport = new Passport(getId, getLastName, getFirstName, dateOfBirth, getCountry, getGender);
            a = passportList.add(passport);
        }catch (Exception e){
            e.printStackTrace();
        }
        return a ? "Passport created successfully.\n" : "Error: ! \n";
    }

    @Override
    public List<Passport> getAllPassport() {
        return passportList;
    }

    @Override
    public List<Passport> getPassportByFirstName() {
        List<Passport> passport = new ArrayList<>();
        System.out.print("FirstName: ");
        String getFirstName = new Scanner(System.in).nextLine();
        for (Passport p:passportList) {
            if (p.getFirstName().equals(getFirstName)){
                passport.add(p);
            }
        }return passport;
    }

    @Override
    public List<Country> getAllCountries() {
        return List.of(Country.values());
    }
}

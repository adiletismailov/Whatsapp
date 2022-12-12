package com.company;

import com.company.enums.Status;
import com.company.service.impl.PersonImpl;
import com.company.service.impl.WhatsappImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        PersonImpl person = new PersonImpl();
        WhatsappImpl whatsapp = new WhatsappImpl();
        List<Status> statusList = new ArrayList<>();
        while (true){
            System.out.print("""
                    --------- COMMANDS --------->
                    1. Get all passports
                    2. Get passport by first name
                    3. Get all WhatsApp Users
                    4. Go to your profile
                    5. Get all countries
                    6. Get WhatsApp Status
                    7. Create passport
                    8. Install WhatsApp
                    9. Change Status
                    10. Add contact
                    11. Send Message
                    12. See Status
                    
                    Write a command:\02""");
            int number = new Scanner(System.in).nextInt();
            switch (number){
                case 1 -> System.out.println(person.getAllPassport());
                case 2 -> System.out.println(person.getPassportByFirstName());
                case 3 -> System.out.println(whatsapp.getAllWhatsappUsers());
                case 4 -> System.out.println(whatsapp.getProfile());
                case 5 -> System.out.println(person.getAllCountries());
                case 6 -> System.out.println(whatsapp.getAllWhatsappStatus());
                case 7 -> System.out.println(person.createPassport());
                case 8 -> System.out.println(whatsapp.installWhatsapp());
                case 9 -> System.out.println(whatsapp.changeStatus());
                case 10 -> System.out.println(whatsapp.addContact());
                case 11 -> System.out.println(whatsapp.getMessage());
                case 12 -> System.out.println(whatsapp.getWhatsappStatus());
            }
        }
    }
}
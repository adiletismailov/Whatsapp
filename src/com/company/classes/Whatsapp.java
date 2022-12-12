package com.company.classes;

import com.company.enums.Status;

import java.util.List;

public class Whatsapp extends Profile{

    public Whatsapp(long id, String userName, String password, List<Profile> contacts, List<String> messages, Status status, String image, String phoneNumber) {
        super(id,userName,password,contacts,messages,status,image,phoneNumber);

    }
}

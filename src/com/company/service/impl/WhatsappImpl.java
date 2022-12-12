package com.company.service.impl;


import com.company.classes.Profile;
import com.company.classes.Whatsapp;
import com.company.enums.Status;
import com.company.service.WhatsappService;

import java.util.*;

public class WhatsappImpl implements WhatsappService {
    private List<Whatsapp> whatsappList = new ArrayList<>();

    public List<Whatsapp> getWhatsappList() {
        return whatsappList;
    }

    public void setWhatsappList(List<Whatsapp> whatsappList) {
        this.whatsappList = whatsappList;
    }

    @Override
    public String installWhatsapp() {
        boolean a = false;
        try {
            System.out.print("Id: ");
            int getId = new Scanner(System.in).nextInt();
            System.out.print("UserName: ");
            String getUserName = new Scanner(System.in).nextLine();
            System.out.print("PhoneNumber: ");
            String getPhoneNumber = new Scanner(System.in).nextLine();
            System.out.print("Password: ");
            String getPassword = new Scanner(System.in).nextLine();
            Status[] statuses = Status.values();
            System.out.println(Arrays.toString(statuses));
            System.out.print("Status: ");
            Status status = Status.valueOf(new Scanner(System.in).nextLine());

            String images = "Java-8";
            List<String> messages = new ArrayList<>();
            List<Profile> contacts = new ArrayList<>();
            Whatsapp whatsapp = new Whatsapp(getId, getUserName, getPassword, contacts, messages, status, images, getPhoneNumber);
            a = whatsappList.add(whatsapp);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a ? "Passport created successfully.\n" : "Error: ! \n";
    }

    @Override
    public List<Whatsapp> getAllWhatsappUsers() {
        return whatsappList;
    }

    @Override
    public List<Status> getAllWhatsappStatus() {
        return List.of(Status.values());
    }

    @Override
    public String changeStatus() throws Exception {
        System.out.print("Write userName: ");
        String getUserName = new Scanner(System.in).nextLine();
        System.out.print("Password: ");
        String getPassword = new Scanner(System.in).nextLine();
        for (Whatsapp w:whatsappList) {
            if (w.getUserName().equals(getUserName) && w.getPassword().equals(getPassword)) {
                System.out.println("Status List : " + Arrays.toString(Status.values()));
                System.out.print("Enter your option (index) : ");
                int index = new Scanner(System.in).nextInt();

                if(index < 0 || index > Status.values().length - 1)
                    throw new Exception("Status Index Error. Please enter a valid index");
                w.setStatus(Status.values()[index]);
                return "Status changed successfully!";
            }
        }
        return "Status Change Error.";
    }

    @Override
    public Profile getProfile() {
        System.out.print("Write userName: ");
        String getUserName = new Scanner(System.in).nextLine();
        System.out.print("Write password: ");
        String getPassword = new Scanner(System.in).nextLine();
        for (Whatsapp w : whatsappList) {
            if (w.getUserName().equals(getUserName) && w.getPassword().equals(getPassword)) {
                return w;
            }
        }
        return null;
    }

    @Override
    public Object getWhatsappStatus() {
        List<Status> statuses = new ArrayList<>();
        for (Whatsapp w : whatsappList) {
            return w.getStatus();
        }
        return statuses;
    }

    @Override
    public String addContact() {
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
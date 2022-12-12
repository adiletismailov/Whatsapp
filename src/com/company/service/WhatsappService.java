package com.company.service;

import com.company.classes.Profile;
import com.company.classes.Whatsapp;
import com.company.enums.Status;

import java.util.List;

public interface WhatsappService {
    String installWhatsapp();
    List<Whatsapp> getAllWhatsappUsers();
    List<Status> getAllWhatsappStatus();
    String changeStatus() throws Exception;
    Profile getProfile();
    Object getWhatsappStatus();
    String addContact();
    String getMessage();

}

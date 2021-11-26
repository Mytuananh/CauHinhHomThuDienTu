package com.code.service;

import com.code.model.Email;

import java.util.ArrayList;
import java.util.List;

public class EmailService implements IEmailService {
     private static Email email;
    static {
        email =  new Email(1, "English", 25, true, "Tuan");

    }

    @Override
    public Email showAll() {
        return email;
    }

    @Override
    public void update(Email emails) {
        email = emails;
    }

    @Override
    public Email findById(int id) {
        return null;
    }
}
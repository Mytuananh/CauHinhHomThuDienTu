package com.code.service;

import com.code.model.Email;

import java.util.List;

public interface IEmailService {
    Email showAll();

    void update( Email email);

    Email findById(int id);
}

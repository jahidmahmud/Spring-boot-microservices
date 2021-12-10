package com.contact.main.service;

import com.contact.main.model.Contact;

import java.util.List;

public interface ContactService {
    public List<Contact> getContactOfUser(Long userId);
}

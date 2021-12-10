package com.user.main.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long userId;
    private String name;
    private String phone;
    private List<Contact> contact=new ArrayList<>();

    public User(Long userId, String name, String phone, List<Contact> contact) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.contact = contact;
    }

    public User(Long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    public User() {
    }

    public Long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public List<Contact> getContact() {
        return contact;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }
}

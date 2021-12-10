package com.user.main.model;

public class Contact {
    private Long cId;
    private String email;
    private String name;
    private Long userId;

    public Contact(Long cId, String email, String name, Long userId) {
        this.cId = cId;
        this.email = email;
        this.name = name;
        this.userId = userId;
    }

    public Contact() {
    }

    public Long getcId() {
        return cId;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}

package com.user.main.controller;

import com.user.main.model.User;
import com.user.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private UserService service;
    @GetMapping("/{userId}")
    public User getUserById(@PathVariable("userId") Long userId){
        User user = service.getUser(userId);
        //http://localhost:9002/contact/12211

        List contacts = this.restTemplate.getForObject("http://contact-service/contact/" + userId, List.class);
        user.setContact(contacts);
        return user;
    }
}

package com.contact.main.service;

import com.contact.main.model.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> contactList=List.of(
            new Contact(1L,"mahmud@gmail.com","Jahid",12211L),
            new Contact(2L,"khan@gmail.com","Khan",12211L),
            new Contact(3L,"isra@gmail.com","Israfil",12212L)
    );
    @Override
    public List<Contact> getContactOfUser(Long userId) {
        return contactList.stream().filter((user)->user.getUserId().equals(userId)).collect(Collectors.toList());
    }
}

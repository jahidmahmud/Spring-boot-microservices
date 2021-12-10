package com.user.main.service;

import com.user.main.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    List<User> userList= List.of(
            new User(12211L,"Jahid","01629820492"),
            new User(12212L,"Mahmud","01609091973")
    );
    @Override
    public User getUser(Long id) {
        return userList.stream().filter((user)->user.getUserId().equals(id)).findFirst().get();
    }
}

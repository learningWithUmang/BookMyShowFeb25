package dev.umang.bookmyshowfeb25.services;

import dev.umang.bookmyshowfeb25.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User signup(String name,
                       String email,
                       String password){
        User user = new User();
        return user;
    }
}

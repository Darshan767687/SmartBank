package com.smartbank.service;

import com.smartbank.model.User;
import com.smartbank.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{

    @Autowired
    UserRepository userRepository;

    public String login(String username, String password)
    {
        User user=userRepository.findByUsername(username);
        if(user != null && user.getPassword().equals(password))
        {
            return "Login successful! Welcome "+user.getUsername();
        }
        else
        {
            return "Invalid Credentials";
        }
    }

    public String Signin(String username, String password , String email)
    {
        User user1=userRepository.findByUsername(username);
        if(user1==null)
        {

        User user= new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        userRepository.save(user);
        return "Account Created";
        }
        else {
            return "Use Different Username";
        }
    }


}

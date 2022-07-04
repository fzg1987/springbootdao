package com.fzg.controller;

import com.fzg.entity.User;
import com.fzg.repository.UserRepository;
import com.fzg.repository.impl.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserHandler {
    @Autowired
    private UserRepositoryImpl userRepository;

    @GetMapping("/findAll")
    public List<User> findAll(){
        List<User> users = userRepository.findAll();
        return users;
    }
}

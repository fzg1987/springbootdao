package com.fzg.controller;

import com.fzg.entity.User;
import com.fzg.repository.impl.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("user")
@RequestMapping("/user")
public class UserHandler {
    @Autowired
    private UserRepositoryImpl userRepository;

    @GetMapping("/findAll")
    public List<User> findAll(){
        List<User> users = userRepository.findAll();
        return users;
    }
    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Integer id){
        return userRepository.findById(id);
    }

    @PostMapping("/save")
    public int save(@RequestBody User user){
        return userRepository.save(user);
    }

    @PutMapping("/update")
    public int update(@RequestBody User user){
        return userRepository.update(user);
    }
    @DeleteMapping("/deleteById/{id}")
    public int deleteById(@PathVariable("id") Integer id){
        return userRepository.deleteById(id);
    }
}

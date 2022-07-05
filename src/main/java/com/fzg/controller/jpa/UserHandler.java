package com.fzg.controller.jpa;

import com.fzg.jpa.entity.User;
import com.fzg.jpa.repository.JpaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("jpaHandler")
@RequestMapping("/jpauser")
public class UserHandler {

    @Autowired
    private JpaUserRepository jpaUserRepository;

    @GetMapping("/findAll")
    public List<User> findAll(){
        return jpaUserRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Integer id){
        return jpaUserRepository.findById(id).get();
    }

    @PostMapping("/save")
    public void save(@RequestBody User user){
        jpaUserRepository.save(user);
    }

    @PutMapping("/update")
    public void update(@RequestBody User user){
        jpaUserRepository.save(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        jpaUserRepository.deleteById(id);
    }

    @GetMapping("/findByUsername/{username}")
    public User findByName(@PathVariable("username") String username){
        return jpaUserRepository.findByUsername(username);
    }
}

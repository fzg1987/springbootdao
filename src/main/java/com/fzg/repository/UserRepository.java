package com.fzg.repository;

import com.fzg.entity.User;

import java.util.List;

public interface UserRepository {
    public List<User> findAll();
    public User findById(Integer id);
    public int save(User user);
    public int update(User user);
    public int deleteById(Integer id);
}

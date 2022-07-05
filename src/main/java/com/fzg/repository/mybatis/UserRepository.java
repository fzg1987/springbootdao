package com.fzg.repository.mybatis;

import com.fzg.entity.User;

import java.util.List;

public interface UserRepository {
    public List<User> findAll();
    public User findById(Integer id);
    public void save(User user);
    public void update(User user);
    public int deleteById(Integer id);
}

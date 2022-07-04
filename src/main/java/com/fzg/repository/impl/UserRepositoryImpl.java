package com.fzg.repository.impl;

import com.fzg.entity.User;
import com.fzg.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query(
                "select * from t_user",
                new BeanPropertyRowMapper<>(User.class)
        );
    }

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public int save(User user) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public int deleteById(Integer id) {
        return 0;
    }
}

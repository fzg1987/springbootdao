package com.fzg.jpa.repository;

import com.fzg.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<User,Integer> {
    public User findByUsername(String username);
}

package com.fzg.jpa.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name="t_user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private Integer age;
}

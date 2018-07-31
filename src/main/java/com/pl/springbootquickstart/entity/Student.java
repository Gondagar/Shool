package com.pl.springbootquickstart.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@Entity
@Table(name = "student")
@XmlRootElement(name = "student")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "email")
    private String email;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;



    public Student(String name, String last_name, String email, String login, String password) {
        this.name = name;
        this.lastname = last_name;
        this.email = email;
        this.login = login;
        this.password = password;
    }


}
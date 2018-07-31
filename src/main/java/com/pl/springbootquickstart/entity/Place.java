package com.pl.springbootquickstart.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Place {

    @Id
    @GeneratedValue
    @Column(name = "id_lesson")
    long id;
    @Column(name = "university")
    String university;
}

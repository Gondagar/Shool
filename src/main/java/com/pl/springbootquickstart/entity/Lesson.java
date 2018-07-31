package com.pl.springbootquickstart.entity;

import javax.persistence.*;


@lombok.Data
@Entity
@Table(name = "lesson")
public class Lesson {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    String id;

    @Column(name = "theme")
    String theme;

    @Column(name = "feedback")
    String feedback;

    @Column(name = "date")
    String date;

    @Column(name = "time")
    String time;

    @Column(name = "place")
    String place;

}

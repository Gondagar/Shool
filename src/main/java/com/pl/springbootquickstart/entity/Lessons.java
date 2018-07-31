package com.pl.springbootquickstart.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement(name = "Lessons")
public class Lessons {

    List<Lesson> lessons;

    public Lessons() {
    }

    public Lessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setStudents(List<Lesson> lessons) {
        this.lessons = lessons;
    }
}

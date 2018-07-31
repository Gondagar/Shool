package com.pl.springbootquickstart.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement(name = "students")
public class Students {

    List<Student> students;

    public Students() {
    }

    public Students(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}

package com.pl.springbootquickstart.repository;

import com.pl.springbootquickstart.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;


public interface StudentRepository extends CrudRepository<Student, String> {




    public Student findById(String id);




}

package com.pl.springbootquickstart.service;

import com.pl.springbootquickstart.repository.StudentRepository;
import com.pl.springbootquickstart.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {


    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    @Transactional
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Transactional
    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }

    @Transactional
    public Student getStudent(String id) {
        return studentRepository.findOne(id);
    }

    @Transactional
    public void updateStudent(Student sId, Student student) {
        studentRepository.save(student);
    }



    @Transactional
    public void getStudentById(Student sId, Student student) {
        studentRepository.findById(sId.getId());
    }



}

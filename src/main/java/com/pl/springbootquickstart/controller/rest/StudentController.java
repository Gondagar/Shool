package com.pl.springbootquickstart.controller.rest;

import com.pl.springbootquickstart.entity.Student;
import com.pl.springbootquickstart.entity.Students;
import com.pl.springbootquickstart.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController

public class StudentController {


    @Autowired
    StudentService studentService;

    @GetMapping
    @RequestMapping(value = "/students", headers = {"accept=application/json, application/xml"})
    public @ResponseBody
    Students getAllStudents() {
        return new Students(studentService.getAllStudents());
    }

    @GetMapping("/student/{id}")
    public @ResponseBody
    Student getStudent(@PathVariable String id) {
        return studentService.getStudent(id);
    }


    @RequestMapping(value = "/student", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }


  /*  @RequestMapping(value = "/student", method = RequestMethod.DELETE, headers = {"accept=application/json, application/xml"})
    public void removeStudent(@RequestBody Student student) {
        studentService.deleteStudent(student);
    }*/

}

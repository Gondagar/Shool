package com.pl.springbootquickstart.controller.rest;

import com.pl.springbootquickstart.entity.Lesson;
import com.pl.springbootquickstart.entity.Lessons;
import com.pl.springbootquickstart.entity.Student;
import com.pl.springbootquickstart.entity.Students;
import com.pl.springbootquickstart.service.LessonService;
import com.pl.springbootquickstart.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController

public class LessonController {


    @Autowired
    LessonService lessonService;


    @PostMapping
    @RequestMapping(value = "/lessons", headers = {"accept=application/json"})
    public ResponseEntity getAllLessons() {
        List<Lesson> allLessons = lessonService.getAllLessons();
        for (Lesson lesson : allLessons) {
            System.out.println(lesson);

        }

        return new ResponseEntity(new Lessons(allLessons), HttpStatus.OK);
    }


    @RequestMapping("/lesson/{id}")
    public Lesson getLesson(@PathVariable String id) {
        return lessonService.getLesson(id);
    }


    @RequestMapping(value = "/lesson/add", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public void addLesson(@RequestBody Lesson lesson) {
        lessonService.addLesson(lesson);
    }


    @RequestMapping(value = "/lesson/remove", method = RequestMethod.POST, headers = {"accept=application/json, application/xml"})
    public void removeLesson(@RequestBody Lesson lesson) {
        lessonService.deleteLesson(lesson);
    }


}

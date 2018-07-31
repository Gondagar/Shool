package com.pl.springbootquickstart.service;

import com.pl.springbootquickstart.entity.Lesson;
import com.pl.springbootquickstart.repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class LessonService {




    @Autowired
    private LessonRepository lessonRepository;

    @Transactional
    public List<Lesson> getAllLessons() {
        List<Lesson> lessons = new ArrayList<>();
        lessonRepository.findAll().forEach(lessons::add);
        return lessons;
    }

    @Transactional
    public void addLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    @Transactional
    public void deleteLesson(Lesson lesson) {
        lessonRepository.delete(lesson);
    }

    @Transactional
    public Lesson getLesson(String id) {
        return lessonRepository.findOne(id);
    }

    @Transactional
    public void updateLesson(Lesson sId, Lesson lesson) {
        lessonRepository.save(lesson);
    }


}
    


package com.pl.springbootquickstart.repository;

import com.pl.springbootquickstart.entity.Lesson;
import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<Lesson, String> {
}

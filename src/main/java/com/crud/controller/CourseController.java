package com.crud.controller;

import com.crud.model.Course;
import com.crud.repository.CourseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {


    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping
    List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    @PostMapping
    //Alternative for responseEntity @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<Course> create(@RequestBody Course course){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.courseRepository.save(course));
    }
}

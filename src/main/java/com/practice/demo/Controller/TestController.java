package com.practice.demo.Controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practice.demo.entities.Course;
import com.practice.demo.services.CourseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class TestController {

    // @GetMapping("/data")
    // public String getData() {
    // return "home";
    // }
    @Autowired
    private CourseService Courseserv;

    @GetMapping("/info")
    public String info() {
        return "this is testing controller";
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.Courseserv.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return this.Courseserv.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course c) {
        return this.Courseserv.addCourse(c);
    }

    @PutMapping("/courses")
    public Course updatCourse(@RequestBody Course c) {
        return this.Courseserv.updatCourse(c);

    }

    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
        try {
            this.Courseserv.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        
        }
    }
}

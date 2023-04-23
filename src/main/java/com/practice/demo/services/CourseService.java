package com.practice.demo.services;

import java.util.List;

import com.practice.demo.entities.Course;

public interface CourseService {
    public List<Course> getCourses();

    public Course getCourse(long courseId);

    public Course addCourse(Course course);

    public Course updatCourse(Course course);

    public void deleteCourse(long parseLong);
}

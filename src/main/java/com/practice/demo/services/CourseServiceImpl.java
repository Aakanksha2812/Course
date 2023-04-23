package com.practice.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.cj.x.protobuf.MysqlxCrud.Delete;
import com.practice.demo.dao.courseDao;
import com.practice.demo.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private courseDao cdao;

    @Override
    public List<Course> getCourses() {
        return cdao.findAll();
    }

    public Course getCourse(long courseId) {
        // Course c = null;
        // for (Course course : list) {
        // if (course.getId() == courseId) {
        // c = course;
        // break;
        // }

        // }
        return cdao.findById(courseId).get();
    }

    public Course addCourse(Course course) {
        // list.add(course);
        cdao.save(course);
        return course;
    }

    public Course updatCourse(Course course) {
        // list.Delete(course);
        // list.forEach(e -> {
        // if (e.getId() == course.getId()) {
        // e.setTitle(course.getTitle());
        // e.setDesc(course.getDesc());
        // }
        // });
        cdao.save(course);
        return course;
    }

    public void deleteCourse(long parseLong) {
        Course entity = cdao.getReferenceById(parseLong);
        cdao.delete(entity);
        // list = this.list.stream().filter(e -> e.getId() !=
        // parseLong).collect(Collectors.toList());
    }
}

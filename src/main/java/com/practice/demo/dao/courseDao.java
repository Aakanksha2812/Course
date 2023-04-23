package com.practice.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.demo.entities.Course;

public interface courseDao extends JpaRepository<Course, Long> {

}

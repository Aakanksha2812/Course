package com.practice.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private long id;
    private String title;
    private String descripation;

    public Course(long id, String title, String descripation) {
        super();
        this.id = id;
        this.title = title;
        this.descripation = descripation;
    }

    public Course() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return descripation;

    }

    public void setDesc(String descripation) {
        this.descripation = descripation;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ",title=" + title + "descripation=" + descripation + "]";
    }
}

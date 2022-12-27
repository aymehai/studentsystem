package com.aymen.studentsystem.service;

import com.aymen.studentsystem.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent (Student student);
    public List<Student> getAllStudents();
}

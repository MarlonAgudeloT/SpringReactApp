package com.marlonagudelo.newproject.service;

import com.marlonagudelo.newproject.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent (Student student);

    List<Student> getAllStudents();
}

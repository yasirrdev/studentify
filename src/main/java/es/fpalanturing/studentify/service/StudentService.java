package es.fpalanturing.studentify.service;

import java.util.List;

import es.fpalanturing.studentify.model.Student;

public interface StudentService {

    public Iterable<Student> readAllStudents();
    public Student createStudent(Student student);
    
}

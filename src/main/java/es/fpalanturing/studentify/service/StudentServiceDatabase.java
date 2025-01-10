package es.fpalanturing.studentify.service;

import java.util.List;

import org.springframework.stereotype.Service;

import es.fpalanturing.studentify.model.Student;
import es.fpalanturing.studentify.repository.StudentRepository;

@Service
public class StudentServiceDatabase implements StudentService {

    private StudentRepository repository;
    public StudentServiceDatabase(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Student> readAllStudents() {
        // TODO Auto-generated method stub
        
        return (List<Student>) this.repository.findAll();
    }

    @Override
    public Student createStudent(Student student) {
        Student createdStudent = repository.save(student);
        return createdStudent;
        
    }
    
}

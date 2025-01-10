package es.fpalanturing.studentify.controller;

import org.springframework.web.bind.annotation.RestController;

import es.fpalanturing.studentify.model.Student;
import es.fpalanturing.studentify.model.StudentDao;
import es.fpalanturing.studentify.service.StudentService;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
class StudentController {

    private StudentService service;
    StudentController(StudentService service) {
        this.service = service;

    }
    @GetMapping("/api/students")
    Iterable<Student> readAllStudents() {
        return service.readAllStudents();

    }
    @PostMapping("/api/students")
    Student postMethodName(@RequestBody StudentDao studentDao) {
        
        Student newStudent = new Student(studentDao.getName(),studentDao.getEmail());
        Student createdStudent = service.createStudent(newStudent);
        return  createdStudent;
    }
    
    
    
}

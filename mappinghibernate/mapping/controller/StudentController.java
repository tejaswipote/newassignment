package com.example.mapping.controller;

import com.example.mapping.model.Book;
import com.example.mapping.model.Student;
import com.example.mapping.service.BookService;
import com.example.mapping.service.StudentService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/listStudent")
    public ResponseEntity<?> displayStudents() {
        return ResponseEntity.ok(studentService.displayStudent());
    }


    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student updated = studentService.addStudent(student);
        return new ResponseEntity(updated, new HttpHeaders(), HttpStatus.OK);
    }

    @DeleteMapping("/deleteStudent/{rollno}")
    public HttpStatus deleteStudent(@PathVariable("rollno") Long rollno) {
        studentService.deleteStudent(rollno);
        return HttpStatus.FORBIDDEN;
    }
}

package com.example.mapping.service;

import com.example.mapping.model.Student;
import com.example.mapping.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }



    public Student addStudent(Student student) {
        student = studentRepository.save(student);
        return student;
    }


    public List<Student> displayStudent() {
        return studentRepository.findAll();
    }


    public void deleteStudent(Long rollno) {
        studentRepository.deleteById(rollno);
    }

}

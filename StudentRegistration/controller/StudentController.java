package com.example.StudentRegistration.controller;

import com.example.StudentRegistration.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


@RestController
public class StudentController {

    Map<String, Student> map = new HashMap<String, Student>();


    @GetMapping("/getStudent/{name}")
    public ResponseEntity<? extends Object> getStudent(@PathVariable String name) {
        if (Objects.nonNull(map.get(name)))
            return ResponseEntity.status(HttpStatus.OK).body(map.get(name));
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Record not found");
        // return new Student(1,"Mayu");
    }


    @PostMapping("/postStudent")
    public Student setStudent(@RequestBody Student student) {
        map.put(student.getName(), student);

        return student;
    }


    @PutMapping("/putStudent/{name}")
    public ResponseEntity<Student> updateStudent(@PathVariable String name, @Valid @RequestBody Student student) {
        Student student1 = map.get(name);
        student1.setId(student.getId());
        student1.setName(student.getName());
        student1.setAge(student.getAge());
        student1.setEmail(student.getEmail());
        final Student updatedStudent = map.put(student1.getName(), student1);
        return ResponseEntity.ok(updatedStudent);

    }


    @DeleteMapping("/deleteStudent/{name}")
    public Map<String, Boolean> deleteEmployee(@PathVariable String name) {
        Student student = map.get(name);


        map.remove(name);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }


    @PatchMapping("/patchStudent/{name}")
    public ResponseEntity<?> saveResource(@RequestBody Student student,
                                          @PathVariable String name) {
        map.put(name, student);
        return ResponseEntity.ok("resource saved");
    }

}

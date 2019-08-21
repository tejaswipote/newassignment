package com.example.mapping.controller;

import com.example.mapping.model.Book;
import com.example.mapping.model.Student;
import com.example.mapping.model.User;
import com.example.mapping.service.StudentService;
import com.example.mapping.service.UserService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/listUser")
    public ResponseEntity<?> displayUsers() {
        return ResponseEntity.ok(userService.displayUsers());
    }


    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User updated = userService.addUser(user);
        return new ResponseEntity(updated, new HttpHeaders(), HttpStatus.OK);
    }

    @DeleteMapping("/deleteUser/{userId}")
    public HttpStatus deleteUser(@PathVariable("userId") Long userId) {
        userService.deleteUser(userId);
        return HttpStatus.FORBIDDEN;
    }

}

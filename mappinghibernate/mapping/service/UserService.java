package com.example.mapping.service;

import com.example.mapping.model.Book;
import com.example.mapping.model.User;
import com.example.mapping.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    public User addUser(User user) {
        user = userRepository.save(user);
        return user;
    }


    public List<User> displayUsers() {
        return userRepository.findAll();
    }


    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }


}

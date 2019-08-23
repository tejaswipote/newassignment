package com.spring.security.service;

import com.spring.security.model.User;
import com.spring.security.principle.UserPrincipal;
import com.spring.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


    @Service
    public class UserService implements UserDetailsService {


        @Autowired
        private UserRepository userRepository;


        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            User user= userRepository.findByUserName(username);
            if(user==null)
                throw new UsernameNotFoundException("User 404");

            return new UserPrincipal(user);
        }
    }


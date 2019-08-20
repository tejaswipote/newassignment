package com.movie.booking.service;


import java.util.List;

import com.movie.booking.model.Screen;
import com.movie.booking.model.Theatre;

import com.movie.booking.repository.ScreenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
    public class ScreenService {

        @Autowired
        private ScreenRepository ScreenRepository;

        public List<Screen> getAllScreen()
        {
            return ScreenRepository.findAll();

        }

        public Screen getScreenById(Long screenId){
            return ScreenRepository.findById(screenId).get();
        }

    }




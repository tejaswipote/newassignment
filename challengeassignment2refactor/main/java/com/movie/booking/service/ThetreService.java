package com.movie.booking.service;

import java.util.ArrayList;
import java.util.List;

import com.movie.booking.model.Theatre;

import com.movie.booking.repository.ThetreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
    public class ThetreService {

        @Autowired
        private ThetreRepository thetreRepository;

        public List<Theatre> getAllTheatre()
        {
            return new ArrayList<>(thetreRepository.findAll());

        }

        public Theatre getTheatreById(Long theatreId){
            return thetreRepository.findById(theatreId).get();
        }

    }


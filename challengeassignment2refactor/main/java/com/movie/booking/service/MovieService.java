package com.movie.booking.service;

import java.util.ArrayList;
import java.util.List;

import com.movie.booking.model.Movie;
import com.movie.booking.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public  List<Movie> getAllMovies()
    {
        return new ArrayList<>(movieRepository.findAll());

    }

    public Movie getMovieById(Long movieId){
        return movieRepository.findById(movieId).get();
    }

}


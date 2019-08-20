package com.movie.booking.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.booking.model.Movie;
import com.movie.booking.service.MovieService;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/allmovies")
    public List<Movie> findAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/movies/{movie_id}")
    public ResponseEntity<?> getMovieById(@PathVariable Long movie_id) {
        Movie movie = movieService.getMovieById(movie_id);
        return ResponseEntity.status(HttpStatus.OK).body(movie);
    }

}

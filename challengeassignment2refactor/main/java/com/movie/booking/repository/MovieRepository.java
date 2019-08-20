package com.movie.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.booking.model.Movie;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}

package com.movie.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.booking.model.Theatre;
import org.springframework.stereotype.Repository;

@Repository
public interface
ThetreRepository extends JpaRepository<Theatre, Long> {
}


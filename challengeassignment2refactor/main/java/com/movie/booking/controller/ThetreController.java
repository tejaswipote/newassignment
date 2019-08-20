package com.movie.booking.controller;

import java.util.List;

import com.movie.booking.model.Theatre;
import com.movie.booking.service.ThetreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ThetreController {

    @Autowired
    private ThetreService thetreService;

    @GetMapping("/alltheatre")
    public List<Theatre> findAllTheatres() {
        List<Theatre> theatres = thetreService.getAllTheatre();
        theatres.stream().forEach(System.out::println);
        return theatres;
    }

    @GetMapping("/theatre/{theatre_id}")
    public ResponseEntity<?> getTheatreById(@PathVariable Long theatre_id) {
        Theatre theatre = thetreService.getTheatreById(theatre_id);
        return ResponseEntity.status(HttpStatus.OK).body(theatre.toString());
    }

}

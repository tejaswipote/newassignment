package com.movie.booking.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long movieId;
    private String movieName;
    @Temporal(value = TemporalType.DATE)
    private Date releaseDate;
    @Temporal(value = TemporalType.DATE)
    private Date expiryDate;


    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "movie_theatre", joinColumns = {@JoinColumn(name = "theatre_id")}, inverseJoinColumns = {@JoinColumn(name = "movie_id")})
    private List<Theatre> theatres;
}
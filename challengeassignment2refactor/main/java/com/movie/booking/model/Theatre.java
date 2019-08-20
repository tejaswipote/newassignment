package com.movie.booking.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Table
public class Theatre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long theatreId;

    private String theatreName;
    private Long screenCount;


    @OneToMany(mappedBy="theatre")
    @JsonManagedReference
    private Set<Screen> screen;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JsonBackReference
    @JoinTable(name = "movie_theatres", joinColumns = {@JoinColumn(name = "theatre_id")}, inverseJoinColumns = {@JoinColumn(name = "movie_id")})
    private Set<Movie> movies;
}

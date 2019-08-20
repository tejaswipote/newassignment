package com.movie.booking.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;



@Getter
@Setter
@Entity
@NoArgsConstructor
public class Screen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long screenId;
    private Long seatCount;

    @ManyToOne
    @JoinColumn(name="theatre_id", nullable=false)
    @JsonBackReference
    private Theatre theatre;

}

package model;

import java.io.Serializable;
import java.sql.Time;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name = "screen")
public class Screen implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "id")
@JsonView
private int id;

@Column(name = "showtime")
@JsonView
Time showtime;

@OneToMany(fetch = FetchType.LAZY, mappedBy = "theatre")
@JsonView
private List<Seat> seatsList;

@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   @JoinColumn(name = "theatre_id")
   @JsonView	
   private Theatre theatre;

@OneToOne
@JoinColumn(name="movieid")
private Movie movie;
}

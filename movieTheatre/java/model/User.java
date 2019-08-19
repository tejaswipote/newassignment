package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name = "user")
public class User implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "id")
@JsonView
private Long id;

@Column(name = "username")
@JsonView
private String username;

@Column(name = "password")
@JsonView
private String password;

@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
@JsonView
private List<Seat> seatsList;

public void setId(Long id) {
this.id = id;
}

public void setUsername(String username) {
this.username = username;
}

public void setPassword(String password) {
this.password = password;
}

public void setSeatsList(List<Seat> seatsList) {
this.seatsList = seatsList;
}

public Long getId() {
return id;
}

public String getUsername() {
return username;
}

public String getPassword() {
return password;
}

public List<Seat> getSeatsList() {
return seatsList;
}

}


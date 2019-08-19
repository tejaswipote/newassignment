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
@Table(name = "theatre")
public class Theatre implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "id")
@JsonView
private Long id;
@Column(name = "theatrename")
@JsonView
private String username;
@OneToMany(fetch = FetchType.LAZY, mappedBy = "theatre")
@JsonView
private List<Screen> screensList;
public Long getId() {
return id;
}
public String getUsername() {
return username;
}
public List<Screen> getScreensList() {
return screensList;
}
public void setId(Long id) {
this.id = id;
}
public void setUsername(String username) {
this.username = username;
}
public void setScreensList(List<Screen> screensList) {
this.screensList = screensList;
}

}

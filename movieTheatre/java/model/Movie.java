package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Table(name = "movie")
public class Movie {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "id")
@JsonView
int id;//autoincrement daal

@Column(name = "nameofmovie")
@JsonView
String nameofmovie;

@Column(name = "releasedate")
@JsonView
Date releasedate;

@Column(name = "enddate")
@JsonView
Date enddate;

@Column(name = "screenid")
@JsonView
int screenid;

@OneToOne
@JoinColumn(name="screenid")
private Screen screen;
public void setId(int id) {
this.id = id;
}

public void setNameofmovie(String nameofmovie) {
this.nameofmovie = nameofmovie;
}

public void setReleasedate(Date releasedate) {
this.releasedate = releasedate;
}

public void setEnddate(Date enddate) {
this.enddate = enddate;
}

public void setScreenid(int screenid) {
this.screenid = screenid;
}

public int getId() {
return id;
}

public String getNameofmovie() {
return nameofmovie;
}

public Date getReleasedate() {
return releasedate;
}

public Date getEnddate() {
return enddate;
}

public int getScreenid() {
return screenid;
}
}


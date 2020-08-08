package com.capg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="traineedata")
public class Trainee {
@Id
int id;
@Column(name="trainee_name")
String name;
String email;
public Trainee() {
	super();
	// TODO Auto-generated constructor stub
}
public Trainee(int id, String name, String email) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Trainee [id=" + id + ", name=" + name + ", email=" + email + "]";
}
}

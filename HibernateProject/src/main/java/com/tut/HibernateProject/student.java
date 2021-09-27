package com.tut.HibernateProject;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class student {
@Id
private int id;
private String name;
private String city;



public student(int id, String name, String city) {
super();
this.id = id;
this.name = name;
this.city = city;
}



public student() {
super();
// TODO Auto-generated constructor stub
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



public String getCity() {
return city;
}



public void setCity(String city) {
this.city = city;
}



@Override
public String toString() {
// TODO Auto-generated method stub
return this.id + " : " + this.name + " : " + this.city;
}



}

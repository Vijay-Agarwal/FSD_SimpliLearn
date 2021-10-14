package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity //Class level Annotation
@Table(name="student")

public class Student {
@Id// The column which contain primary key
@Column(name="id")
private int id;

@Column(name="name")
private String name;

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
	String Name = name;
}
}
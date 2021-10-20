package com.bean;

import java.util.List;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.CascadeType;
//import org.hibernate.mapping.List;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Trainer {
@Id
private int tid;
private String tname;
private String tech;
@OneToMany (mappedBy="tsid",cascade = CascadeType.ALL)
private  List<Students> listOfStd;
public List<Students> getListOfStd() {
	return listOfStd;
}
public void setListOfStd(List<Students> listOfStd) {
	this.listOfStd = listOfStd;
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
}

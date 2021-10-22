package com.dao;

import java.util.List;

import com.model.Classes;

public interface ClassesDAO {

	public Classes createClasses(Classes classes);
	public Classes getClassesById(int classId);
	public List<Classes> getAllClasses();
	public Classes updateClasses (Classes classes);
	public void deleteClasses(int classId);
	

}

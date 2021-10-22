package com.service.implementation;

import java.util.List;

import com.dao.ClassesDAO;
import com.dao.implementation.ClassesDaoImplementation;
import com.model.Classes;
import com.service.ClassesService;

public class ClassesServiceImplementation implements ClassesService {

	private ClassesDAO dao = new ClassesDaoImplementation();

	@Override
	public Classes createClasses(Classes classes) {

		return dao.createClasses(classes);

	}

	@Override
	public Classes getClassesById(int classId){

		return dao.getClassesById(classId);
		
	}

	@Override
	public List<Classes> getAllClasses() {

		return dao.getAllClasses();
	}

	@Override
	public Classes updateClasses(Classes classes) {

		return dao.updateClasses(classes);

	}

	@Override
	public void deleteClasses(int classId) {

		dao.deleteClasses(classId);

	}
}

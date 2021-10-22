package com.service.implementation;

import java.util.List;

import com.dao.SubjectDAO;
import com.dao.implementation.SubjectDaoImplementation;
import com.model.Subject;
import com.service.SubjectService;

public class SubjectServiceImplementation implements SubjectService {
	
	private SubjectDAO dao = new SubjectDaoImplementation();

	@Override
	public Subject createSubject(Subject subject) {

		return dao.createSubject(subject);
	}

	@Override
	public Subject getSubjectById(int subjectId) {
		return dao.getSubjectById(subjectId);
 
	}

	@Override
	public List<Subject> getAllSubject() {

		return dao.getAllSubject();
	}

	@Override
	public Subject updateSubject(Subject subject) {

		return dao.updateSubject(subject);
	}

	@Override
	public void deleteSubject(int subjectId) {

		dao.deleteSubject(subjectId);

	}

}

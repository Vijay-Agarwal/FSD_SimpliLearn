package com.service;

import java.util.List;

import com.model.Subject;

public interface SubjectService {
	
	public Subject createSubject(Subject subject);

	public Subject getSubjectById(int subjectId);

	public List<Subject> getAllSubject();

	public Subject updateSubject(Subject subject);

	public void deleteSubject(int subjectId);

}

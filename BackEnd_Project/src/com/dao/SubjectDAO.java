package com.dao;

import java.util.List;

import com.model.Subject;

public interface SubjectDAO {

	public Subject createSubject(Subject subject);

	public Subject getSubjectById(int subjectId);

	public List<Subject> getAllSubject();

	public Subject updateSubject(Subject subject);

	public void deleteSubject(int subjectId);
}

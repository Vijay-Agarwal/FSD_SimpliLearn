package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDAO {
	public Student createStudent(Student student);
	public Student getStudentById(int studentId);
	public List<Student> getAllStudents();
	public Student updateStudent(Student student);
	public void deleteStudent(int studentId);
}

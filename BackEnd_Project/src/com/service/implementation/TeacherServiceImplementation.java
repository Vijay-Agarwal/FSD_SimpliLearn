package com.service.implementation;

import java.util.List;

import com.dao.TeacherDAO;
import com.dao.implementation.TeacherDaoImplementation;
import com.model.Teacher;
import com.service.TeacherService;

public class TeacherServiceImplementation implements TeacherService {
	
	private TeacherDAO dao = new TeacherDaoImplementation();

	@Override
	public Teacher createTeacher(Teacher teacher) {

		return dao.createTeacher(teacher);
	}

	@Override
	public Teacher getTeacherById(int teacherId){
		return dao.getTeacherById(teacherId);

	}

	@Override
	public List<Teacher> getAllTeachers() {

		return dao.getAllTeachers();
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {

		return dao.updateTeacher(teacher);
	}

	@Override
	public void deleteTeacher(int teacherId) {

		dao.deleteTeacher(teacherId);

	}

}

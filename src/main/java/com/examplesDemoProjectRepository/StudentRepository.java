package com.examplesDemoProjectRepository;

import java.util.List;

import com.examplesDemoProjectEntity.Student;

public interface StudentRepository {
	
	Student save(Student student);
	
	Student getStudent(int sId);
	
	boolean update (Student student,int sId);

	boolean deleteStudent(int sid);
	boolean deleteStudent(String sName);
	List<Student> getAll();

}

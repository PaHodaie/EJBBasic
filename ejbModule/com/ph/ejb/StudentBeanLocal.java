package com.ph.ejb;

import java.util.List;

import javax.ejb.Local;

import com.ph.entities.Student;

/**
 * interface for local calls
 * 
 * @author Parviz
 * 
 */
@Local
public interface StudentBeanLocal {

	void studentTest();

	void saveStudent(Student student);

	Student findStudent(Student student);

	List<Student> retrieveAllStudents();

}

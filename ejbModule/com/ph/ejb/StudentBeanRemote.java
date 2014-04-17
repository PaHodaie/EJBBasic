package com.ph.ejb;

import java.util.List;

import javax.ejb.Remote;

import com.ph.entities.Student;

/**
 * interface for remote calls
 * 
 * @author Parviz
 * 
 */
@Remote
public interface StudentBeanRemote {

	void studentTest();

	void saveStudent(Student student);

	Student findStudent(Student student);

	List<Student> retrieveAllStudents();

}

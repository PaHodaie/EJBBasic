package com.ph.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ph.entities.Student;
/**
 * this stateless bean contains daos and business logic methods both
 * 
 * @author Parviz
 *
 */
@Stateless
public class StudentBean implements StudentBeanLocal, StudentBeanRemote {

	public static final String RemoteJNDIName = StudentBean.class
			.getSimpleName() + "/remote";
	public static final String LocalJNDIName = StudentBean.class
			.getSimpleName() + "/local";

	@PersistenceContext(unitName = "daoEJB")
	private EntityManager entityManager;

	@Override
	public void studentTest() {
		Student student = new Student(null, "Informatik", "1992");
		saveStudent(student);
		List<Student> sts=retrieveAllStudents();
		System.out.println("Anzahl: " +sts.size());

	}

	@Override
	public void saveStudent(Student student) {
		entityManager.persist(student);
	}

	@Override
	public Student findStudent(Student student) {
		
		return entityManager.find(Student.class, student);
	}

	@Override
	public List<Student> retrieveAllStudents() {
		String str ="from Student student";
		Query q= entityManager.createQuery(str);
		List<Student> students=q.getResultList();
		return students;
	}

}

package com.ph.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Student")
@SequenceGenerator(name="SEQ_STUDENT", sequenceName="STUDENT_SEQ")
public class Student extends AbstractEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SEQ_STUDENT")
	private Integer id;
	/**
	 * fach des Studentes
	 */
	private String fach;
	/**
	 * Jahrgang des Studentes
	 */
	private String jahrgang;
	
	public Student() {
		super();
		
	}

	public Student(Integer id, String fach, String jahrgang) {
		super();
		this.id = id;
		this.fach = fach;
		this.jahrgang = jahrgang;
	}

	@Override
	public Object getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFach() {
		return fach;
	}

	public void setFach(String fach) {
		this.fach = fach;
	}

	public String getJahrgang() {
		return jahrgang;
	}

	public void setJahrgang(String jahrgang) {
		this.jahrgang = jahrgang;
	}

}

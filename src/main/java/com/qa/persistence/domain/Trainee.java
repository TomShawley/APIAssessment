package com.qa.persistence.domain;



import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;


@Entity
public class Trainee {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private Long trianeeID;
	private String traineeName;
	@ManyToOne
	@JoinColumn(name="classroom_id")
	private Classroom classroom;

	public Trainee() {

	}

	public Trainee(Long id, Long traineeID, String traineeName, Classroom classroom) {
		this.id = id;
		this.trianeeID = traineeID;
		this.traineeName = traineeName;
		this.classroom = classroom;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTrianeeID() {
		return trianeeID;
	}

	public void setTrianeeID(Long trianeeID) {
		this.trianeeID = trianeeID;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	

}

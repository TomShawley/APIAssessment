package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainee {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private Long trianeeID;
	
	

	public Trainee() {

	}

	public Trainee(Long id, Long traineeID) {
		this.id = id;
		this.trianeeID = traineeID;
		
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
}

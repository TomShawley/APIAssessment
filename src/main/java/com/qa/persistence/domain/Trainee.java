package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Trainee {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private Long trianeeID;
	private String traineeName;
	
	

	public Trainee() {

	}

	public Trainee(Long id, Long traineeID, String traineeName) {
		this.id = id;
		this.trianeeID = traineeID;
		this.traineeName = traineeName;
		
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
	@OneToMany
	@JoinTable(name = "Classroom_Trainee",
	joinColumns = @JoinColumn(name = "TraineeID", 
	referencedColumnName = "TraineeID"),
	inverseJoinColumns = @JoinColumn(name = "trainees", 
		referencedColumnName = "userid"))
Classroom classroom;
		
}

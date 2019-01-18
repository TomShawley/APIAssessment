package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;


@Entity
public class Classroom {
	
	

		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Id
		private Long id;
		private Long classroomID;
		private String trainer;
		private Long trainees;
		

		public Classroom() {

		}

		public Classroom(Long id, Long classroomID, String trainer, Long trainees) {
			this.id = id;
			this.classroomID = classroomID;
			this.trainer = trainer;
			this.trainees = trainees;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getClassroomID() {
			return classroomID;
		}

		public void setClassroomID(Long classroomID) {
			this.classroomID = classroomID;
		}

		public String getTrainer() {
			return trainer;
		}

		public void setTrainer(String trainer) {
			this.trainer = trainer;
		}

		public Long getTrainees() {
			return trainees;
		}

		public void setTrainees(Long trainees) {
			this.trainees = trainees;
		}
		
		@ManyToOne
		@JoinTable(name="Classroom_Trainee",
		joinColumns = @JoinColumn(name="trainees", 
		referencedColumnName = "userid"),
		inverseJoinColumns = @JoinColumn(name= "TraineeID", 
		referencedColumnName = "TraineeID"))
		Trainee trainee;

}

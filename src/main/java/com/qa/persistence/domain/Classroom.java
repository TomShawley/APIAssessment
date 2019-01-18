package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Classroom {
	
	

		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Id
		private Long id;
		private Long classroomID;
		private String trainer;
		private String trainee;
		

		public Classroom() {

		}

		public Classroom(Long id, Long classroomID, String trainer, String trianee) {
			this.id = id;
			this.classroomID = classroomID;
			this.trainer = trainer;
			this.trainee = trainee;
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

		public String getTrainee() {
			return trainee;
		}

		public void setTrainee(String trainee) {
			this.trainee = trainee;
		}

}

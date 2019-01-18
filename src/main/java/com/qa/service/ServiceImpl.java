package com.qa.service;

import javax.inject.Inject;

import com.qa.persistence.repository.Repository;

public class ServiceImpl implements Service {
	@Inject
	private Repository repo;

	public String getAllTrainees() {
		return repo.getAllTrainees();
	}

	public String createTrainee(String trainee) {
		return repo.createTrainee(trainee);
	}

	public String deleteTrainee(Long id) {
		return repo.deleteTrainee(id);
	}

	public String findATrainee(Long id) {
		return repo.findATrainee(id);
	}

	public String updateATrainee(Long id, String trainee) {
		return repo.updateATrainee(id, trainee);
	}

	public String getAllClassrooms() {
		return repo.getAllClassrooms();
	}

	public String createClassroom(String Classroom) {
		return repo.createClassroom(Classroom);
	}

	public String deleteClassroom(Long id) {
		return repo.deleteClassroom(id);
	}

	public String updateClassroom(Long id, String classroom) {
		return repo.updateClassroom(id, classroom);
	}

	public String findAClassroom(Long id) {
		return repo.findAClassroom(id);
	}

}

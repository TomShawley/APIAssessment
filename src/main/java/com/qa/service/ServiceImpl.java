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

}

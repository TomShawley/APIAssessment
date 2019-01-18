package com.qa.persistence.repository;

public interface Repository {
	
	String getAllTrainees();
	String createTrainee(String trainee);
	String deleteTrainee(Long id);
	String findATrainee(Long id);
	String updateATrainee(Long id, String trainee);

}

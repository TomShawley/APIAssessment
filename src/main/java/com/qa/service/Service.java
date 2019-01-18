package com.qa.service;

public interface Service {
	
	String getAllTrainees();
	String createTrainee(String trainee);
	String deleteTrainee(Long id);
	String findATrainee(Long id);
	String updateATrainee(Long id, String trainee);


}

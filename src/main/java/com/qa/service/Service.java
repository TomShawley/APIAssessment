package com.qa.service;

public interface Service {
	
	String getAllTrainees();
	String createTrainee(String trainee);
	String deleteTrainee(Long id);
	String findATrainee(Long id);
	String updateATrainee(Long id, String trainee);
	String getAllClassrooms();
	String createClassroom(String Classroom);
	String deleteClassroom(Long id);
	String updateClassroom(Long id, String classroom);
	String findAClassroom(Long id);


}

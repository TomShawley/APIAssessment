package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Classroom;
import com.qa.persistence.domain.Trainee;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class ClassroomDB implements Repository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	public String getAllTrainees() {
		Query query = manager.createQuery("SELECT a FROM Account a");
		Collection<Trainee> trainee = (Collection<Trainee>) query.getResultList();
		return util.getJSONForObject(trainee);

	}

	@Transactional(REQUIRED)
	public String createTrainee(String trainee) {
		Trainee aTrainee = util.getObjectForJSON(trainee, Trainee.class);
		manager.persist(aTrainee);
		return "{\"message\": \"account has been sucessfully added\"}";
	}

	@Transactional(REQUIRED)
	public String deleteTrainee(Long id) {
		Trainee traineeInDB = manager.find(Trainee.class, id);
		if (traineeInDB != null) {
			manager.remove(traineeInDB);
		}

		return "{\"message\": \"account sucessfully deleted\"}";
	}

	public String findATrainee(Long id) {
		Trainee trainee = manager.find(Trainee.class, id);
		return util.getJSONForObject(trainee);
	}

	@Transactional(REQUIRED)
	public String updateATrainee(Long id, String trainee) {
		Trainee aTrainee = manager.find(Trainee.class, id);
		manager.remove(aTrainee);
		Trainee updTrainee = util.getObjectForJSON(trainee, Trainee.class);
		return "{\"message\": \"account has been sucessfully updated\"}";
	}

	public String getAllClassrooms() {
		Query query = manager.createQuery("SELECT a FROM Account a");
		Collection<Classroom> classroom = (Collection<Classroom>) query.getResultList();
		return util.getJSONForObject(classroom);
	}

	public String createClassroom(String Classroom) {
		Classroom aClassroom = util.getObjectForJSON(Classroom, Classroom.class);
		manager.persist(aClassroom);
		return "{\"message\": \"account has been sucessfully added\"}";
	}

	public String deleteClassroom(Long id) {
		Classroom classroomInDB = manager.find(Classroom.class, id);
		if (classroomInDB != null) {
			manager.remove(classroomInDB);
		}

		return "{\"message\": \"account sucessfully deleted\"}";
		
	}

	public String updateClassroom(Long id, String classroom) {
		Classroom aclassroom = manager.find(Classroom.class, id);
		manager.remove(aclassroom);
		Classroom updclassroom = util.getObjectForJSON(classroom, Classroom.class);
		manager.persist(updclassroom);
		return "{\"message\": \"account has been sucessfully updated\"}";
	}
	public String findAClassroom(Long id) {
		Classroom classroom = manager.find(Classroom.class, id);
		return util.getJSONForObject(classroom);
	}


	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public JSONUtil getUtil() {
		return util;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}

	
}

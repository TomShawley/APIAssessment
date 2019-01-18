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

import com.qa.persistence.domain.Trainee;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class TraineeDB implements Repository {
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	
	public String getAllTrainees() {
		Query query = manager.createQuery("SELECT a FROM Account a");
		Collection<Trainee> account = (Collection<Trainee>) query.getResultList();
		return util.getJSONForObject(account);

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

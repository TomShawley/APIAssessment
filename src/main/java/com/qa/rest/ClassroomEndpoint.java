package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.service.Service;

@Path("/classroom")
public class ClassroomEndpoint {
	@Inject
	private Service service;
	
	@Path("/getAllClassrooms")
	@GET
	@Produces({ "application/json" })
	public String getAllClassrooms() {
		return service.getAllClassrooms();
	}

	@Path("/createClassroom")
	@POST
	@Produces({ "application/json" })
	public String createClassroom(String classroom) {
		return service.createTrainee(classroom);
	}

	@Path("/deleteClassroom/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteClassroom(@PathParam("id") Long id) {
		return service.deleteClassroom(id);
	}
	@Path("/updateATrainee/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateAClassroom(@PathParam("id") Long id, String classroom) {
		return service.updateATrainee(id, classroom);
	}

	public void setService(Service service) {
		this.service = service;
	}

}

package com.examplesDemoProjectController;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.examplesDemoProjectEntity.Student;
import com.examplesDemoProjectRepository.StudentRepository;
import static javax.ws.rs.core.Response.ok;

import java.util.List;;

@Path("/stu")
@RequestScoped
public class StudentController {

	private StudentRepository repo;

	@Inject
	public StudentController(StudentRepository repo) {
		this.repo = repo;
	}
	
	@Path("/save")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveStudent(Student student) {
		return ok(this.repo.save(student)).build();
	}
	
	
	@Path("/get/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response get(@PathParam("id") int sId) {
		return ok(this.repo.getStudent(sId)).build();
	}
	
	@Path("/delete/{id}")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean delete(@PathParam("id")int sId) {
		return this.repo.deleteStudent(sId);
	}
	
	
	@Path("/delete/{sName}")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean delete(@PathParam("sName")String sName) {
		return this.repo.deleteStudent(sName);
	}
	
	@Path("/update/{id}")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean updateStudent(Student student,@PathParam("id") int sId) {
		return this.repo.update(student, sId);
	}
	
	@Path("/getall")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getTable(){
		return this.repo.getAll();
	}
}
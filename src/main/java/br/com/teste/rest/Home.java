package br.com.teste.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class Home {

	@GET
	@Path("/home")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getHello() {
		Hello hello = new Hello();
		hello.setMessage("Hello Buddy");
		return Response.ok().entity(hello).build();
	}
}

class Hello {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
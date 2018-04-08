package br.com.teste.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.teste.model.AccountCredentials;

@Path("/rest")
public class TestRest {

	@POST
	@Path("/teste")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTeste(AccountCredentials accountCredentials) {
		return Response.ok().entity(accountCredentials).build();
	}
}

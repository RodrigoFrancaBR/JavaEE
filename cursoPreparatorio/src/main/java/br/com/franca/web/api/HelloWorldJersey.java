package br.com.franca.web.api;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.franca.model.Aluno;

@Path("helloworld")
public class HelloWorldJersey {

	private static Log LOG = LogFactory.getLog(HelloWorldJersey.class);

	@Inject
	Aluno aluno;
/*
	@GET
	@Produces("text/plain")
	public String getHello() {
		// testando a injeção de dependencia
		String result = aluno.getId() + ", " + aluno.getNome();
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			LOG.error("Erro no getHello(): " + e.getMessage() + " " + e);
		}

		return result;
	}
*/
	@GET
	@Path("/{id}/")	
	public Response findById(@PathParam("id") Long id) {

		if (id<0) {
			return Response.status(Status.NOT_FOUND).entity(id).build();
		} else {
			return Response.status(Status.OK).entity(id).build();
		}
	}

}

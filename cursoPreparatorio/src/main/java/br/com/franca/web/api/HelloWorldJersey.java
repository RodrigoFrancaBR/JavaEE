package br.com.franca.web.api;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.franca.model.Aluno;

@Path("helloworld")
public class HelloWorldJersey {

	@Inject
	Aluno aluno;

	@GET
	@Produces("text/plain")
	public String getHello() {
		String result = aluno.getId() + ", " + aluno.getNome();
		return result;
	}
}

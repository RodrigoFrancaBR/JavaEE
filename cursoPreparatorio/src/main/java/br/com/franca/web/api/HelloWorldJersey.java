package br.com.franca.web.api;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.franca.model.Aluno;

@Path("helloworld")
public class HelloWorldJersey {

	private static Log LOG = LogFactory.getLog(HelloWorldJersey.class);
	
	@Inject
	Aluno aluno;
	
	

	@GET
	@Produces("text/plain")
	public String getHello() {
		// testando a injeção de dependencia
		String result = aluno.getId() + ", " + aluno.getNome();
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			LOG.error("Erro no getHello(): " + e.getMessage() + " " +e);
		}		
		
		return result;
	}
}

package com.nassau.exercicio.convidado.resource;

import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.nassau.exercicio.convidado.model.Convidado;
import com.nassau.exercicio.convidado.repository.ConvidadoRepository;

@Path("/convidados")
@Produces("application/json")
public class ConvidadoResource extends Application {

	@GET
	public Response pesquisar() {
		List<Convidado> convidados = ConvidadoRepository.pesquisar("");
		Gson gson = new Gson();

		String json = gson.toJson(convidados);
		return Response.ok().entity(json).build();
	}

}

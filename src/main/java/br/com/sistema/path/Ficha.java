package br.com.sistema.path;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


import com.google.gson.Gson;

@Path("ficha")
public class Ficha {
	@GET
	@Path("oi")
	@Produces("application/json")
	public Response oi () {
		
		return Response.ok(new Gson().toJson("ok funcionou")).build();
	}
}

package co.com.ecommerce.servicesRs;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.Produces;
import co.com.ecommerce.entities.Ciudad;
import co.com.ecommerce.servicesImpl.CiudadServiceImpl;

@Path("/ciudad")
public class CiudadServiceRS {
	
	//CiudadService cs = new CiudadServiceImpl();
	
	private CiudadServiceImpl ciudadServiceImpl;
	
	public CiudadServiceRS () {
		ciudadServiceImpl = new CiudadServiceImpl();
	}
	
	
	
	/*
	@POST
	@Path("/saludo")
	@Produces(MediaType.APPLICATION_JSON)
	public String saludar() {
		return cs.saludar();
	}
	

	@GET
	@Path("/saludo/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String saludarConParametro(@PathParam("id")int id) {
     return cs.saludarConParametro(id);
    
   */
  
	@POST
	@Path("/crearCiudad")
	@Produces(MediaType.APPLICATION_JSON)
	public Response crearCiudad(Ciudad ciudad) {
		ciudadServiceImpl.CrearCiudad(ciudad);
		return Response.ok().entity(ciudad).build();
		
	 }
	
		
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/buscar/{id}")
	public Ciudad buscar (@PathParam("id")Integer id) {
		Ciudad ciudad = ciudadServiceImpl.buscar(id);
		return ciudad;
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/buscarCiudad/{id}")
	public List<Ciudad>buscarCiudad(@PathParam("id")Integer id) {
		   List<Ciudad> ciudad = ciudadServiceImpl.buscaCiudad(id);
		return ciudad;
		   
	}
	}
	

	

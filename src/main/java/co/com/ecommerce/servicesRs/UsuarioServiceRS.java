package co.com.ecommerce.servicesRs;


import javax.ejb.Stateless;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.com.ecommerce.entities.Ciudad;
import co.com.ecommerce.servicesImpl.UsuarioServicelmpl;





@Path("/usuario")
@Stateless
public class UsuarioServiceRS  {

   
     UsuarioServicelmpl  usi;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
     
        public Ciudad buscarCiudadPorId(@PathParam("id") int id) {
        return usi.buscarCiudad(id);


    }

	
	}

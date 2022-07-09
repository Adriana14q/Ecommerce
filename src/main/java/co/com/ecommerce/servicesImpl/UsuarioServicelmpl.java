package co.com.ecommerce.servicesImpl;


import javax.ejb.Stateless;



import co.com.ecommerce.daos.CiudadDao;
import co.com.ecommerce.entities.Ciudad;
import co.com.ecommerce.services.UsuarioService.Usuarioservice;




	@Stateless
	public class UsuarioServicelmpl implements Usuarioservice  {

	 
	    CiudadDao cd;
	    
	    @Override
	    public void registrar (Ciudad c) {
	        cd.guardar(c);

	    }

	    @Override
	    public Ciudad buscarCiudad (int id) {

	        return cd.buscar(id);


	    }

	    @Override
	    public void restrar(Ciudad c) {
	
	    	        // TODO Auto-generated method stub
	    		  
	    }

}

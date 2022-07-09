package co.com.ecommerce.services;

import java.util.List;

import co.com.ecommerce.entities.Ciudad;

public interface CiudadService {

  
	public String saludar();
	public String saludarConParametro(int id);
	public void  CrearCiudad(Ciudad ciudad);
	public void consultarCiudad(int id);
	
	
	
	public Ciudad buscar (Integer id) ;
	public List<Ciudad> buscaCiudad (Integer id);	
		
	}
	
	


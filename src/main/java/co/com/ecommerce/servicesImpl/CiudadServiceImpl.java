package co.com.ecommerce.servicesImpl;

import java.util.List;


import co.com.ecommerce.daos.CiudadDao;

import co.com.ecommerce.entities.Ciudad;
import co.com.ecommerce.services.CiudadService;

public class CiudadServiceImpl implements CiudadService {
 
	private	CiudadDao  ciudadDao;

	
	
	
	public CiudadServiceImpl() {
		ciudadDao = new CiudadDao();
		
	}
   
	
	@Override
	public Ciudad buscar(Integer id) {
	Ciudad ciudad = ciudadDao.buscar(id);
		return ciudad;
	}

	@Override
	public List<Ciudad> buscaCiudad(Integer id) {
		 List<Ciudad> ciudad = ciudadDao.buscaCiudad(id);
		return ciudad;
	}


	@Override
	public String saludar() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String saludarConParametro(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void CrearCiudad(Ciudad ciudad) {
	ciudadDao.crearCiudad(ciudad);
		
	}


	@Override
	public void consultarCiudad(int id) {
		// TODO Auto-generated method stub
		
	}

	
	
	
    }

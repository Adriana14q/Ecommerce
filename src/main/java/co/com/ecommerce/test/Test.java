package co.com.ecommerce.test;

import co.com.ecommerce.daos.CiudadDao;


import co.com.ecommerce.entities.Ciudad;
import co.com.ecommerce.utilities.Conexion;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ciudad c = new Ciudad();
		CiudadDao cd = new CiudadDao();
		c.setId(62);
		c.setCiudades("Sarabena");
		c.setIdDepartamento(39);
		cd.guardar(c);
		Conexion.shutdown();
		
		

	}
  
}

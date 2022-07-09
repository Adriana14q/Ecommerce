package co.com.ecommerce.daos;

import javax.persistence.EntityManager;


import co.com.ecommerce.entities.Rol;
import co.com.ecommerce.utilities.Conexion;

public class RolDao {

EntityManager entity = Conexion.getEntityManagerFactory().createEntityManager();
	
	//............Guardar ......................
		
		public void guardar(Rol rol) {
			entity.getTransaction().begin();
			entity.persist(rol);
			entity.getTransaction().commit();  // guarda
			
		}

	//.......Editar ......................
		
		public void editar(Rol rol) {
			entity.getTransaction().begin();
			entity.merge(rol);  //update o edicion
			entity.getTransaction().commit();
			
		}
		
	//........Buscar ..................
		public Rol buscar (Integer id) {
			Rol r = new Rol();
			r = entity.find(Rol.class, id);
			
			return r;
		}
		
	//........Eliminar ..................
			public void eliminar (Integer id) {
				Rol r = new Rol();
				r = entity.find(Rol.class, id);
				entity.getTransaction().begin();
				entity.remove(r);
				entity.getTransaction().commit();  // guarda

			}
}

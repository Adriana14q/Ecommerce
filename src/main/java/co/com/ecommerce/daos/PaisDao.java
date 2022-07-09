package co.com.ecommerce.daos;

import javax.persistence.EntityManager;


import co.com.ecommerce.entities.Pais;
import co.com.ecommerce.utilities.Conexion;

public class PaisDao {
EntityManager entity = Conexion.getEntityManagerFactory().createEntityManager();
	
	//............Guardar ......................
		
		public void guardar(Pais pais) {
			entity.getTransaction().begin();
			entity.persist(pais);
			entity.getTransaction().commit();  // guarda
			//JPAUtil.shutdown();
		}

	//.......Editar ......................
		
		public void editar(Pais pais) {
			entity.getTransaction().begin();
			entity.merge(pais);  //update o edicion
			entity.getTransaction().commit();
			//JPAUtil.shutdown();
		}
		
	//........Buscar ..................
		public Pais buscar (Integer id) {
			Pais pa = new Pais();
			pa = entity.find(Pais.class, id);
			//JPAUtil.shutdown();
			return pa;
		}
		
	//........Eliminar ..................
			public void eliminar (Integer id) {
				Pais pa = new Pais();
				pa = entity.find(Pais.class, id);
				entity.getTransaction().begin();
				entity.remove(pa);
				entity.getTransaction().commit();  // guarda

			}

}

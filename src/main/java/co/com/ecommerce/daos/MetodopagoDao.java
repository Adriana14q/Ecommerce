package co.com.ecommerce.daos;

import javax.persistence.EntityManager;


import co.com.ecommerce.entities.Metodopago;
import co.com.ecommerce.utilities.Conexion;

public class MetodopagoDao {
EntityManager entity = Conexion.getEntityManagerFactory().createEntityManager();
	
	//............Guardar ......................
		
		public void guardar(Metodopago metodopago) {
			entity.getTransaction().begin();
			entity.persist(metodopago);
			entity.getTransaction().commit();  // guarda
			//JPAUtil.shutdown();
		}

	//.......Editar ......................
		
		public void editar(Metodopago metodopago) {
			entity.getTransaction().begin();
			entity.merge(metodopago);  //update o edicion
			entity.getTransaction().commit();
			//JPAUtil.shutdown();
		}
		
	//........Buscar ..................
		public Metodopago buscar (Integer id) {
			Metodopago mp = new Metodopago();
			mp = entity.find(Metodopago.class, id);
			//JPAUtil.shutdown();
			return mp;
		}
		
	//........Eliminar ..................
			public void eliminar (Integer id) {
				Metodopago mp = new Metodopago();
				mp = entity.find(Metodopago.class, id);
				entity.getTransaction().begin();
				entity.remove(mp);
				entity.getTransaction().commit();  // guarda

			}
}

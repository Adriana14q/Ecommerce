package co.com.ecommerce.daos;

import javax.persistence.EntityManager;


import co.com.ecommerce.entities.Factura;
import co.com.ecommerce.utilities.Conexion;

public class FacturaDao {
EntityManager entity = Conexion.getEntityManagerFactory().createEntityManager();
	
	//............Guardar ......................
		
		public void guardar(Factura factura) {
			entity.getTransaction().begin();
			entity.persist(factura);
			entity.getTransaction().commit();  // guarda
			//JPAUtil.shutdown();
		}

	//.......Editar ......................
		
		public void editar(Factura factura) {
			entity.getTransaction().begin();
			entity.merge(factura);  //update o edicion
			entity.getTransaction().commit();
			//JPAUtil.shutdown();
		}
		
	//........Buscar ..................
		public Factura buscar (Integer id) {
			Factura f = new Factura();
			f = entity.find(Factura.class, id);
			//JPAUtil.shutdown();
			return f;
		}
		
	//........Eliminar ..................
			public void eliminar (Integer id) {
				Factura f = new Factura();
				f = entity.find(Factura.class, id);
				entity.getTransaction().begin();
				entity.remove(f);
				entity.getTransaction().commit();  // guarda

			}
}

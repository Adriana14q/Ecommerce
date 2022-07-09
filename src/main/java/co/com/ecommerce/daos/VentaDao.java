package co.com.ecommerce.daos;

import javax.persistence.EntityManager;

import co.com.ecommerce.entities.Venta;
import co.com.ecommerce.utilities.Conexion;

public class VentaDao {
EntityManager entity = Conexion.getEntityManagerFactory().createEntityManager();
	
	//............Guardar ......................
		
		public void guardar(Venta venta) {
			entity.getTransaction().begin();
			entity.persist(venta);
			entity.getTransaction().commit();  // guarda
			//JPAUtil.shutdown();
		}

	//.......Editar ......................
		
		public void editar(Venta venta) {
			entity.getTransaction().begin();
			entity.merge(venta);  //update o edicion
			entity.getTransaction().commit();
			//JPAUtil.shutdown();
		}
		
	//........Buscar ..................
		public Venta buscar (Integer id) {
			Venta v = new Venta();
			v = entity.find(Venta.class, id);
			//JPAUtil.shutdown();
			return v;
		}
		
	//........Eliminar ..................
			public void eliminar (Integer id) {
				Venta v = new Venta();
				v = entity.find(Venta.class, id);
				entity.getTransaction().begin();
				entity.remove(v);
				entity.getTransaction().commit();  // guarda

			}
}

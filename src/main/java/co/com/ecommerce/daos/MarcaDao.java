package co.com.ecommerce.daos;

import javax.persistence.EntityManager;


import co.com.ecommerce.entities.Marca;
import co.com.ecommerce.utilities.Conexion;
public class MarcaDao {
EntityManager entity = Conexion.getEntityManagerFactory().createEntityManager();
	
	//............Guardar ......................
		
		public void guardar(Marca marca) {
			entity.getTransaction().begin();
			entity.persist(marca);
			entity.getTransaction().commit();  // guarda
			//JPAUtil.shutdown();
		}

	//.......Editar ......................
		
		public void editar(Marca marca) {
			entity.getTransaction().begin();
			entity.merge(marca);  //update o edicion
			entity.getTransaction().commit();
			//JPAUtil.shutdown();
		}
		
	//........Buscar ..................
		public Marca buscar (Integer id) {
			Marca m = new Marca();
			m = entity.find(Marca.class, id);
			//JPAUtil.shutdown();
			return m;
		}
		
	//........Eliminar ..................
			public void eliminar (Integer id) {
				Marca m = new Marca();
				m = entity.find(Marca.class, id);
				entity.getTransaction().begin();
				entity.remove(m);
				entity.getTransaction().commit();  // guarda

			}

}

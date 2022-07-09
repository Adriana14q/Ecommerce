package co.com.ecommerce.daos;

import javax.persistence.EntityManager;
 



import co.com.ecommerce.entities.Categoria;
import co.com.ecommerce.utilities.Conexion;


public class CategoriaDao {
	EntityManager entity = Conexion.getEntityManagerFactory().createEntityManager();
	
	//............Guardar ......................
	
		public void guardar(Categoria categoria) {
			entity.getTransaction().begin();
			entity.persist(categoria);
			entity.getTransaction().commit();  // guarda
			//JPAUtil.shutdown();
		}

	//.......Editar ......................
		
		public void editar(Categoria categoria) {
			entity.getTransaction().begin();
			entity.merge(categoria);  //update o edicion
			entity.getTransaction().commit();
			//JPAUtil.shutdown();
		}
		
	//........Buscar ..................
		public Categoria buscar (Integer id) {
			Categoria ca = new Categoria();
			ca = entity.find(Categoria.class, id);
			//JPAUtil.shutdown();
			return ca;
		}
		
	//........Eliminar ..................
		
		public void eliminar (Integer id) {
			Categoria ca = new Categoria();
			ca = entity.find(Categoria.class, id);
			entity.getTransaction().begin();
			entity.remove(ca);
			entity.getTransaction().commit();  // guarda

			}

}

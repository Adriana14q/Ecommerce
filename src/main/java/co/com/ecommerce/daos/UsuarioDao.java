package co.com.ecommerce.daos;

import javax.persistence.EntityManager;


import co.com.ecommerce.entities.Usuario;
import co.com.ecommerce.utilities.Conexion;

public class UsuarioDao {
EntityManager entity = Conexion.getEntityManagerFactory().createEntityManager();
	
	//............Guardar ......................
		
		public void guardar(Usuario usuario) {
			entity.getTransaction().begin();
			entity.persist(usuario);
			entity.getTransaction().commit();  // guarda
			//JPAUtil.shutdown();
		}

	//.......Editar ......................
		
		public void editar(Usuario usuario) {
			entity.getTransaction().begin();
			entity.merge(usuario);  //update o edicion
			entity.getTransaction().commit();
			//JPAUtil.shutdown();
		}
		
	//........Buscar..................
		public Usuario buscar (Integer id) {
			Usuario u = new Usuario();
			u = entity.find(Usuario.class, id);
			//JPAUtil.shutdown();
			return u;
		}
		
	//........Eliminar ..................
			public void eliminar (Integer id) {
				Usuario u = new Usuario();
				u = entity.find(Usuario.class, id);
				entity.getTransaction().begin();
				entity.remove(u);
				entity.getTransaction().commit();  // guarda

			}
}

package co.com.ecommerce.daos;

import javax.persistence.EntityManager;


import co.com.ecommerce.entities.Empresa;
import co.com.ecommerce.utilities.Conexion;

public class EmpresaDao {

EntityManager entity = Conexion.getEntityManagerFactory().createEntityManager();
	
	//............Guardar ......................
		
		public void guardar(Empresa empresa) {
			entity.getTransaction().begin();
			entity.persist(empresa);
			entity.getTransaction().commit();  // guarda
			//JPAUtil.shutdown();
		}

	//.......Editar ......................
		
		public void editar(Empresa empresa) {
			entity.getTransaction().begin();
			entity.merge(empresa);  //update o edicion
			entity.getTransaction().commit();
			//JPAUtil.shutdown();
		}
		
	//........Buscar ..................
		public Empresa buscar (Integer id) {
			Empresa e = new Empresa();
			e = entity.find(Empresa.class, id);
			//JPAUtil.shutdown();
			return e;
		}
		
	//........Eliminar ..................
			public void eliminar (Integer id) {
				Empresa e = new Empresa();
				e = entity.find(Empresa.class, id);
				entity.getTransaction().begin();
				entity.remove(e);
				entity.getTransaction().commit();  // guarda

			}
}

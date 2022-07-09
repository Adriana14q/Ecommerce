package co.com.ecommerce.daos;

import javax.persistence.EntityManager;



import co.com.ecommerce.entities.Departamento;
import co.com.ecommerce.utilities.Conexion;

public class DepartamentoDao {
EntityManager entity = Conexion.getEntityManagerFactory().createEntityManager();
	
	//............Guardar ......................
		
		public void guardar(Departamento departamento) {
			entity.getTransaction().begin();
			entity.persist(departamento);
			entity.getTransaction().commit();  // guarda
			//JPAUtil.shutdown();
		}

	//.......Editar ......................
		
		public void editar(Departamento departamento) {
			entity.getTransaction().begin();
			entity.merge(departamento);  //update o edicion
			entity.getTransaction().commit();
			//JPAUtil.shutdown();
		}
		
	//........Buscar ..................
		public Departamento buscar (Integer id) {
			Departamento d = new Departamento();
			d = entity.find(Departamento.class, id);
			//JPAUtil.shutdown();
			return d;
		}
		
	//........Eliminar ..................
			public void eliminar (Integer id) {
				Departamento d = new Departamento();
				d = entity.find(Departamento.class, id);
				entity.getTransaction().begin();
				entity.remove(d);
				entity.getTransaction().commit();  // guarda

			}
}

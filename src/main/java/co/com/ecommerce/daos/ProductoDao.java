package co.com.ecommerce.daos;

import javax.persistence.EntityManager;


import co.com.ecommerce.entities.Producto;
import co.com.ecommerce.utilities.Conexion;

public class ProductoDao {
EntityManager entity = Conexion.getEntityManagerFactory().createEntityManager();
	
	//............Guardar ......................
		
		public void guardar(Producto producto) {
			entity.getTransaction().begin();
			entity.persist(producto);
			entity.getTransaction().commit();  // guarda
			
		}

	//.......Editar ......................
		
		public void editar(Producto producto) {
			entity.getTransaction().begin();
			entity.merge(producto);  //update o edicion
			entity.getTransaction().commit();
			
		}
		
	//........Buscar ..................
		public Producto buscar (Integer id) {
			Producto p = new Producto();
			p = entity.find(Producto.class, id);
			
			return p;
		}
		
	//........Eliminar ..................
		public void eliminar (Integer id) {
			Producto p = new Producto();
			p = entity.find(Producto.class, id);
			entity.getTransaction().begin();
			entity.remove(p);
			entity.getTransaction().commit();  // guarda

		}

		public void mostrarProductos(Producto nombre, int cantidadMini){
		    System.out.println("Lista de productos: ");
		    for (int i = 0; i < cantidadMini; i++) {
		        System.out.println("Nombre(i)");
		        }
		}
}

package co.com.ecommerce.daos;





import java.util.ArrayList;

import javax.persistence.EntityManager;

import co.com.ecommerce.entities.Administrador;
import co.com.ecommerce.entities.Producto;
import co.com.ecommerce.utilities.Conexion;

public class AdministradorDao {

	private static final ArrayList<Producto> listaProductos = null;
	EntityManager entity = Conexion.getEntityManagerFactory().createEntityManager();
	
	//............Guardar ......................
	
		public void guardar(Administrador administrador) {
			entity.getTransaction().begin();
			entity.persist(administrador);
			entity.getTransaction().commit();  // guarda
			//JPAUtil.shutdown();
		}

	//.......Editar ......................
		
		public void editar(Administrador administrador) {
			entity.getTransaction().begin();
			entity.merge(administrador);  //update o edicion
			entity.getTransaction().commit();
			//JPAUtil.shutdown();
		}
		
	//........Buscar ..................
		public Administrador buscar (Integer id) {
			Administrador a = new Administrador();
			a = entity.find(Administrador.class, id);
			//JPAUtil.shutdown();
			return a;
		}
		
	//........Eliminar ..................
		
		public void eliminar (Integer id) {
			Administrador a = new Administrador();
			a = entity.find(Administrador.class, id);
			entity.getTransaction().begin();
			entity.remove(a);
			entity.getTransaction().commit();  // guarda
		}
			
		public Producto crearProducto(Producto producto){
		      listaProductos.add(producto);
		      return producto;
		}
		
		
		public Administrador listarProductos(Administrador administrador1){
			 System.out.println("Clase administardor: Lista de productos \n");
			 Producto productosDeAdministrador = null;
			        
			 ArrayList<Producto> productos = administrador1.getListaProductos();
			 for (int i = 0; i < productos.size(); i++) {
			       productosDeAdministrador = productos.get(i);
			       System.out.println(productosDeAdministrador.toString());
			 }
			 return administrador1;
				
		}
}

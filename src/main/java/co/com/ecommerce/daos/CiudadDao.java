package co.com.ecommerce.daos;

import java.util.ArrayList;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.com.ecommerce.entities.Ciudad;
import co.com.ecommerce.utilities.Conexion;

public class CiudadDao {
	

		EntityManager entity = Conexion.getEntityManagerFactory().createEntityManager();


			
		//............Guardar ......................
			
		 public void guardar(Ciudad ciudad) {
				entity.getTransaction().begin();
				entity.persist(ciudad);
				entity.getTransaction().commit();  // guarda
				//JPAUtil.shutdown();
			}

		//.......Editar ......................
			
			public void editar(Ciudad ciudad) {
				entity.getTransaction().begin();
				entity.merge(ciudad);  //update o edicion
				entity.getTransaction().commit();
				//JPAUtil.shutdown();
			}
		/*	
		//........Buscar ..................
			public Ciudad buscar (Integer id) {
				Ciudad c = new Ciudad();
				c = entity.find(Ciudad.class, id);
				//JPAUtil.shutdown();
				return c;
			}
		*/	
			
		//........Eliminar ..................
				public void eliminar (Integer id) {
					Ciudad c = new Ciudad();
					c = entity.find(Ciudad.class, id);
					entity.getTransaction().begin();
					entity.remove(c);
					entity.getTransaction().commit();  // guarda

				}
        
	     public CiudadDao consultarCiudad(int id) {
					// TODO Auto-generated method stub
					return null;
				}
				
				
    
		  public void agregarCiudad(Ciudad ciudad) {
					
					
					
				}
					
				
					
		   public void crearCiudad1(Ciudad ciudad) {
				entity.getTransaction()	.begin();	
				entity.persist(ciudad);	
				entity.getTransaction().commit();	
					
					
		       }
    
		        
			public Ciudad buscar (Integer id) {
				Ciudad ciudad = new Ciudad();
				ciudad = entity.find(Ciudad.class, id);
				if (ciudad.getIdDepartamento()  ) {
				return ciudad;	
				
				}
				return null;
				
			}
			
	
		
			public List<Ciudad> buscaCiudad (Integer id){
				List<Ciudad>ciudad = new ArrayList<>();
				Query q = entity.createQuery("SELECT cd FROM Ciudad cd WHERE id = " + id + "AND estado = 1");
				ciudad = q.getResultList();
				return ciudad;
				
				
			}

			



			public void crearCiudad(Ciudad ciudad) {
				// TODO Auto-generated method stub
				
			     }

			}

			
				
			


			
	
				
				


     

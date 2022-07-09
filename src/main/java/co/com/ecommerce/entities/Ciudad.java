package co.com.ecommerce.entities;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the ciudad database table.
 * 
 */
@Entity
@Table(name="\"Ciudad\"", schema= "ecommerce")
@NamedQuery(name="Ciudad.findAll", query="SELECT c FROM Ciudad c")
public class Ciudad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String ciudades;
	
	
	//bi-directional many-to-one association to Departamento
    @ManyToOne
	@JoinColumn(name="\"idDepartamento\"")
	private boolean idDepartamento;
    
    //bi-directional many-to-one association to Departamento
   
  

	public Ciudad() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCiudades() {
		return this.ciudades;
	}

	public void setCiudades(String ciudades) {
		this.ciudades = ciudades;
	}

	public boolean getIdDepartamento() {
		return this.idDepartamento;
	}

	public void setIdDepartamento(boolean idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public void setIdDepartamento(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Ciudad [id=" + id + ", ciudades=" + ciudades + ", idDepartamento=" + idDepartamento + "]";
	}

	public int get() {
		// TODO Auto-generated method stub
		return 0;
	}
  
}
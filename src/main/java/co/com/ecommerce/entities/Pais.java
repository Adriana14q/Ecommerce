package co.com.ecommerce.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pais database table.
 * 
 */
@Entity
@Table(name="\"pais\"", schema= "ecommerce")
@NamedQuery(name="Pais.findAll", query="SELECT p FROM Pais p")
public class Pais implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String paises;

	public Pais() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPaises() {
		return this.paises;
	}

	public void setPaises(String paises) {
		this.paises = paises;
	}

}
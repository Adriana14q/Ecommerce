package co.com.ecommerce.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the metodopago database table.
 * 
 */
@Entity
@NamedQuery(name="Metodopago.findAll", query="SELECT m FROM Metodopago m")
public class Metodopago implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String metodos;

	public Metodopago() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMetodos() {
		return this.metodos;
	}

	public void setMetodos(String metodos) {
		this.metodos = metodos;
	}

}
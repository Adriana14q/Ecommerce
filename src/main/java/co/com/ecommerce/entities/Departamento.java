package co.com.ecommerce.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the departamento database table.
 * 
 */
@Entity
@Table(name="\"Departamento\"", schema= "ecommerce")
@NamedQuery(name="Departamento.findAll", query="SELECT d FROM Departamento d")
public class Departamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String departamentos;

	private Integer idpais;

	public Departamento() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartamentos() {
		return this.departamentos;
	}

	public void setDepartamentos(String departamentos) {
		this.departamentos = departamentos;
	}

	public Integer getIdpais() {
		return this.idpais;
	}

	public void setIdpais(Integer idpais) {
		this.idpais = idpais;
	}

}
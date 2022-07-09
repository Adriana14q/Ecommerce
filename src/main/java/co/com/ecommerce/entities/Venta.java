package co.com.ecommerce.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ventas database table.
 * 
 */
@Entity
@Table(name="\"ventas\"", schema= "ecommerce")
@NamedQuery(name="Venta.findAll", query="SELECT v FROM Venta v")
public class Venta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String correoenvio;

	private String direccionenvio;

	private Integer estadoventa;

	@Temporal(TemporalType.DATE)
	private Date fechaventa;

	private Integer idciudad;

	private Integer idmetodopago;

	private Integer idusuario;

	public Venta() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCorreoenvio() {
		return this.correoenvio;
	}

	public void setCorreoenvio(String correoenvio) {
		this.correoenvio = correoenvio;
	}

	public String getDireccionenvio() {
		return this.direccionenvio;
	}

	public void setDireccionenvio(String direccionenvio) {
		this.direccionenvio = direccionenvio;
	}

	public Integer getEstadoventa() {
		return this.estadoventa;
	}

	public void setEstadoventa(Integer estadoventa) {
		this.estadoventa = estadoventa;
	}

	public Date getFechaventa() {
		return this.fechaventa;
	}

	public void setFechaventa(Date fechaventa) {
		this.fechaventa = fechaventa;
	}

	public Integer getIdciudad() {
		return this.idciudad;
	}

	public void setIdciudad(Integer idciudad) {
		this.idciudad = idciudad;
	}

	public Integer getIdmetodopago() {
		return this.idmetodopago;
	}

	public void setIdmetodopago(Integer idmetodopago) {
		this.idmetodopago = idmetodopago;
	}

	public Integer getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

}
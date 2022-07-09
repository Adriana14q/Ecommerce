package co.com.ecommerce.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the producto database table.
 * 
 */
@Entity
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Integer cantidadminima;

	private Integer cantidadunidades;

	private String caracteristicas;

	private BigDecimal descuento;

	private Integer estado;

	@Temporal(TemporalType.DATE)
	private Date fechacreacion;

	private Integer idadministrador;

	private Integer idcategoria;

	private Integer idmarca;

	private String imagen;

	private BigDecimal iva;

	private String nombre;

	private Integer unidadesvendidas;

	private BigDecimal valor;

	public Producto() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidadminima() {
		return this.cantidadminima;
	}

	public void setCantidadminima(Integer cantidadminima) {
		this.cantidadminima = cantidadminima;
	}

	public Integer getCantidadunidades() {
		return this.cantidadunidades;
	}

	public void setCantidadunidades(Integer cantidadunidades) {
		this.cantidadunidades = cantidadunidades;
	}

	public String getCaracteristicas() {
		return this.caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public BigDecimal getDescuento() {
		return this.descuento;
	}

	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}

	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Date getFechacreacion() {
		return this.fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Integer getIdadministrador() {
		return this.idadministrador;
	}

	public void setIdadministrador(Integer idadministrador) {
		this.idadministrador = idadministrador;
	}

	public Integer getIdcategoria() {
		return this.idcategoria;
	}

	public void setIdcategoria(Integer idcategoria) {
		this.idcategoria = idcategoria;
	}

	public Integer getIdmarca() {
		return this.idmarca;
	}

	public void setIdmarca(Integer idmarca) {
		this.idmarca = idmarca;
	}

	public String getImagen() {
		return this.imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public BigDecimal getIva() {
		return this.iva;
	}

	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getUnidadesvendidas() {
		return this.unidadesvendidas;
	}

	public void setUnidadesvendidas(Integer unidadesvendidas) {
		this.unidadesvendidas = unidadesvendidas;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
package com.generation.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//tabla relacional compraventa
@Entity
@Table(name = "autos_ventas")
public class AutosVentas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer cantidad;
	private Float subtotal;
	private Date fecha;

	/** ManyToMany = 2 ManyToOne */
	// ManyToOne auto
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "auto_id")
	private Auto auto;

	// ManyToOne CompraVenta
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "compra_venta_id")
	private CompraVenta compraVenta;
	
	public AutosVentas() {		
	}

	public AutosVentas(Integer cantidad, Float subtotal, Date fecha, Auto auto, CompraVenta compraVenta) {
		super();
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.fecha = fecha;
		this.auto = auto;
		this.compraVenta = compraVenta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Float subtotal) {
		this.subtotal = subtotal;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public CompraVenta getCompraVenta() {
		return compraVenta;
	}

	public void setCompraVenta(CompraVenta compraVenta) {
		this.compraVenta = compraVenta;
	}

}

package com.generation.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "autos")
public class Auto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String marca;
	private String modelo;
	private String color;
	private Integer anio;
	private Integer velocidad;
	private Float valor;

	@Column(updatable = false) // permite no actualizar desde el sistema
	private Date createdAt;
	private Date updatedAt;

	// ManyToMany AutosVentas
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "autos_ventas", // nombre de la tabla relacional
			joinColumns = @JoinColumn(name = "auto_id"), // desde la tabla actual
			inverseJoinColumns = @JoinColumn(name = "compra_venta_id"))
	private List<CompraVenta> compraVentas;

	public Auto() {
		super();
	}

	public Auto(String marca, String modelo, String color, Integer anio, Integer velocidad, Float valor,
			List<CompraVenta> compraVentas) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.anio = anio;
		this.velocidad = velocidad;
		this.valor = valor;
		this.compraVentas = compraVentas;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public Integer getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public List<CompraVenta> getCompraVentas() {
		return compraVentas;
	}

	public void setCompraVentas(List<CompraVenta> compraVentas) {
		this.compraVentas = compraVentas;
	}

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

}

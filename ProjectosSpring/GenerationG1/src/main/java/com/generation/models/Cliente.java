package com.generation.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private String email;

	// OneToMany
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY) // cascade integridad del
	private List<CompraVenta> compraVentas;

	@Column(updatable = false) // permite no actualizar desde el sistema
	private Date createdAt;
	private Date updatedAt;

	public Cliente() {
		super();
	}

	public Cliente(String nombre, String apellido, String email, List<CompraVenta> compraVentas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.compraVentas = compraVentas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

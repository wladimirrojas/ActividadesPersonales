package com.generation.f220531;

import java.util.List;
import java.math.*;


public class Cliente {
	
	private String rut;
	private Integer id;
	private List<Integer> nrosVenta;
	private String nombre;
	private String apellido;
	private String correo;
	
	
	public Cliente(String rut, Integer id, List<Integer> nrosVenta, String nombre, String apellido, String correo) {
		super();
		this.rut = rut;
		this.id = id;
		this.nrosVenta = nrosVenta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
	}


	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public List<Integer> getNrosVenta() {
		return nrosVenta;
	}


	public void setNrosVenta(List<Integer> nrosVenta) {
		this.nrosVenta = nrosVenta;
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


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}
	

}

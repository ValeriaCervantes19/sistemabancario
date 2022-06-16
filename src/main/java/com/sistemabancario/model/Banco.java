package com.sistemabancario.model;
import java.util.Set;
import java.util.HashSet;

public class Banco {
	private String nombre;
	private String direccion;
	private Integer idBanco;
	private Set<Cliente> clientes = new HashSet<Cliente>();
	
	public void addCliente(Cliente c) {
		clientes.add(c);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(Integer idBanco) {
		this.idBanco = idBanco;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}
	
}

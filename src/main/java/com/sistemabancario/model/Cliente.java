package com.sistemabancario.model;
import java.util.List;
import java.util.ArrayList;

public class Cliente {
	private Integer idCliente;
	private String nombre;
	private List<Cuenta> cuentas = new ArrayList<Cuenta>();
	
	public void agregarCuenta(Cuenta c) {
		cuentas.add(c);
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

}

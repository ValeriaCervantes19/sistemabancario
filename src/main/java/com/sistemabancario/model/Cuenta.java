package com.sistemabancario.model;

public class Cuenta {
	private String numCuenta;
	private Float monto;
	
	public Cuenta() {}
	public Cuenta(String numCuenta, Float monto) {
		this.numCuenta=numCuenta;
		this.monto=monto;
	}
	
	public void setNumCuenta(String numCuenta) {
		this.numCuenta=numCuenta;
	}
	
	public String getNumCuenta() {
		return numCuenta;
	}

	public Float getMonto() {
		return monto;
	}

	public void setMonto(Float monto) {
		this.monto = monto;
	}
	
}

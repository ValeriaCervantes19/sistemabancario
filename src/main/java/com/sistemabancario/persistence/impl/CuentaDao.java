package com.sistemabancario.persistence.impl;

import java.util.List;
import java.util.ArrayList;
import com.sistemabancario.persistence.GenericDao;
import com.sistemabancario.model.Cuenta;

public class CuentaDao implements GenericDao{

	@Override
	public List<Cuenta> findAll() {
		List<Cuenta> cuentas = new ArrayList<Cuenta>();
		Cuenta cuenta1 = new Cuenta("123A",500.50f);
		Cuenta cuenta2 = new Cuenta("123B",800f);
		cuentas.add(cuenta1);
		cuentas.add(cuenta2);
		return cuentas;
	}
	
	@Override
	public Boolean update(Object entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean create(Object entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(Object entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

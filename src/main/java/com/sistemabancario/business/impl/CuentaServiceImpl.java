package com.sistemabancario.business.impl;

import java.util.List;

import com.sistemabancario.business.CuentaService;
import com.sistemabancario.model.Cuenta;
import com.sistemabancario.persistence.impl.CuentaDao;

public class CuentaServiceImpl implements CuentaService{

	@Override
	public List<Cuenta> queryAllBankAcounts() {
		CuentaDao cuentaDao = new CuentaDao(); 
		return cuentaDao.findAll();
	}
}

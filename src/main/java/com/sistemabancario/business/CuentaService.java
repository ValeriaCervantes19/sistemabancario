package com.sistemabancario.business;
import com.sistemabancario.model.Cuenta;
import java.util.List;

public interface CuentaService {
	public List<Cuenta> queryAllBankAcounts();
}

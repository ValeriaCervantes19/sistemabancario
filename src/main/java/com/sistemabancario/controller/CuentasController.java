package com.sistemabancario.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sistemabancario.business.CuentaService;
import com.sistemabancario.business.impl.CuentaServiceImpl;
import com.sistemabancario.model.Cuenta;

/**
 * Servlet implementation class CuentasController
 */
@WebServlet("/CuentasController")
public class CuentasController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CuentasController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CuentaService cuentaService = new CuentaServiceImpl(); 
		for(Cuenta objectCuenta:cuentaService.queryAllBankAcounts()) {
			System.out.println("Número de cuenta: "+objectCuenta.getNumCuenta());
			System.out.println("Monto: "+objectCuenta.getMonto());
		}
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

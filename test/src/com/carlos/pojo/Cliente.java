package com.carlos.pojo;

public class Cliente {

	private int idCliente;
	private String nombreCliente;
	private String emailCliente;
	private int edadCliente;

	public Cliente() {
		super();
	}

	public Cliente(String nombreCliente, String emailCliente, int edadCliente) {
		super();
		this.nombreCliente = nombreCliente;
		this.emailCliente = emailCliente;
		this.edadCliente = edadCliente;
	}

	public Cliente(int idCliente, String nombreCliente, String emailCliente, int edadCliente) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.emailCliente = emailCliente;
		this.edadCliente = edadCliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public int getEdadCliente() {
		return edadCliente;
	}

	public void setEdadCliente(int edadCliente) {
		this.edadCliente = edadCliente;
	}
}

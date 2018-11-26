package com.gfe.quest._model;

public class Centro {

	private String idCentro;
	
	private String nombre;
	
	private String direccion;
	
	private String telefono;
	
	private String email;
	
	private String web;
	
	private String responsable;

		
	@Override
	public String toString() {
		return "Centro [idCentro=" + idCentro + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", email=" + email + ", web=" + web + ", responsable=" + responsable + "]";
	}

	public Centro() {
	}

	public String getIdCentro() {
		return idCentro;
	}

	public void setIdCentro(String idCentro) {
		this.idCentro = idCentro;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	
}

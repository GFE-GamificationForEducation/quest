package com.gfe.quest._model;

import java.util.Arrays;

public class Carta implements CartaI {

	protected String idCarta;
	protected String nombre;
	protected String descripcion;
	protected int nivel;
	protected int precio;
	protected byte[] imageBytes;
	
	

	@Override
	public String toString() {
		return "Carta [idCarta=" + idCarta + ", nombre=" + nombre + ", descripcion=" + descripcion + ", nivel=" + nivel
				+ ", precio=" + precio + ", imageBytes=" + Arrays.toString(imageBytes) + "]";
	}

	public Carta() {
	
	}

	public String getIdCarta() {
		return idCarta;
	}

	public void setIdCarta(String idCarta) {
		this.idCarta = idCarta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public byte[] getImageBytes() {
		return imageBytes;
	}

	public void setImageBytes(byte[] imageBytes) {
		this.imageBytes = imageBytes;
	}
		
}

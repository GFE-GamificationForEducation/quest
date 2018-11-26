package com.gfe.quest._model;

public class CartaMazo extends Carta {
	
	private String idCartaMazo;
	private String idJugador;
	private int estado;
	
	public CartaMazo() {
		super();
	}
	
	public CartaMazo(Carta carta) {
		this.setIdCarta(carta.getIdCarta());
		this.setNombre(carta.getNombre());
		this.setDescripcion(carta.getDescripcion());
		this.setNivel(carta.getNivel());
		this.setPrecio(carta.getPrecio());
		this.setImageBytes(carta.getImageBytes());
	}
	

	@Override
	public String toString() {
		return "CartaMazo [idCartaMazo=" + idCartaMazo + ", idJugador=" + idJugador + ", estado=" + estado + ", idCarta=" + this.getIdCarta() +"]";
	}

	public String getIdCartaMazo() {
		return idCartaMazo;
	}

	public void setIdCartaMazo(String idCartaMazo) {
		this.idCartaMazo = idCartaMazo;
	}

	public String getIdJugador() {
		return idJugador;
	}

	public void setIdJugador(String idJugador) {
		this.idJugador = idJugador;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
}

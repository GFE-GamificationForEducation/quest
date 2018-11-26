package com.gfe.quest._model;

import java.util.List;

public class Mazo {

	private String idJugador;
	private List<CartaMazo> cartas;

	@Override
	public String toString() {
		return "Mazo [idJugador=" + idJugador + ", cartas=" + cartas + "]";
	}

	public String getIdJugador() {
		return idJugador;
	}

	public void setIdJugador(String idJugador) {
		this.idJugador = idJugador;
	}

	public List<CartaMazo> getCartas() {
		return cartas;
	}

	public void setCartas(List<CartaMazo> cartas) {
		this.cartas = cartas;
	}
	
}

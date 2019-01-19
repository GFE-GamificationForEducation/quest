package com.gfe.quest.model;

import java.util.List;

public class Mazo {

	private Jugador jugador;
	private List<CartaModel> cartaModels;

	protected Mazo() {
	}
	
	public Mazo(Jugador jugador) {
		this.jugador=jugador;
	}
	
	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public List<CartaModel> getCartas() {
		return cartaModels;
	}

	public void setCartas(List<CartaModel> cartaModels) {
		this.cartaModels = cartaModels;
	}
	
	@Override
	public String toString() {
		return "Mazo [jugador=" + jugador.getIdJugador() + ", cartaModels=" + cartaModels + "]";
	}
}

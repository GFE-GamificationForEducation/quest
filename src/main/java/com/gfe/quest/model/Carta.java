package com.gfe.quest.model;

import java.math.BigDecimal;

public class Carta implements CartaI {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6327703718528069134L;
	
	private BigDecimal idCarta;
	private CartaModel cartaModel;
	private Jugador jugador;
	private Estado estado;
	
	public Carta() {
		super();
	}
	
	public Carta(CartaModel cartaModel) {
		this.cartaModel = cartaModel;
		this.estado = new Estado(Estado.Value.ESTADO_INACTIVO);
	}
	
	public BigDecimal getIdCarta() {
		return idCarta;
	}

	public void setIdCarta(BigDecimal idCarta) {
		this.idCarta = idCarta;
	}

	public void setCartaModel(CartaModel cartaModel) {
		this.cartaModel = cartaModel;
	}

	public CartaModel getCartaModel() {
		return cartaModel;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}

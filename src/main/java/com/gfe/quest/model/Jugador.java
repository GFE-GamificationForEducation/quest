package com.gfe.quest.model;

import java.math.BigDecimal;

public class Jugador {

	private BigDecimal idJugador;
	private String username;
	private Integer nivel;
	private Long experiencia;
	private BigDecimal credito;
	private byte[] photo;
	private Mazo mazo;
	
	public Jugador() {
		this.mazo = new Mazo(this);
	}

	public BigDecimal getIdJugador() {
		return idJugador;
	}

	public void setIdJugador(BigDecimal idJugador) {
		this.idJugador = idJugador;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getExperiencia() {
		return experiencia;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public void setExperiencia(Long experiencia) {
		this.experiencia = experiencia;
	}

	public BigDecimal getCredito() {
		return credito;
	}

	public void setCredito(BigDecimal credito) {
		this.credito = credito;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public Mazo getMazo() {
		return mazo;
	}

	public void setMazo(Mazo mazo) {
		this.mazo = mazo;
	}
}

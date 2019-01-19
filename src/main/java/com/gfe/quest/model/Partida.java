package com.gfe.quest.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Partida {

	private BigDecimal idPartida;
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private Director director;
	private List<Jugador> jugadores;
	
	public BigDecimal getIdPartida() {
		return idPartida;
	}
	
	public void setIdPartida(BigDecimal idPartida) {
		this.idPartida = idPartida;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public Director getDirector() {
		return director;
	}
	
	public void setDirector(Director director) {
		this.director = director;
	}
	
	public List<Jugador> getJugadores() {
		return jugadores;
	}
	
	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}	
}

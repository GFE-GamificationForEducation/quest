package com.gfe.quest._model;

import java.time.LocalDate;

public class Partida {

	private String idPartida;
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private int idDirector;
	private String Jugadores;
	
	@Override
	public String toString() {
		return "Partida [idPartida=" + idPartida + ", nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", idDirector=" + idDirector + ", Jugadores=" + Jugadores + "]";
	}
	
	public String getIdPartida() {
		return idPartida;
	}
	
	public void setIdPartida(String idPartida) {
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
	
	public int getIdDirector() {
		return idDirector;
	}
	
	public void setIdDirector(int idDirector) {
		this.idDirector = idDirector;
	}
	
	public String getJugadores() {
		return Jugadores;
	}
	
	public void setJugadores(String jugadores) {
		Jugadores = jugadores;
	}	
}

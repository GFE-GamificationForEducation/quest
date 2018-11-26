package com.gfe.quest._model;

public class Jugador {

	private String idJugador;
	private String username;
	private int nivel;
	private long experiencia;
	private int credito;
	private String nombre;
	private String apellidos;
	private String email;
	private byte[] photo;
	
	
	public Jugador() {
		
	}

	public String getIdJugador() {
		return idJugador;
	}

	public void setIdJugador(String idJugador) {
		this.idJugador = idJugador;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public long getExperiencia() {
		return experiencia;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public void setExperiencia(long experiencia) {
		this.experiencia = experiencia;
	}

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	
}

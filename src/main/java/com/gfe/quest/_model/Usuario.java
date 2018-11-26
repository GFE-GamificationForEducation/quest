/**
 * 
 */
package com.gfe.quest._model;

/**
 * Modelo para la representacion de usuarios
 * @author BICUGUAL
 */
public class Usuario {

	private int idUser;
	private String username;
	private String password;
	private String descripcion;
	
	public Usuario() {
		super();
	}
	
	
	public Usuario(int idUser, String username, String password, String descripcion) {
		super();
		this.idUser = idUser;
		this.username = username;
		this.password = password;
		this.descripcion = descripcion;
	}


	public int getIdUser() {
		return idUser;
	}


	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}

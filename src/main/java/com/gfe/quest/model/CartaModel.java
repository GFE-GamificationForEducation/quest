package com.gfe.quest.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CartaModel implements CartaI {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8563349936126672182L;
	
	@Id @GeneratedValue
	protected BigDecimal idCartaModel;
	protected String nombre;
	protected String descripcion;
	protected Integer nivel;
	protected BigDecimal precio;
	protected byte[] imageBytes;
	
	public CartaModel() {
	}
	
	public CartaModel (String nombre, int nivel, BigDecimal precio) {
		this.nombre = nombre; 
		this.nivel = nivel;
		this.precio = precio;
	}
}

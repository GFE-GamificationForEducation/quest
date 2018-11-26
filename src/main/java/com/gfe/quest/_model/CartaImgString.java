package com.gfe.quest._model;

import com.gfe.quest._utils.service.PhotoEncodeIBS;

public class CartaImgString extends CartaMazo {
	
	private String imageString;
	
	
	public CartaImgString() {
	}
	
	public CartaImgString(Carta carta, PhotoEncodeIBS encoder) {
		
		if(carta instanceof CartaMazo) {
			CartaMazo cartaMazo = (CartaMazo)carta;
			this.setIdCartaMazo(cartaMazo.getIdCartaMazo());
			this.setIdJugador(cartaMazo.getIdJugador());
			this.setEstado(cartaMazo.getEstado());
		}
		
		this.setIdCarta(carta.getIdCarta());
		this.setNombre(carta.getNombre());
		this.setDescripcion(carta.getDescripcion());
		this.setNivel(carta.getNivel());
		this.setPrecio(carta.getPrecio());
		this.setImageBytes(carta.getImageBytes());
		
		this.imageString = encoder.encodeToString(carta.getImageBytes());
	}

	public String getImageString() {
		return imageString;
	}

	public void setImageString(String imageString) {
		this.imageString = imageString;
	}

	
}

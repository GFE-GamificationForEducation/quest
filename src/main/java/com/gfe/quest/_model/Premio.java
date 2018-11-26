package com.gfe.quest._model;

public class Premio {

	private String idPremio;
	private String actividad;
	private int premioMtc;
	private long premioXp;
	
	@Override
	public String toString() {
		return "Premio [idPremio=" + idPremio + ", actividad=" + actividad + ", premioMtc=" + premioMtc + ", premioXp="
				+ premioXp + "]";
	}
	
	public Premio() {
		
	}

	public String getIdPremio() {
		return idPremio;
	}

	public void setIdPremio(String idPremio) {
		this.idPremio = idPremio;
	}

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	public int getPremioMtc() {
		return premioMtc;
	}

	public void setPremioMtc(int premioMtc) {
		this.premioMtc = premioMtc;
	}

	public long getPremioXp() {
		return premioXp;
	}

	public void setPremioXp(long premioXp) {
		this.premioXp = premioXp;
	}
	
}

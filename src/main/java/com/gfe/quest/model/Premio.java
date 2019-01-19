package com.gfe.quest.model;

import java.math.BigDecimal;

public class Premio {

	private BigDecimal idPremio;
	private String actividad;
	private Integer mtc;
	private Long xp;
	
	public Premio() {
	}

	public BigDecimal getIdPremio() {
		return idPremio;
	}

	public void setIdPremio(BigDecimal idPremio) {
		this.idPremio = idPremio;
	}

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	public Integer getMtc() {
		return mtc;
	}

	public void setMtc(Integer mtc) {
		this.mtc = mtc;
	}

	public long getXp() {
		return xp;
	}

	public void setXp(Long xp) {
		this.xp = xp;
	}
}

package com.gfe.quest.model;

import java.math.BigDecimal;
import java.util.List;

public class Director {
	
	private BigDecimal idDirector;
	private String name;
	private List<Partida> partidas;
	
	public BigDecimal getIdDirector() {
		return idDirector;
	}
	public void setIdDirector(BigDecimal idDirector) {
		this.idDirector = idDirector;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}
}

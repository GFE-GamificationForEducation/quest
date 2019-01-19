package com.gfe.quest.model;

public class Estado {

	public static enum Value {
		ESTADO_ACTIVO,
		ESTADO_INACTIVO;
	}
	
	private Value value;
	
	public Estado (Value value) {
		this.value = value;
	}
	
	public Value getValue() {
		return this.value;
	}
	
	public void setValue(Value value) {
		this.value = value;
	}
}

package com.gfe.quest.model._exceptions;

@SuppressWarnings("serial")
public class GenericJsonException extends GenericException{

	public GenericJsonException( String message, Throwable ex) {
		super(message, ex);
	}
	
	public GenericJsonException(Throwable ex) {
		super(ex);
	}
}

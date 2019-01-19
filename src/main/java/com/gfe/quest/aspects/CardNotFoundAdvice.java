package com.gfe.quest.aspects;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.gfe.quest.model._exceptions.GenericJsonException;

@ControllerAdvice
class CardNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(GenericJsonException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String cardNotFoundHandler(GenericJsonException ex) {
		return ex.getMessageForUser();
	}
}

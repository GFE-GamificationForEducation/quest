package com.gfe.quest._utils.service.impl;

import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gfe.quest._utils.Messages;
import com.gfe.quest._utils.service.PhotoEncodeIBS;
import com.gfe.quest.model._exceptions.GenericJsonException;


@Service
public class PhotoEncodeB64BS implements PhotoEncodeIBS{

	Encoder encoder = Base64.getEncoder();
	
	String prefix = "data:image/png;base64,";
	
	public List<String> supportedImgFormats;
	
	@Autowired
	Messages messages;
	
	public PhotoEncodeB64BS() {
	}

	public String encodeToString(byte[] imageBytes) {
		
		String imageString = (imageBytes == null) ? "data:," : prefix + encoder.encodeToString(imageBytes);
		
		return imageString;
	}	
	
	public String encodeToString(byte[] imageBytes, String extension) {
		if (supportedImgFormats.contains(extension)) {
			switch (extension) {
			case "jpg":
				prefix = "data:image/jpeg;base64,";
				break;
			case "jpeg":
				prefix = "data:image/jpeg;base64,";
				break;
			case "png":
			default:
			}
		} else {
				throw new GenericJsonException(messages.get("imagen.error.formato"), new Throwable());
		}
		
		String imageString = (imageBytes == null) ? "data:," : prefix + encoder.encodeToString(imageBytes);
		
		return imageString;
	}

	public Encoder getEncoder() {
		return encoder;
	}

	public void setEncoder(Encoder encoder) {
		this.encoder = encoder;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public List<String> getSupportedImgFormats() {
		return supportedImgFormats;
	}

	public void setSupportedImgFormats(List<String> supportedImgFormats) {
		this.supportedImgFormats = supportedImgFormats;
	}
	
	
}

package com.gfe.quest._utils.service;

public interface PhotoEncodeIBS {

	public String encodeToString(byte[] imageBytes);
	public String encodeToString(byte[] imageBytes, String extension);
	
}

package com.jwt.model;

public class MessageResponse {

	public String Error;

	public MessageResponse(String Error) {
		this.Error = Error;
	}

	public String getError() {
		return Error;
	}

	public void setError(String error) {
		Error = error;
	}

}

package com.avenuecode.bean;

import org.springframework.stereotype.Component;

@Component
public class FileStatus {

	private String status = "UNDEFINED";

	public void ok() {
		this.status = "Ok";
	}

	public void error() {
		this.status = "Error";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

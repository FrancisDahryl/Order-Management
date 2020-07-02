package com.ordermgt.exception;

public class OrderManagementException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4539708269582732297L;

	private String internalMessage;
	
	private String code;

	public String getInternalMessage() {
		return internalMessage;
	}

	public void setInternalMessage(String internalMessage) {
		this.internalMessage = internalMessage;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}

package com.agsft;


public class RequestProcessor {
	
	private RequestValidator requestValidator;

	
	public RequestProcessor(){
		System.out.println("Inside constructor of Request Processor");
	}
	
	public RequestValidator getRequestValidator() {
		System.out.println("Inside get request validator of REquest Processor");
		return requestValidator;
	}

	public void setRequestValidator(RequestValidator requestValidator) {
		this.requestValidator = requestValidator;
	}
	
	public void handleRequest(String requestId){
		requestValidator.validateRequest(requestId);
	}
	
}

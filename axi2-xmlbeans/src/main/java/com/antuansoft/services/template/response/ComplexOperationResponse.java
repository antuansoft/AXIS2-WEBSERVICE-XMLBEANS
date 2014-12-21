package com.antuansoft.services.template.response;

import java.util.List;

public class ComplexOperationResponse {
	
	String responseCode;
	List<String> result;
	String errorDescription;
	
	public ComplexOperationResponse(String responseCode, List<String> result,
			String errorDescription) {
		super();
		this.responseCode = responseCode;
		this.result = result;
		this.errorDescription = errorDescription;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public List<String> getResult() {
		return result;
	}

	public void setResult(List<String> result) {
		this.result = result;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
	
	
	

}

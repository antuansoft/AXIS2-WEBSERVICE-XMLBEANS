package com.antuansoft.services.template;

import java.util.List;

import com.antuansoft.services.template.exception.Axis2ServiceException;
import com.antuansoft.services.template.response.ComplexOperationResponse;

public abstract class Axis2ServiceExample {
	
	
	/**
	 * Simple operation of the web service with simple input params and simple output params
	 * This operation add the two numbers passed in the params
	 * @param number1
	 * @param number2
	 * @return
	 * @throws Axis2ServiceException
	 */
	public Integer simpleOperation(Integer number1, Integer number2) throws Axis2ServiceException {return null;}
	
	/**
	 * Complex operation of the web service with complex input and output params
	 * This operation returns a response code (OK  - ERROR), list with the paramList values and error description.
	 * @param paramList
	 * @param isError
	 * @return
	 * @throws Axis2ServiceException
	 */
	public ComplexOperationResponse complexOperation(List<String> paramList) throws Axis2ServiceException {return null;}

}

/**
 * Axis2ServiceExampleSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.0  Built on : May 17, 2011 (04:19:43 IST)
 */
package com.antuansoft.services.ws.skeleton;

import com.antuansoft.services.template.ComplexOperationResponseDocument;
import com.antuansoft.services.template.SimpleOperationResponseDocument;
import com.antuansoft.services.template.SimpleOperationResponseDocument.SimpleOperationResponse;

/**
 * Axis2ServiceExampleSkeleton java skeleton for the axisService
 */
public class Axis2ServiceExampleSkeleton implements
		Axis2ServiceExampleSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @param complexOperation0
	 * @return complexOperationResponse1
	 * @throws Axis2ServiceExampleAxis2ServiceException
	 */

	public com.antuansoft.services.template.ComplexOperationResponseDocument complexOperation(
			com.antuansoft.services.template.ComplexOperationDocument complexOperation0)
			throws Axis2ServiceExampleAxis2ServiceException {

		//Getting input params
		String[] data = complexOperation0.getComplexOperation().getParamListArray();
		
		//Process Data
		boolean isError=false;
		for (String datum : data){
			
			if (datum.contains("error")){
				isError = true;
				break;
			}
		}

		//Setting Response
		com.antuansoft.services.template.ComplexOperationResponseDocument responseDoc = ComplexOperationResponseDocument.Factory.newInstance();
		com.antuansoft.services.template.ComplexOperationResponseDocument.ComplexOperationResponse response = responseDoc.addNewComplexOperationResponse();
		
		if (isError){
						
			//setting ERROR
			com.antuansoft.services.template.response.xsd.ComplexOperationResponse responseError = com.antuansoft.services.template.response.xsd.ComplexOperationResponse.Factory.newInstance();
			responseError.setResponseCode("ERROR");
			responseError.setErrorDescription("Error detected");
			response.setReturn(responseError);
		}else{
			
			//Settig OK
			com.antuansoft.services.template.response.xsd.ComplexOperationResponse responseOK= com.antuansoft.services.template.response.xsd.ComplexOperationResponse.Factory.newInstance();
			responseOK.setResponseCode("OK");
			responseOK.setResultArray(data);
			response.setReturn(responseOK);
		}
		
		return responseDoc;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param simpleOperation2
	 * @return simpleOperationResponse3
	 * @throws Axis2ServiceExampleAxis2ServiceException
	 */

	public com.antuansoft.services.template.SimpleOperationResponseDocument simpleOperation(
			com.antuansoft.services.template.SimpleOperationDocument simpleOperation2)
			throws Axis2ServiceExampleAxis2ServiceException {

		//Get input params
		Integer number1 = simpleOperation2.getSimpleOperation().getNumber1();
		Integer number2 = simpleOperation2.getSimpleOperation().getNumber2();
		
		
		//Process Data
		Integer result = number1 + number2;
		
		
		//Set response.		
		SimpleOperationResponseDocument responseDoc = SimpleOperationResponseDocument.Factory.newInstance();
		SimpleOperationResponse response = responseDoc.addNewSimpleOperationResponse();
		response.setReturn(result);
		
				
		return responseDoc;
		
	}

}

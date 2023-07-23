/** @Copyright 2023, All Rights are reserved, Tesco Bank pvt ltd. We should not disclose the information outside
 *  otherwise terms and condition will apply
 */
package com.tesco.enquiry.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tesco.enquiry.exception.BusinessException;
import com.tesco.enquiry.exception.CreditLimitEnquiryRequestInvalidException;
import com.tesco.enquiry.exception.SystemException;
import com.tesco.enquiry.model.EnquiryResponse;
import com.tesco.enquiry.model.StatusBlock;

/**
 * @author Prajwal by 19-Jul-2023
 *
 */

@ControllerAdvice
public class CreditLimitEnquiryAdvice {
	
	@ResponseBody
	@ExceptionHandler(value = CreditLimitEnquiryRequestInvalidException.class)
	public ResponseEntity<EnquiryResponse> handleRequestInvalidException(CreditLimitEnquiryRequestInvalidException exception) {
		
		// TODO : Prepare the response object 
		EnquiryResponse enquiryResponse = buildErrorResponse(exception.getRespCode(), exception.getRespMsg());
		
		return new ResponseEntity<EnquiryResponse>(enquiryResponse, HttpStatus.BAD_REQUEST);
	}

	@ResponseBody
	@ExceptionHandler(value = BusinessException.class)
	public ResponseEntity<EnquiryResponse> handleDataError(BusinessException exception) {
		
		// TODO : Prepare the response object 
		EnquiryResponse enquiryResponse = buildErrorResponse(exception.getRespCode(), exception.getRespMsg());
		
		return new ResponseEntity<EnquiryResponse>(enquiryResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ResponseBody
	@ExceptionHandler(value = SystemException.class)
	public ResponseEntity<EnquiryResponse> handleSystemError(SystemException exception) {
		
		// TODO : Prepare the response object 
		EnquiryResponse enquiryResponse = buildErrorResponse(exception.getRespCode(), exception.getRespMsg());
		
		return new ResponseEntity<EnquiryResponse>(enquiryResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<EnquiryResponse> handleGenericError(Exception exception) {
		
		// TODO : Prepare the response object 
		EnquiryResponse enquiryResponse = buildErrorResponse("8888", "Unknown Error From Service");
		
		return new ResponseEntity<EnquiryResponse>(enquiryResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	/**
	 * @param exception
	 * @return
	 */
	private EnquiryResponse buildErrorResponse(String respCode, String respMsg) {
		EnquiryResponse enquiryResponse = new EnquiryResponse();
		
		StatusBlock statusBlock = new StatusBlock();
		
		statusBlock.setRespCode(respCode);
		statusBlock.setRespMsg(respMsg);
		
		enquiryResponse.setStatusBlock(statusBlock);
		return enquiryResponse;
	}
}

/** @Copyright 2023, All Rights are reserved, Tesco Bank pvt ltd. We should not disclose the information outside
 *  otherwise terms and condition will apply
 */
package com.tesco.enquiry.exception;

import lombok.Getter;
import lombok.ToString;

/**
 * @author Prajwal by 20-Jul-2023
 *
 */
@Getter
@ToString
public class CreditLimitEnquiryRequestInvalidException extends Exception {

	private String respCode;
	private String respMsg;
	
	public CreditLimitEnquiryRequestInvalidException(String respCode, String respMsg) {
		this.respCode = respCode;
		this.respMsg = respMsg;
	}
	
}

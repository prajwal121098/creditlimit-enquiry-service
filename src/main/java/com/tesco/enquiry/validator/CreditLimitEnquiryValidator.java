/** @Copyright 2023, All Rights are reserved, Tesco Bank pvt ltd. We should not disclose the information outside
 *  otherwise terms and condition will apply
 */
package com.tesco.enquiry.validator;

import org.springframework.stereotype.Component;

import com.tesco.enquiry.model.EnquiryRequest;


/**
 * @author Prajwal by 19-Jul-2023
 *
 */

@Component
public class CreditLimitEnquiryValidator {
	
	public void validateRequest(EnquiryRequest enquiryRequest) {
		// TODO : Validate the request, if the request is valid nothing return
		// else return user defined exception
	}

}

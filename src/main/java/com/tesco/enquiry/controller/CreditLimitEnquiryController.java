/** @Copyright 2023, All Rights are reserved, Tesco Bank pvt ltd. We should not disclose the information outside
 *  otherwise terms and condition will apply
 */
package com.tesco.enquiry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tesco.enquiry.exception.CreditLimitEnquiryRequestInvalidException;
import com.tesco.enquiry.model.EnquiryRequest;
import com.tesco.enquiry.model.EnquiryResponse;
import com.tesco.enquiry.service.ICreditLimitEnquiryService;
import com.tesco.enquiry.validator.CreditLimitEnquiryValidator;

/**
 * @author Prajwal by 19-Jul-2023
 *
 */

@RestController
@RequestMapping("/v1")
public class CreditLimitEnquiryController {

	@Autowired
	CreditLimitEnquiryValidator creditLimitEnquiryValidator;

	@Autowired
	ICreditLimitEnquiryService creditLimitEnquiryService;

	@GetMapping("/enquiry/{promocode}")
	@ResponseBody
	public EnquiryResponse enquiry(@PathVariable("promocode") String promocode,
										@RequestHeader("client_Id") String clientId,
										@RequestHeader("channel_Id") String channelId,
										@RequestHeader("message_ts") String messageTs,
										@RequestHeader("request_Id") String requestId) throws CreditLimitEnquiryRequestInvalidException {

		// 1. Get the request from consumer or client
		EnquiryRequest enquiryRequest = new EnquiryRequest();

		// 2. Validate the request
		creditLimitEnquiryValidator.validateRequest(enquiryRequest);

		// 3. Prepare the request from service layer

		// 4. Call the service layer and get the response
		EnquiryResponse enquiryResponse =  creditLimitEnquiryService.enquiry(enquiryRequest);

		// 5. Send reponse to Client in JSON

		return enquiryResponse;
	}

}

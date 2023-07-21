/** @Copyright 2023, All Rights are reserved, Tesco Bank pvt ltd. We should not disclose the information outside
 *  otherwise terms and condition will apply
 */
package com.tesco.enquiry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tesco.enquiry.intg.dao.ICreditLimitEnquiryDao;
import com.tesco.enquiry.model.EnquiryDaoRequest;
import com.tesco.enquiry.model.EnquiryDaoResponse;
import com.tesco.enquiry.model.EnquiryRequest;
import com.tesco.enquiry.model.EnquiryResponse;

/**
 * @author Prajwal by 20-Jul-2023
 *
 */

@Component
public class CreditLimitEnquiryServiceImpl implements ICreditLimitEnquiryService {

	@Autowired
	ICreditLimitEnquiryDao creditLimitEnquiryDao;

	@Override
	public EnquiryResponse enquiry(EnquiryRequest enquiryRequest) {

		// 1. Get the request from controller

		// 2. Prepare the request for integration layer
		EnquiryDaoRequest enquiryDaoRequest = new EnquiryDaoRequest();

		// 3. Call the integration layer and get the response
		EnquiryDaoResponse enquiryDaoResponse = creditLimitEnquiryDao.enquiry(enquiryDaoRequest);

		// 4. Prepare the service response and send to Controller
		EnquiryResponse enquiryResponse = new EnquiryResponse();
		enquiryResponse.setAvailableAmount(enquiryDaoResponse.getAvailableAmount());
		enquiryResponse.setCardNum(enquiryDaoResponse.getCardNum());
		enquiryResponse.setCvv(enquiryDaoResponse.getCvv());
		enquiryResponse.setIncreaseAmount(enquiryDaoResponse.getIncreaseAmount());
		enquiryResponse.setIncreasePercentage(enquiryDaoResponse.getIncreasePercentage());


		return enquiryResponse;
	}

}

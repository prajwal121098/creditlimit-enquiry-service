/** @Copyright 2023, All Rights are reserved, Tesco Bank pvt ltd. We should not disclose the information outside
 *  otherwise terms and condition will apply
 */
package com.tesco.enquiry.intg.dao;

import org.springframework.stereotype.Component;

import com.tesco.enquiry.model.EnquiryDaoRequest;
import com.tesco.enquiry.model.EnquiryDaoResponse;

/**
 * @author Prajwal by 20-Jul-2023
 *
 */
@Component
public class CreditLimitEnquiryDaoImpl implements ICreditLimitEnquiryDao {

	@Override
	public EnquiryDaoResponse enquiry(EnquiryDaoRequest enquiryDaoRequest) {

		// 1. Get the request from service layer

		// 2. Prepare the request from database

		// 3. Call the database and get the response
		EnquiryDaoResponse enquiryDaoResponse = new EnquiryDaoResponse();
		enquiryDaoResponse.setCardNum("5432123456789");
		enquiryDaoResponse.setCvv("456");
		enquiryDaoResponse.setAvailableAmount(100000);
		enquiryDaoResponse.setIncreaseAmount(50000);
		enquiryDaoResponse.setIncreasePercentage(0.5f);

		return enquiryDaoResponse;
	}

}

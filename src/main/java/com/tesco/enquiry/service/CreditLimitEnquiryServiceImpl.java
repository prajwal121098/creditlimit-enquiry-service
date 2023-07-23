/** @Copyright 2023, All Rights are reserved, Tesco Bank pvt ltd. We should not disclose the information outside
 *  otherwise terms and condition will apply
 */
package com.tesco.enquiry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tesco.enquiry.exception.BusinessException;
import com.tesco.enquiry.exception.SystemException;
import com.tesco.enquiry.intg.dao.ICreditLimitEnquiryDao;
import com.tesco.enquiry.model.CustomerInfo;
import com.tesco.enquiry.model.EnquiryDaoRequest;
import com.tesco.enquiry.model.EnquiryDaoResponse;
import com.tesco.enquiry.model.EnquiryRequest;
import com.tesco.enquiry.model.EnquiryResponse;
import com.tesco.enquiry.model.StatusBlock;

/**
 * @author Prajwal by 20-Jul-2023
 *
 */

@Component
public class CreditLimitEnquiryServiceImpl implements ICreditLimitEnquiryService {

	@Autowired
	ICreditLimitEnquiryDao creditLimitEnquiryDao;

	@Override
	public EnquiryResponse enquiry(EnquiryRequest enquiryRequest) throws BusinessException, SystemException {

		// 1. Get the request from controller

		// 2. Prepare the request for integration layer
		EnquiryDaoRequest enquiryDaoRequest = new EnquiryDaoRequest();

		// 3. Call the integration layer and get the response
		EnquiryDaoResponse enquiryDaoResponse = creditLimitEnquiryDao.enquiry(enquiryDaoRequest);

		// 4. Prepare the service response and send to Controller
		EnquiryResponse enquiryResponse = new EnquiryResponse();
		
		StatusBlock statusBlock = new StatusBlock();
		statusBlock.setRespCode(enquiryDaoResponse.getRespCode());
		statusBlock.setRespMsg(enquiryDaoResponse.getRespMsg());
		
		CustomerInfo customerInfo = new CustomerInfo();
		customerInfo.setAvailableAmount(enquiryDaoResponse.getAvailableAmount());
		customerInfo.setCardNum(enquiryDaoResponse.getCardNum());
		customerInfo.setCvv(enquiryDaoResponse.getCvv());
		customerInfo.setIncreaseAmount(enquiryDaoResponse.getIncreaseAmount());
		customerInfo.setIncreasePercentage(enquiryDaoResponse.getIncreasePercentage());

		enquiryResponse.setStatusBlock(statusBlock);
		enquiryResponse.setCustomerInfo(customerInfo);
		
		return enquiryResponse;
	}

}

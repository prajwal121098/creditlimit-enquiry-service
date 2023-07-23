/** @Copyright 2023, All Rights are reserved, Tesco Bank pvt ltd. We should not disclose the information outside
 *  otherwise terms and condition will apply
 */
package com.tesco.enquiry.intg.dao;

import org.springframework.stereotype.Component;

import com.tesco.enquiry.exception.BusinessException;
import com.tesco.enquiry.exception.SystemException;
import com.tesco.enquiry.model.EnquiryDaoRequest;
import com.tesco.enquiry.model.EnquiryDaoResponse;

/**
 * @author Prajwal by 20-Jul-2023
 *
 */
@Component
public class CreditLimitEnquiryDaoImpl implements ICreditLimitEnquiryDao {

	@Override
	public EnquiryDaoResponse enquiry(EnquiryDaoRequest enquiryDaoRequest) throws BusinessException, SystemException {

		EnquiryDaoResponse enquiryDaoResponse;
		try {
			// 1. Get the request from service layer

			// 2. Prepare the request from database
			
			
			
			// 3. Call the database and get the response
			String dbRespCode = "0";
			String dbRespMsg = "success";
			
			enquiryDaoResponse = new EnquiryDaoResponse();
			
			if ( "0".equals(dbRespMsg) ) {
			
				
				enquiryDaoResponse.setRespCode("0");
				enquiryDaoResponse.setRespMsg("success");
				enquiryDaoResponse.setCardNum("5432123456789");
				enquiryDaoResponse.setCvv("456");
				enquiryDaoResponse.setAvailableAmount(100000);
				enquiryDaoResponse.setIncreaseAmount(50000);
				enquiryDaoResponse.setIncreasePercentage(0.5f);
			
			} else if ( "100".equals(dbRespCode) || "101".equals(dbRespCode) || "102".equals(dbRespCode) ) {
				
				throw new BusinessException(dbRespCode, dbRespMsg);
				
			} else {

				throw new SystemException(dbRespCode, dbRespMsg);			
			}
		} catch (BusinessException be) {
			throw be;
		} catch (SystemException se) {
			throw se;
		}
		
		

		return enquiryDaoResponse;
	}

}

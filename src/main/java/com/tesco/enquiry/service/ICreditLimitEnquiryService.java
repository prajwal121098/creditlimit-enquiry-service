/** @Copyright 2023, All Rights are reserved, Tesco Bank pvt ltd. We should not disclose the information outside
 *  otherwise terms and condition will apply
 */
package com.tesco.enquiry.service;

import com.tesco.enquiry.model.EnquiryRequest;
import com.tesco.enquiry.model.EnquiryResponse;

/**
 * @author Prajwal by 20-Jul-2023
 *
 */
public interface ICreditLimitEnquiryService {
	
	public EnquiryResponse enquiry(EnquiryRequest enquiryRequest);
}

/** @Copyright 2023, All Rights are reserved, Tesco Bank pvt ltd. We should not disclose the information outside
 *  otherwise terms and condition will apply
 */
package com.tesco.enquiry.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

/**
 * @author Prajwal by 20-Jul-2023
 *
 */
@Data
@JsonInclude(value = Include.NON_DEFAULT)
public class EnquiryResponse {

	private StatusBlock statusBlock;
	
	private CustomerInfo customerInfo;
	


}

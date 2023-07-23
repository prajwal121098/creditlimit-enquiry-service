/** @Copyright 2023, All Rights are reserved, Tesco Bank pvt ltd. We should not disclose the information outside
 *  otherwise terms and condition will apply
 */
package com.tesco.enquiry.model;

import lombok.Data;

/**
 * @author Prajwal by 20-Jul-2023
 *
 */
@Data
public class EnquiryRequest {

	private String promocode;
	private String clientId;
	private String channelId;
	private String messageTs;
	private String requestId;
	
}

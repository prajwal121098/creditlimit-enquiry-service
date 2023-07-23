/** @Copyright 2023, All Rights are reserved, Tesco Bank pvt ltd. We should not disclose the information outside
 *  otherwise terms and condition will apply
 */
package com.tesco.enquiry.model;

import lombok.Data;

/**
 * @author Prajwal by 23-Jul-2023
 *
 */

@Data
public class CustomerInfo {

	private String cardNum;
	private String cvv;
	private long availableAmount;
	private long increaseAmount;
	private float increasePercentage;

}

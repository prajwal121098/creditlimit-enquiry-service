/** @Copyright 2023, All Rights are reserved, Tesco Bank pvt ltd. We should not disclose the information outside
 *  otherwise terms and condition will apply
 */
package com.tesco.enquiry.model;

/**
 * @author Prajwal by 20-Jul-2023
 *
 */
public class EnquiryRequest {
	
	private String promocode;
	private String clientId;
	private String channelId;
	private String messageTs;
	private String requestId;
	/**
	 * @return the promocode
	 */
	public String getPromocode() {
		return promocode;
	}
	/**
	 * @param promocode the promocode to set
	 */
	public void setPromocode(String promocode) {
		this.promocode = promocode;
	}
	/**
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}
	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	/**
	 * @return the channelId
	 */
	public String getChannelId() {
		return channelId;
	}
	/**
	 * @param channelId the channelId to set
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	/**
	 * @return the messageTs
	 */
	public String getMessageTs() {
		return messageTs;
	}
	/**
	 * @param messageTs the messageTs to set
	 */
	public void setMessageTs(String messageTs) {
		this.messageTs = messageTs;
	}
	/**
	 * @return the requestId
	 */
	public String getRequestId() {
		return requestId;
	}
	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
}

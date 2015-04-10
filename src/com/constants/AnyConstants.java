/**
 *  File: AnyConstants.java
 ********************************************************************************
 *  Date        Author                  Changes
 ********************************************************************************
 *  Apr 7, 2015    agupta			         Created
 ********************************************************************************
 * Copyright (c) 2002 Synapse Group, Inc.
 * 5 High Ridge Park, Stamford, Connecticut, 06905-1325, U.S.A.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Synapse Group, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the licence agreement you entered
 * into with Synapse Group, Inc.
 */
package com.constants;

/**
 * @author agupta
 *
 */
public enum AnyConstants {
	TIMESTAMP_FORMAT ("dd/MM/yyyy+HH:MM:SS"),
	BURN_POINT_TIMESTAMP_FORMAT ("dd/MMM/yyyy+HH:MM:SS"),	

	//ACTIONS
	PIN_REQUEST ("PIN_REQUEST"),
	REDEEM_POINTS ("REDEEM_POINTS"),
	REFUND_POINTS ("REFUND_POINTS"),

	//Constant for the Transaction status in the response.
	APPROVED ("APPROVED"),
	ERROR ("ERROR"),

	//Header, Redeem and Refund Constants
	TRANSACTION_CODE ("TRANSACTION_CODE"),
	CERTIFICATE_NUMBER ("CERTIFICATE_NUMBER"),
	REWARD_CODE ("REWARD_CODE"),
	REWARD_POINTS ("REWARD_POINTS"),
	STATUS ("STATUS"),
	SESSION ("SESSION"),
	ACCOUNT ("ACCOUNT"),
	ACTION ("ACTION"),	
	EXTERNAL_ID ("EXTERNAL_ID"),	
	INTERNAL_ID ("INTERNAL_ID"),	
	TIMESTAMP ("TIMESTAMP"),	
	TRANSACTION_STATUS ("TRANSACTION_STATUS"),	
	REASON_CODE ("REASON_CODE"),	
	REASON_DESCRIPTION ("REASON_DESCRIPTION"),	
	ERROR_DESC ("ERROR_DESC"),
	TYPE ("TYPE"),
	VALUE ("VALUE"),
	NUMBER ("NUMBER"),
	PIN ("PIN"),
	HHONORS ("HHONORS"),

	//Exception Message
	TIMED_OUT ("timed out"),

	//Internal Response Code defined for the MAPS4.21 release.
	SUCCESS_CODE ("SM000"),
	WS_TIMEOUT_ERROR_CODE ("SM200"),
	WS_CONSUMPTION_ERROR_CODE ("SM190"),
	MAPS_SYSTEM_ERROR ("SM210"),	
	
	// HILTON Transaction Processing Constant
	HILTON_TRANSACTION_PROCESSING_ERROR ("HILTON Transaction Processing Error"),
	HILTON_WS_CONNECTION_ERROR ("HILTON WS Connection Error"),
	HILTON_WS_CONSUMPTION_ERROR ("HILTON WS Consumption Error"),
	HILTON_XML_ERROR ("HILTON XML Error"),

	//Tag Elements
	TAG_XML_VERSION ("<?xml version=\"1.0\"?>"),
	TAG_START_HHONORS_HCOM ("<HHONORS-HCOM>"),
	TAG_END_HHONORS_HCOM ("</HHONORS-HCOM>"),
	TAG_START_TRANSACTION ("<TRANSACTION>"),
	TAG_END_TRANSACTION ("</TRANSACTION>"),
	
	//header tag elements
	TAG_START_EXTERNAL_ID ("<EXTERNAL_ID>"),
	TAG_END_EXTERNAL_ID ("</EXTERNAL_ID>"),
	TAG_START_TIMESTAMP ("<TIMESTAMP>"),
	TAG_END_TIMESTAMP ("</TIMESTAMP>"),
	TAG_START_ACTION ("<ACTION>"),
	TAG_END_ACTION ("</ACTION>"),
	
	//redeem tag element Stuff
	
	//refund tag element Stuff
	TAG_START_TRANSACTION_CODE ("<TRANSACTION_CODE>"),
	TAG_END_TRANSACTION_CODE ("</TRANSACTION_CODE>"),
	TAG_START_CERTIFICATE_NUMBER ("<CERTIFICATE_NUMBER>"),
	TAG_END_CERTIFICATE_NUMBER ("</CERTIFICATE_NUMBER>");
	
	public enum INNER {
		TAG_START_REWARD_CODE ("<REWARD_CODE>"),
		TAG_END_REWARD_CODE ("</REWARD_CODE>"),
		TAG_START_REWARD_POINTS ("<REWARD_POINTS>"),
		TAG_END_REWARD_POINTS ("</REWARD_POINTS>");
		
		private final String value;
		
		INNER(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
	}
	
	private final String sValue;
	
	/**
	 * 
	 */
	private AnyConstants(String sValue) {
		this.sValue = sValue;
	}
	
	public String getValue() {
		return sValue;
	}
	
	public String appender(String str) {
		return sValue.concat(str);
	}
	
	@Override
	public String toString() {
		return sValue;
	}
}

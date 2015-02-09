package com.velocity.models.authorize;
/**
 * This class holds the data for SecurePaymentAccountData
 * 
 * @author ranjitk
 * 
 */
public class SecurePaymentAccountData {

	/* Attribute for ScoreThreshold value exists or not. */
	private boolean nillable;

	private String value;

	public boolean isNillable() {
		return nillable;
	}

	public void setNillable(boolean nillable) {
		this.nillable = nillable;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}

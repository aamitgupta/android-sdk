package com.velocoity.models.authorizeAndCapture;

import com.velocity.models.authorize.PaymentAccountDataToken;

/**
 * @author ranjitk
 *
 */
public class TenderData {

	private String paymentAccountDataToken;
	
	private PaymentAccountDataToken paymentAccountDatawithoutToken;
	
	private String securePaymentAccountData;
	
	private SecurePaymentAccountData securePaymentAccountDataToken;
	
	private  EncryptionKeyId encryptionKeyIdToken;
	
	private SwipeStatus swipeStatusToken;
	
	private String  encryptionKeyId;
	
	private String swipeStatus;
	
	private String identificationInformation;
	//private EcommerceSecurityData ecommerceSecurityData;
	private CardData cardData;
	
	
	public SecurePaymentAccountData getSecurePaymentAccountDataToken() {
		
		 if(securePaymentAccountDataToken == null) {
			 
			 securePaymentAccountDataToken = new SecurePaymentAccountData();
		 }
		return securePaymentAccountDataToken;
	}

	public void setSecurePaymentAccountDataToken(
			SecurePaymentAccountData securePaymentAccountDataToken) {
		this.securePaymentAccountDataToken = securePaymentAccountDataToken;
	}

	public EncryptionKeyId getEncryptionKeyIdToken() {
		
		if(encryptionKeyIdToken == null){
			
			encryptionKeyIdToken = new EncryptionKeyId();
		}
		return encryptionKeyIdToken;
	}

	public void setEncryptionKeyIdToken(EncryptionKeyId encryptionKeyIdToken) {
		this.encryptionKeyIdToken = encryptionKeyIdToken;
	}

	public SwipeStatus getSwipeStatusToken() {
		
		  if(swipeStatusToken == null){
			  
			  swipeStatusToken = new SwipeStatus();
		  }
		return swipeStatusToken;
	}

	public void setSwipeStatusToken(SwipeStatus swipeStatusToken) {
		this.swipeStatusToken = swipeStatusToken;
	}

	public PaymentAccountDataToken getPaymentAccountDatawithoutToken() {
		 if(paymentAccountDatawithoutToken==null){
			 paymentAccountDatawithoutToken=new  PaymentAccountDataToken();
		 }
		return paymentAccountDatawithoutToken;
	}

	public void setPaymentAccountDatawithoutToken(
			PaymentAccountDataToken paymentAccountDatawithoutToken) {
		this.paymentAccountDatawithoutToken = paymentAccountDatawithoutToken;
	}

	public CardData getCardData() {
		if(cardData==null){
			cardData=new CardData();
			
		}
		return cardData;
	}

	public void setCardData(CardData cardData) {
		this.cardData = cardData;
	}

	public String getPaymentAccountDataToken() {
		return paymentAccountDataToken;
	}

	public void setPaymentAccountDataToken(String paymentAccountDataToken) {
		this.paymentAccountDataToken = paymentAccountDataToken;
	}

	public String getSecurePaymentAccountData() {
		return securePaymentAccountData;
	}

	public void setSecurePaymentAccountData(String securePaymentAccountData) {
		this.securePaymentAccountData = securePaymentAccountData;
	}

	public String getEncryptionKeyId() {
		return encryptionKeyId;
	}

	public void setEncryptionKeyId(String encryptionKeyId) {
		this.encryptionKeyId = encryptionKeyId;
	}

	public String getSwipeStatus() {
		return swipeStatus;
	}

	public void setSwipeStatus(String swipeStatus) {
		this.swipeStatus = swipeStatus;
	}

	public String getIdentificationInformation() {
		return identificationInformation;
	}

	public void setIdentificationInformation(String identificationInformation) {
		this.identificationInformation = identificationInformation;
	}

	

}

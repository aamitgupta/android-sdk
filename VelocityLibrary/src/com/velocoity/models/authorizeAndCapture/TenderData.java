package com.velocoity.models.authorizeAndCapture;

import com.velocity.models.authorize.PaymentAccountDataToken;

/**
 * @author ranjitk
 *
 */
public class TenderData {

	private String paymentAccountDataToken;
	private PaymentAccountDataToken paymentAccountDatawithoutToken;
	private SecurePaymentAccountData securePaymentAccountData;
	private EncryptionKeyId encryptionKeyId;
	private SwipeStatus swipeStatus;
	private EcommerceSecurityData ecommerceSecurityData;
	private CardData cardData;
	
   
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

	public SecurePaymentAccountData getSecurePaymentAccountData() {
		if(securePaymentAccountData==null){
			securePaymentAccountData=new SecurePaymentAccountData();	
		}
		return securePaymentAccountData;
	}

	public void setSecurePaymentAccountData(
			SecurePaymentAccountData securePaymentAccountData) {
		this.securePaymentAccountData = securePaymentAccountData;
	}

	public EncryptionKeyId getEncryptionKeyId() {
		if(encryptionKeyId==null){
			encryptionKeyId=new EncryptionKeyId();
		}
		return encryptionKeyId;
	}

	public void setEncryptionKeyId(EncryptionKeyId encryptionKeyId) {
		this.encryptionKeyId = encryptionKeyId;
	}

	public SwipeStatus getSwipeStatus() {
		if(swipeStatus==null){
			swipeStatus=new SwipeStatus();
		}
		return swipeStatus;
	}

	public void setSwipeStatus(SwipeStatus swipeStatus) {
		this.swipeStatus = swipeStatus;
	}

	public EcommerceSecurityData getEcommerceSecurityData() {
		if(ecommerceSecurityData==null){
			ecommerceSecurityData=new EcommerceSecurityData();
		}
		return ecommerceSecurityData;
	}

	public void setEcommerceSecurityData(
			EcommerceSecurityData ecommerceSecurityData) {
		this.ecommerceSecurityData = ecommerceSecurityData;
	}

}

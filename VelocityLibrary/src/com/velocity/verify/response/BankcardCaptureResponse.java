package com.velocity.verify.response;

/**
 * @author ranjitk
 * 
 */
public class BankcardCaptureResponse {

	private String status;

	private String statusCode;

	private String statusMessage;

	private String transactionId;

	private String originatorTransactionId;

	private String serviceTransactionId;

	private ServiceTransactionDateTime serviceTransactionDateTime;

	private String captureState;

	private String transactionState;

	private boolean acknowledged;

	private String prepaidCard;

	private String reference;
	
	private String cardType;
	
	private String approvalCode;
	
	private String batchId;
	
	private String industryType;
	
	private String cVResult;
	
	private String paymentAccountDataToken;
	
	private SaleTotals saleTotals;
	
	private NetTotals netTotals;

	public String getIndustryType() {
		return industryType;
	}

	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	public String getPaymentAccountDataToken() {
		return paymentAccountDataToken;
	}

	public void setPaymentAccountDataToken(String paymentAccountDataToken) {
		this.paymentAccountDataToken = paymentAccountDataToken;
	}

	public String getcVResult() {
		return cVResult;
	}

	public void setcVResult(String cVResult) {
		this.cVResult = cVResult;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getApprovalCode() {
		return approvalCode;
	}

	public void setApprovalCode(String approvalCode) {
		this.approvalCode = approvalCode;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getOriginatorTransactionId() {
		return originatorTransactionId;
	}

	public void setOriginatorTransactionId(String originatorTransactionId) {
		this.originatorTransactionId = originatorTransactionId;
	}

	public String getServiceTransactionId() {
		return serviceTransactionId;
	}

	public void setServiceTransactionId(String serviceTransactionId) {
		this.serviceTransactionId = serviceTransactionId;
	}

	public ServiceTransactionDateTime getServiceTransactionDateTime() {

		if (serviceTransactionDateTime == null) {
			serviceTransactionDateTime = new ServiceTransactionDateTime();
		}

		return serviceTransactionDateTime;
	}

	public void setServiceTransactionDateTime(
			ServiceTransactionDateTime serviceTransactionDateTime) {
		this.serviceTransactionDateTime = serviceTransactionDateTime;
	}

	public String getCaptureState() {
		return captureState;
	}

	public void setCaptureState(String captureState) {
		this.captureState = captureState;
	}

	public String getTransactionState() {
		return transactionState;
	}

	public void setTransactionState(String transactionState) {
		this.transactionState = transactionState;
	}

	public boolean isAcknowledged() {
		return acknowledged;
	}

	public void setAcknowledged(boolean acknowledged) {
		this.acknowledged = acknowledged;
	}

	public String getPrepaidCard() {
		return prepaidCard;
	}

	public void setPrepaidCard(String prepaidCard) {
		this.prepaidCard = prepaidCard;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getCardType() {
		return cardType;
	}

	public SaleTotals getSaleTotals() {

		if (saleTotals == null) {
			saleTotals = new SaleTotals();
		}
		return saleTotals;
	}

	public void setSaleTotals(SaleTotals saleTotals) {
		this.saleTotals = saleTotals;
	}

	public NetTotals getNetTotals() {

		if (netTotals == null) {
			netTotals = new NetTotals();
		}
		return netTotals;
	}

	public void setNetTotals(NetTotals netTotals) {
		this.netTotals = netTotals;
	}

}

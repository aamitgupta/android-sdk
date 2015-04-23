package com.velocity.models.authorize;

/**
 * This class holds the data for card data.
 * 
 * @author ranjitk
 * 
 */

public class CardData {

	private String cardType;

	private String pan;

	private String expiryDate;

	private Track1Data track1Data1;
	
	private String track1Data;
	
	private TrackData track2Data2;
	
	private String track2Data;
	
    private boolean isCardHolderName;
	
	private boolean isPanNumber;
	
    private boolean isExpiryDate;
	
	
	private String cVData;
	
	private String cardHolderName;
	

	public String getcVData() {
		return cVData;
	}

	public void setcVData(String cVData) {
		this.cVData = cVData;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	

	public Track1Data getTrack1Data1() {
		
		if(track1Data1 == null){
			
			track1Data1 = new Track1Data();
		}
		return track1Data1;
	}

	public void setTrack1Data1(Track1Data track1Data1) {
		this.track1Data1 = track1Data1;
	}

	public TrackData getTrack2Data2() {
		
		if(track2Data2 == null){
			
			track2Data2 = new TrackData();
		}
		return track2Data2;
	}

	public void setTrack2Data2(TrackData track2Data2) {
		this.track2Data2 = track2Data2;
	}

	public String getTrack2Data() {
		return track2Data;
	}

	public void setTrack2Data(String track2Data) {
		this.track2Data = track2Data;
	}

	public boolean isCardHolderName() {
		return isCardHolderName;
	}

	public void setCardHolderName(boolean isCardHolderName) {
		this.isCardHolderName = isCardHolderName;
	}

	public boolean isPanNumber() {
		return isPanNumber;
	}

	public void setPanNumber(boolean isPanNumber) {
		this.isPanNumber = isPanNumber;
	}

	public boolean isExpiryDate() {
		return isExpiryDate;
	}

	public void setExpiryDate(boolean isExpiryDate) {
		this.isExpiryDate = isExpiryDate;
	}

	public void setTrack1Data(String track1Data) {
		this.track1Data = track1Data;
	}

	public String getTrack1Data() {
		return track1Data;
	}
	
	
}

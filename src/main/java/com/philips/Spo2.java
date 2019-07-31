package com.philips;

public class Spo2 {
	
	String result;
	private double reading;
	private final double upperHealthyReading = 100;
	private final double upperAcceptableReading = 95;
	private final double lowerAcceptableReading = 90;
	//private final double upperUnsafeLevelReading = 90;
	private final double lowerUnsafeLevelReading = 70;
	
//	private int lowerNormalVal;
//	private int UpperNormalVal;
	
	public Spo2(double reading) { // constructor
		this.reading = reading;
		result = null;
	}
	
	// public double getReading() {
	// 	return this.reading;
	// }

	// public double getLowerNormalVal() {
	// 	return this.lowerAcceptableReading;
	// }

	// public double getUpperNormalVal() {
	// 	return this.upperAcceptableReading;
	// }
	
	public int Spo2Checker() {
		if(this.reading > upperHealthyReading)
		{
			result="Undetectable pulse Rate";
			return 0;
		}
		else if(this.reading > upperAcceptableReading && this.reading <= upperHealthyReading) {
			result = "Normal healthy individual spo2 level";
			return 1;
		}
		else if(this.reading > lowerAcceptableReading && this.reading <= upperAcceptableReading) {
			result = "SPO2 level clinically acceptable but patient may be smoker";
			return 2;
		}
		else if(this.reading >= lowerUnsafeLevelReading && this.reading <= lowerAcceptableReading) {
			result = "Unhealthy and unsafe SPO2 level indicates Hypoxemia, ";
			return 3;
		} 
		else {
			result="Device is not calibrated to measure spo2 lower than 70  Extreme lack of oxygen, ischemic diseases may occur ";
			return 4;
		}	
	}
	
//		if(this.reading < this.getLowerNormalVal() || this.reading > this.getUpperNormalVal())
//			return "Care Needed - Body Temperature is abnormal";
//		return "Normal";

	public void display() {
		System.out.println(result);
	}
}

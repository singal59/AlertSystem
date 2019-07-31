package com.philips;
public class Temperature {
	private double reading;
	private final double minFeverValue=93;
	private final double lowerNormalVal = 97;
	private final double upperNormalVal = 98.9;
	//private final double lowerAcceptableFeverReading = 99;
	private final double upperAcceptableFeverReading = 100.5;
	//private final double lowerConcernFeverReading = 100.6;
	private final double upperConcernFeverReading = 103.1;
	//private final double lowerHighFeverReading = 105.8;
	private final double maxFeverValue=108;

	String result;
	
	public Temperature(double reading) { // constructor
		this.reading = reading;
		result=null;
	}
	
	public double getReading() {
		return this.reading;
	}
	
	public double getLowerNormalVal() {
		return this.lowerNormalVal;
	}

	public double getUpperNormalVal() {
		return this.upperNormalVal;
	}
	
	public int temperatureChecker() {
		if(this.reading < minFeverValue) {
			result="Undetectable Temperature";
			return 0;
		}
		else if (this.reading < lowerNormalVal && this.reading>=minFeverValue) {
			result = "Unacceptably low temperature level";
			return 1;
		}
		else if(this.reading >= lowerNormalVal && this.reading <= upperNormalVal) {
			result = "Normal body temperature";
			return 2;
		}
		else if(this.reading > upperNormalVal && this.reading <= upperAcceptableFeverReading) {
			result = "Care needed - minor fever";
			return 3;
		}
		else if(this.reading > upperAcceptableFeverReading && this.reading <= upperConcernFeverReading) {
			result = "Extreme care needed - High Fever";
			return 4;
		}
		else if(this.reading > upperConcernFeverReading && this.reading <= maxFeverValue) {
			result = "Critical care needed - Very High Fever";
			return 5;
		}
		else
		{
		result = "Device is not calibrated to measure fever more than 108";
		return 6;
		}
		
//		if(this.reading < this.getLowerNormalVal() || this.reading >this.getUpperNormalVal())
//			return "Care Needed - Body Temperature is abnormal";
//		return "Normal";
		
	}

	public void display() {
		System.out.println(result);
	}
}


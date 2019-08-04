package com.philips;
public class Temperature {
	private double reading;
	
	/* ranges as per medical standard */
	private final double minFeverValue=93;
	private final double lowerNormalVal = 97;
	private final double upperNormalVal = 98.9;
	private final double upperAcceptableFeverReading = 100.5;
	private final double upperConcernFeverReading = 103.1;
	private final double maxFeverValue=108;
	String result;	
	public Temperature(double reading) 
	{ // constructor
		this.reading = reading;
		result=null;
	}		
	/*Compares reading to medical standard values and sets alert status */
	public int temperatureChecker() 
	{
		if(this.reading < minFeverValue) 
		{
			result="Undetectable Temperature";
			return 0;
		} else if (this.reading < lowerNormalVal && this.reading>=minFeverValue) 
		{
			result = "Unacceptably low temperature level";
			return 1;
		} else if(this.reading >= lowerNormalVal && this.reading <= upperNormalVal) 
		{
			result = "Normal body temperature";
			return 2;
		} else if(this.reading > upperNormalVal && this.reading <= upperAcceptableFeverReading) 
		{
			result = "Care needed - minor fever";
			return 3;
		}
		else if(this.reading > upperAcceptableFeverReading && this.reading <= upperConcernFeverReading) 
		{
			result = "Extreme care needed - High Fever";
			return 4;
		}
		else if(this.reading > upperConcernFeverReading && this.reading <= maxFeverValue) 
		{
			result = "Critical care needed - Very High Fever";
			return 5;
		} else
		{
		result = "Device is not calibrated to measure fever more than 108";
		return 6;
		}		
	}
	/* Display alert message */
	public void display() 
	{
		System.out.println(result);
	}
}


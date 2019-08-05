package com.philips;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Temperature {
	private double reading;
	/* ranges as per medical standard */
	private final double minFeverValue=93;
	private final double lowerNormalVal = 97;
	private final double upperNormalVal = 98.9;
	private final double upperAcceptableFeverReading = 100.5;
	private final double upperConcernFeverReading = 103.1;
	private final double maxFeverValue=108;
	private final List<String> monitorStatus;
	String result;	
	public Temperature(double reading) 
	{ // constructor
		this.reading = reading;
		result=null;
		monitorStatus = new ArrayList<>();
		Collections.addAll(monitorStatus,"Undetectable Temperature",
						"Unacceptably low temperature level", "Normal body temperature",
						"Care needed - minor fever", "Extreme care needed - High Fever",
						"Critical care needed - Very High Fever", "Device is not calibrated to measure fever more than 108");
	}		
	/*Compares reading to medical standard values and sets alert status */
	public int temperatureChecker() 
	{
		if(this.reading < minFeverValue) 
		{
			result = monitorStatus.get(0);
			return 0;
		} else if (this.reading < lowerNormalVal && this.reading>=minFeverValue) 
		{
			result = monitorStatus.get(1);
			return 1;
		} else if(this.reading >= lowerNormalVal && this.reading <= upperNormalVal) 
		{
			result = monitorStatus.get(2);
			return 2;
		} else if(this.reading > upperNormalVal && this.reading <= upperAcceptableFeverReading) 
		{
			result = monitorStatus.get(3);
			return 3;
		}
		else if(this.reading > upperAcceptableFeverReading && this.reading <= upperConcernFeverReading) 
		{
			result = monitorStatus.get(4);
			return 4;
		}
		else if(this.reading > upperConcernFeverReading && this.reading <= maxFeverValue) 
		{
			result = monitorStatus.get(5);
			return 5;
		} else
		{
			result = monitorStatus.get(6);
		return 6;
		}		
	}
	/* Display alert message */
	public void display() 
	{
		System.out.println(result);
	}
}


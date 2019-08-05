package com.philips;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Spo2 {
	String result;
	private double reading;

	/* ranges as per medical standard */
	private final double upperHealthyReading = 100;
	private final double upperAcceptableReading = 95;
	private final double lowerAcceptableReading = 90;
	private final double lowerUnsafeLevelReading = 70;
	private final List<String> monitorStatus;	
	public Spo2(double reading)
	{ // constructor
		this.reading = reading;
		result = null;
		monitorStatus = new ArrayList<>();
		Collections.addAll(monitorStatus,"Undetectable pulse Rate",
						"Normal healthy individual spo2 level",
						"SPO2 level clinically acceptable but patient may be smoker",
						"Unhealthy and unsafe SPO2 level indicates Hypoxemia",
						"Device is not calibrated to measure spo2 lower than 70  Extreme lack of oxygen, ischemic diseases may occur ");
	}	
	/*Compares reading to medical standard values and sets alert status */
	public int Spo2Checker() 
	{
		if(this.reading > upperHealthyReading)
		{
			result = monitorStatus.get(0);
			return 0;
		}
		else if(this.reading > upperAcceptableReading && this.reading <= upperHealthyReading) 
		{
			result = monitorStatus.get(1);
			return 1;
		}
		else if(this.reading > lowerAcceptableReading && this.reading <= upperAcceptableReading) 
		{
			result = monitorStatus.get(2);
			return 2;
		}
		else if(this.reading >= lowerUnsafeLevelReading && this.reading <= lowerAcceptableReading) 
		{
			result = monitorStatus.get(3);
			return 3;
		} else 
		{
			result = monitorStatus.get(4);
			return 4;
		}	
	}
	/* Display alert message */
	public void display() {
		System.out.println(result);
	}
}

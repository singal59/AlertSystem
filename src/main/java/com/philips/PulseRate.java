package com.philips;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PulseRate
{
	private int reading;
	
	/* ranges as per medical standard */
	private final int lowestPulseRate=30;
	private final int lowerSleepingRate = 40;
	private final int upperSleepingRate = 60;
	private final int upperRestingRate = 100;
	private final int upperExerciseRate = 220;
	private final int highestPulseRate=254;
	private final List<String> monitorStatus;
	String result;	



	public PulseRate(int reading) 
	{ // constructor
		this.reading = reading;
		result = null;
		monitorStatus = new ArrayList<>();
		Collections.addAll(monitorStatus,"Device can't measure pulse rate lower than 30",
						 "Below healthy resting pulse rates.", "Normal pulse rate for sleeping.",
						 "Healthy adult resting pulserate.", "Acceptable if measured during exercise but Unacceptable resting pulserate",
						 "Abnormally high pulse rate", "Device does not detect pulse rates > 254 BPM ");
	}	

	/*Compares reading to medical standard values and sets alert status */
	public int pulseRateChecker() 
	{
		if(this.reading < lowestPulseRate)
		{
			result= monitorStatus.get(0);
			return 0;
		}
		else if(this.reading >= lowestPulseRate && this.reading < lowerSleepingRate) 
		{
			result = monitorStatus.get(1);
			return 1;			
		}
		else if(this.reading >= lowerSleepingRate && this.reading < upperSleepingRate) 
		{
			result = monitorStatus.get(2);
			return 2;
		}
		else if(this.reading >= upperSleepingRate && this.reading < upperRestingRate) 
		{
			result =monitorStatus.get(3);
			return 3;
		}
		else if(this.reading >= upperRestingRate && this.reading <= upperExerciseRate) 
		{
			result = monitorStatus.get(4);
			return 4;
		}
		else if(this.reading > upperExerciseRate && this.reading <= highestPulseRate)
		{
			result = monitorStatus.get(5);
			return 5;
		} else 
		{
			result=monitorStatus.get(6);
			return 6;
		}
	}

	/* Display alert message */
	public void display() 
	{
		System.out.println(result);
	}
}



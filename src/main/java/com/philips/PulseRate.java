package com.philips;
public class PulseRate{
	private int reading;
	private final int lowestPulseRate=30;
	private final int lowerSleepingRate = 40;
	private final int upperSleepingRate = 60;
	private final int upperRestingRate = 100;
	private final int upperExerciseRate = 220;
	private final int highestPulseRate=254;

	String result;
	
//	private int lowerNormalVal = 60;
//	private int upperNormalVal = 100;
	
	public PulseRate(int reading) { // constructor
		this.reading = reading;
		result = null;
	}
	
	public int getReading() {
		return this.reading;
	}
	
	public int getLowerNormalVal() {
		return this.upperSleepingRate;
	}
	
	public int getUpperNormalVal() {
		return this.upperRestingRate;
	}
	
	public int pulseRateChecker() {
		if(this.reading < lowestPulseRate)
		{
			result= "Device can't measure pulse rate lower than 30";
			return 0;
		}
		else if(this.reading >= lowestPulseRate && this.reading < lowerSleepingRate) {
			result = "Below healthy resting pulse rates.";
			return 1;			
		}
		else if(this.reading >= lowerSleepingRate && this.reading < upperSleepingRate) {
			result = "Normal pulse rate for sleeping.";
			return 2;
		}
		else if(this.reading >= upperSleepingRate && this.reading < upperRestingRate) {
			result = "Healthy adult resting pulserate.";
			return 3;
		}
		else if(this.reading >= upperRestingRate && this.reading <= upperExerciseRate) {
			result = "Acceptable if measured during exercise but Unacceptable resting pulserate";
			return 4;
		}
		else if(this.reading > upperExerciseRate && this.reading <= highestPulseRate){
			result = "Abnormally high pulse rate";
			return 5;
		}
		else {
			result="Device does not detect pulse rates > 254 BPM ";
			return 6;
		}
		
//		if(this.reading < this.getLowerNormalVal() && this.reading > this.getUpperNormalVal())
//			return "Care Needed - Pulse Rate is abnormal";
//		
//		return "Normal";
	}

	public void display() {
		System.out.println(result);
	}
}



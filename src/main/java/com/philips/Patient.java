package com.philips;
/* Aggregates class of patient vital signs and calls checker for individual classes*/
public class Patient 
{
	String patientID;
	PulseRate pulseRate;
	Spo2 Spo2;
	Temperature temp;	
	public Patient(String patientID,double tempReading, double spo2Reading, int pulseRateReading ) 
	{ 
		if(patientID == null || !patientID.matches("^[A-Z0-9]*$")) // Throw exception on inappropriate patientID
		{
			throw new RuntimeException("Invalid patientID");
		}
		this.patientID = patientID;
		pulseRate = new PulseRate(pulseRateReading);
		Spo2 = new Spo2(spo2Reading);
		temp = new Temperature(tempReading);
	}	
	// Calls the AlertGenerators of other classes(SPO2, Temperature, PulseRate) and displays it
	public boolean Checker() 
	{
		boolean temperatureCheckerResult = (temp.temperatureChecker() == 2) ? true : false;
		boolean spo2CheckerResult = (Spo2.Spo2Checker() == 1 || Spo2.Spo2Checker() == 2 ) ? true : false;	
		boolean pulseRateCheckerResult = (pulseRate.pulseRateChecker() == 2 || pulseRate.pulseRateChecker() == 3) ? true : false;		
		if (!spo2CheckerResult) 
		{
			Spo2.display();
			return false;
		}
		if (!temperatureCheckerResult) 
		{
			temp.display();
			return  false;
		}
		if (!pulseRateCheckerResult) 
		{
			pulseRate.display();
			return false;
		}
		return true;
	}
}
package com.philips;
public class Patient {
	String patientID;
	PulseRate pulseRate;
	Spo2 Spo2;
	Temperature temp;
	
	public Patient(String patientID,double tempReading, double spo2Reading, int pulseRateReading ) { // constructor
		if(patientID == null || !patientID.matches("^[a-zA-Z0-9]*$")) {
			throw new RuntimeException("Inappropriate symbols in patientID");
		}

		this.patientID = patientID;
		pulseRate = new PulseRate(pulseRateReading);
		Spo2 = new Spo2(spo2Reading);
		temp = new Temperature(tempReading);
	}
	
	public boolean Checker() {
		boolean spo2CheckerResult = (Spo2.Spo2Checker() == 1 || Spo2.Spo2Checker() == 2 ) ? true : false;
		boolean temperatureCheckerResult = (temp.temperatureChecker() == 2) ? true : false;
		boolean pulseRateCheckerResult = (pulseRate.pulseRateChecker() == 2 || pulseRate.pulseRateChecker() == 3) ? true : false;
		
		boolean status = true;
		if (!spo2CheckerResult) {
			Spo2.display();
			status = false;
		}
		if (!temperatureCheckerResult) {
			temp.display();
			status =  false;
		}
		if (!pulseRateCheckerResult) {
			pulseRate.display();
			status = false;
		}
		return true;
	}
}
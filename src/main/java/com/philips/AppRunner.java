package com.philips;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class AppRunner {

	static TimerTask timerTask = new TimerTask() {
		
	
		public void run() {
			String data = generateRandomData();
			Scanner s = new Scanner(data + "\n");
			parseAndValidate(s);
		}
	};

	private static void parseAndValidate(Scanner s) {
		String monitorInput;
		
		JSONObject jo = null;		
		monitorInput = s.nextLine();
		System.out.println();
		System.out.println();
		System.out.println(monitorInput);
		Object obj = null;
		try {
			obj = new JSONParser().parse(monitorInput);
			jo = (JSONObject) obj; 
		}
		catch (ParseException e) {
			System.out.println("Unexpected Error occured while parsing Input, make sure valid value is entered");
		}

		parseMonitorInput(jo); 
	}

	private static String generateRandomData() {
		int minPulse=28;
		int maxPulse=257;
		double minTemp=92;
		double maxTemp=109;
		double minSpo2=65;
		double maxSpo2=100;
		JSONObject data = new JSONObject();
		data.put("patient id", getRandomName());		
		data.put("SPO2", ThreadLocalRandom.current().nextDouble(minSpo2, maxSpo2));
		data.put("temperature", ThreadLocalRandom.current().nextDouble(minTemp, maxTemp) );
		data.put("pulse rate", ThreadLocalRandom.current().nextInt(minPulse, maxPulse));
		return data.toJSONString();
	}

	private static String getRandomName() {
		char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J','K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T','U', 'V', 'W', 'X', 'Y', 'Z'};
		char[] numbers = {'1', '2', '3', '4', '5','6', '7', '8', '9', '0'};

		char[] name = new char[8];
		for (int i = 0; i < name.length; i++) {
			if (i <= 4) {
				name[i] = alphabets[ThreadLocalRandom.current().nextInt(0, alphabets.length)];
			} else {
				name[i] = numbers[ThreadLocalRandom.current().nextInt(0, numbers.length)];
			}
		}
		return new String(name);
	}
		
	public static void main(String[] args) { // to do json 
		// TO DO -- > IF we give unexpected values for values it throws exception  TRY catch ### 

		Timer timer = new Timer();
		timer.schedule(timerTask, 0, 10*1000);

		while(true);		
	}
	
	// validate INPUTS	
	public static void parseMonitorInput(JSONObject jo) {

		String patientID = (String) jo.get("patient id");
		
		System.out.println();		

		int pulseRate = 0;
		try {
			pulseRate = Integer.parseInt(jo.get("pulse rate").toString());
		} 
		catch(NumberFormatException e) {
			System.out.println("Pulse Rate should be an integer");
		}
		catch(NullPointerException ex) {
			System.out.println("Pulse rate value does not exist");
		}
			
		double spo2 =  0.0;
		try {
			spo2 = Double.parseDouble(jo.get("SPO2").toString());
		}
		catch(NullPointerException ex) {
			System.out.println("SPO2 value was not entered");
		}
		
		double temperature = 0.0;
		
		try {
			temperature = Double.parseDouble(jo.get("temperature").toString());
		}
		catch(NullPointerException e) {
			System.out.println("Temperature value not entered");
		}

		
		Patient patientObj = new Patient(patientID, temperature, spo2, pulseRate);
		boolean result = patientObj.Checker();
		// return result;
		
	}
	
	
	
}

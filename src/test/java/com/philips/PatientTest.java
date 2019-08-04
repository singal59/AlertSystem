package com.philips;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class PatientTest
{
    @Test
    public void tempPositive() {
        Patient test = new Patient("ABCDE123", 98.8, 98.8, 80);
        boolean result = test.Checker();
        assertEquals(true, result);

    } 
    @Test
    public void tempNegative() {
        Patient test = new Patient("ABCDE123", 103.8, 98.8, 80);
        boolean result = test.Checker();
        assertEquals(false, result);
    }  
    @Test
    public void spo2Positive() {
        Patient test = new Patient("ABCDE123", 98.7, 95.8, 75);
        boolean result = test.Checker();
        assertEquals(true, result);

    } 

    @Test
    public void spo2Negative() {
        Patient test = new Patient("ABCDE123", 98.8, 85, 80);
        boolean result = test.Checker();
        assertEquals(false, result);
    } 
    

    public void pulsePositive() {
        Patient test = new Patient("ABCDE123", 98.8, 96.8, 85);
        boolean result = test.Checker();
        assertEquals(true, result);

    } 

    public void pulseNegative() {
        Patient test = new Patient("ABCDE123", 103.8, 98.8, 200);
        boolean result = test.Checker();
        assertEquals(false, result);
    }
}


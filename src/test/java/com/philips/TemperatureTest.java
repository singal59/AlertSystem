package com.philips;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TemperatureTest {
    @Test
    public void tempMoreThan108() {
        Temperature test = new Temperature(108.1);
        int result = test.temperatureChecker();
        assertEquals(6,result);
    }
  
    
    @Test
    public void temp108() {
        Temperature test = new Temperature(108);
        int result = test.temperatureChecker();
        assertEquals(5,result);
    }

    @Test
    public void tempLessThan108() {
        Temperature test = new Temperature(107.9);
        int result = test.temperatureChecker();
        assertEquals(5,result);
    }

    @Test
    public void tempMoreThan1031() {
        Temperature test = new Temperature(103.2);
        int result = test.temperatureChecker();
        assertEquals(5,result);
    }

    @Test
    public void temp1031() {
        Temperature test = new Temperature(103.1);
        int result = test.temperatureChecker();
        assertEquals(4,result);
    }

    @Test
    public void tempLessThan1031() {
        Temperature test = new Temperature(103.0);
        int result = test.temperatureChecker();
        assertEquals(4,result);
    }

    @Test
    public void tempMoreThan1005() {
        Temperature test = new Temperature(100.6);
        int result = test.temperatureChecker();
        assertEquals(4,result);
    }

    @Test
    public void temp1005() {
        Temperature test = new Temperature(100.5);
        int result = test.temperatureChecker();
        assertEquals(3,result);
    }

    @Test
    public void tempLessThan1005() {
        Temperature test = new Temperature(100.4);
        int result = test.temperatureChecker();
        assertEquals(3,result);
    }

    @Test
    public void tempMoreThan989() {
        Temperature test = new Temperature(99);
        int result = test.temperatureChecker();
        assertEquals(3,result);
    }

    @Test
    public void temp989() {
        Temperature test = new Temperature(98.9);
        int result = test.temperatureChecker();
        assertEquals(2,result);
    }

    @Test
    public void tempLessThan989() {
        Temperature test = new Temperature(98.8);
        int result = test.temperatureChecker();
        assertEquals(2,result);
    }
    @Test
    public void tempMoreThan97() {
        Temperature test = new Temperature(97.1);
        int result = test.temperatureChecker();
        assertEquals(2,result);
    }
    @Test
    public void temp97() {
        Temperature test = new Temperature(97);
        int result = test.temperatureChecker();
        assertEquals(2,result);
    }
    @Test
    public void tempLessThan97() {
        Temperature test = new Temperature(96.9);
        int result = test.temperatureChecker();
        assertEquals(1,result);
    }
    @Test
    public void tempMoreThan93() {
        Temperature test = new Temperature(93.1);
        int result = test.temperatureChecker();
        assertEquals(1,result);
    }
    
    @Test
    public void temp93() {
        Temperature test = new Temperature(93);
        int result = test.temperatureChecker();
        assertEquals(1,result);
    }

    @Test
    public void tempLessThan93() {
        Temperature test = new Temperature(92.9);
        int result = test.temperatureChecker();
        assertEquals(0,result);
    }
}
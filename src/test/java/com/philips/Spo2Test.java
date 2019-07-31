package com.philips;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Spo2Test {
    @Test
    public void spo2LevelMoreThan100() {
        Spo2 test = new Spo2(100.1);
        int result = test.Spo2Checker();
        assertEquals(0,result);
    }

    @Test
    public void spo2Level100() {
        Spo2 test = new Spo2(100);
        int result = test.Spo2Checker();
        assertEquals(1,result);
        
    }

    @Test
    public void spo2LevelLessThan100() {
        Spo2 test = new Spo2(99);
        int result = test.Spo2Checker();
        assertEquals(1,result);
        
    }

    @Test
    public void spo2LevelMoreThan95() {
        Spo2 test = new Spo2(96);
        int result = test.Spo2Checker();
        assertEquals(1,result);
        
    }

    @Test
    public void spo2Level95() {
        Spo2 test = new Spo2(95);
        int result = test.Spo2Checker();
        assertEquals(2,result);
        
    }

    @Test
    public void spo2LevelLessThan95() {
        Spo2 test = new Spo2(94);
        int result = test.Spo2Checker();
        assertEquals(2,result);
        
    }

    @Test
    public void spo2LevelMoreThan90() {
        Spo2 test = new Spo2(91);
        int result = test.Spo2Checker();
        assertEquals(2,result);
        
    }

    @Test
    public void spo2Level90() {
        Spo2 test = new Spo2(90);
        int result = test.Spo2Checker();
        assertEquals(3,result);
        
    }

    @Test
    public void spo2LevelLessThan90() {
        Spo2 test = new Spo2(89);
        int result = test.Spo2Checker();
        assertEquals(3,result);
        
    }

    @Test
    public void spo2LevelMoreThan70() {
        Spo2 test = new Spo2(71);
        int result = test.Spo2Checker();
        assertEquals(3,result);
        
    }
    
    @Test
    public void spo2Level70() {
        Spo2 test = new Spo2(70);
        int result = test.Spo2Checker();
        assertEquals(3,result);
        
    }

    @Test
    public void spo2LevelLessThan70() {
        Spo2 test = new Spo2(69);
        int result = test.Spo2Checker();
        assertEquals(4,result);
        
    }
}

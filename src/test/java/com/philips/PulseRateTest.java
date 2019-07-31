package com.philips;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PulseRateTest {
    @Test
    public void prMoreThan254() {
        PulseRate test = new PulseRate(255);
        int result = test.pulseRateChecker();
        assertEquals(6,result);
    }

    @Test
    public void pr254() {
        PulseRate test = new PulseRate(254);
        int result = test.pulseRateChecker();
        assertEquals(5,result);
    }

    @Test
    public void prLessThan254() {
        PulseRate test = new PulseRate(253);
        int result = test.pulseRateChecker();
        assertEquals(5,result);
    }
    @Test
    public void prMoreThan220() {
        PulseRate test = new PulseRate(221);
        int result = test.pulseRateChecker();
        assertEquals(5,result);
    }
    @Test
    public void pr220() {
        PulseRate test = new PulseRate(220);
        int result = test.pulseRateChecker();
        assertEquals(4,result);
    }

    @Test
    public void prLessThan220() {
        PulseRate test = new PulseRate(219);
        int result = test.pulseRateChecker();
        assertEquals(4,result);

    }

    @Test
    public void prMoreThan100() {
        PulseRate test = new PulseRate(101);
        int result = test.pulseRateChecker();
        assertEquals(4,result);
    }

    @Test
    public void pr100() {
        PulseRate test = new PulseRate(100);
        int result = test.pulseRateChecker();
        assertEquals(4,result);
    }

    @Test
    public void prLessThan100() {
        PulseRate test = new PulseRate(99);
        int result = test.pulseRateChecker();
        assertEquals(3,result);

    }

    @Test
    public void prMoreThan60() {
        PulseRate test = new PulseRate(61);
        int result = test.pulseRateChecker();
        assertEquals(3,result);
    }


    @Test
    public void pr60() {
        PulseRate test = new PulseRate(60);
        int result = test.pulseRateChecker();
        assertEquals(3,result);
    }


    @Test
    public void prLessThan60() {
        PulseRate test = new PulseRate(59);
        int result = test.pulseRateChecker();
        assertEquals(2,result);
    }


    @Test
    public void prMoreThan40() {
        PulseRate test = new PulseRate(41);
        int result = test.pulseRateChecker();
        assertEquals(2,result);
    }

    @Test
    public void pr40() {
        PulseRate test = new PulseRate(40);
        int result = test.pulseRateChecker();
        assertEquals(2,result);
    }


    @Test
    public void prLessThan40() {
        PulseRate test = new PulseRate(39);
        int result = test.pulseRateChecker();
        assertEquals(1,result);
    }

    @Test
    public void prMoreThan30() {
        PulseRate test = new PulseRate(31);
        int result = test.pulseRateChecker();
        assertEquals(1,result);
    }

    @Test
    public void pr30() {
        PulseRate test = new PulseRate(30);
        int result = test.pulseRateChecker();
        assertEquals(1,result);
    }

    @Test
    public void prLessThan30() {
        PulseRate test = new PulseRate(29);
        int result = test.pulseRateChecker();
        assertEquals(0,result);
    }
}
  
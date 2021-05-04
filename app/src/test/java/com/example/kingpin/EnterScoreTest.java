package com.example.kingpin;

import junit.framework.TestCase;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Enter Score Unit Test
 */
public class EnterScoreTest extends TestCase {

    @Test
    public void testcalcScore() {
        EnterScore scr = new EnterScore();
        assertEquals(scr.calcScore(8, 2, 0), 10);
    }

    @Test
    public void testcalcType() {
        EnterScore scr = new EnterScore();
        assertEquals(scr.calcType(8, 2), "Spare");
    }

    @Test
    public void testcalcFrame10() {
        EnterScore scr = new EnterScore();
        assertEquals(scr.calcFrame10(8, 2, 10), 20);
    }
}
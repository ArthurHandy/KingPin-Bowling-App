package com.example.kingpin.game;

import junit.framework.TestCase;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Game Test Unit Test
 */
public class GameTest extends TestCase {

    @Test
    public void testgetName() {
        Game game = new Game("BowlingGame1", "127" , "8", "2", "17", "17", "Spare", "7", "1", "8", "25", "-", "10", "0", "14","39", "Strike", "0", "4", "4", "43", "-", "10", "0", "19", "62", "Strike", "9", "0", "9", "71", "-", "9", "1", "10", "81", "Spare", "0", "6", "6", "87", "-", "3", "7", "20", "107", "Spare", "10", "5", "5", "20","127", "spare");

        assertEquals(game.getName(), "BowlingGame1");
    }

    @Test
    public void testsetName() {
        Game game = new Game();
        String name = "BowlingGame1";
        game.setName(name);
        assertEquals(game.getName(), name);
    }


    @Test
    public void testgetTotalScore() {

        Game game = new Game("BowlingGame1", "127" , "8", "2", "17", "17", "Spare", "7", "1", "8", "25", "-", "10", "0", "14","39", "Strike", "0", "4", "4", "43", "-", "10", "0", "19", "62", "Strike", "9", "0", "9", "71", "-", "9", "1", "10", "81", "Spare", "0", "6", "6", "87", "-", "3", "7", "20", "107", "Spare", "10", "5", "5", "20","127", "spare");

        assertEquals(game.getTotalScore(), "127");
    }

    @Test
    public void testsetTotalScore() {
        Game game = new Game();
        String totalscore = "127";
        game.setTotalScore(totalscore);
        assertEquals((game.getTotalScore()), totalscore);
    }


    @Test
    public void testgetFrame1roll1() {
        Game game = new Game("BowlingGame1", "127" , "8", "2", "17", "17", "Spare", "7", "1", "8", "25", "-", "10", "0", "14","39", "Strike", "0", "4", "4", "43", "-", "10", "0", "19", "62", "Strike", "9", "0", "9", "71", "-", "9", "1", "10", "81", "Spare", "0", "6", "6", "87", "-", "3", "7", "20", "107", "Spare", "10", "5", "5", "20","127", "spare");

        assertEquals(game.getFrame1roll1(), "8");
    }

    @Test
    public void testsetFrame1roll1() {
        Game game = new Game();
        String frame1roll1 = "8";
        game.setFrame1roll1(frame1roll1);
        assertEquals(game.getFrame1roll1(), frame1roll1);
    }

    @Test
    public void testgetFrame1roll2() {
        Game game = new Game("BowlingGame1", "127" , "8", "2", "17", "17", "Spare", "7", "1", "8", "25", "-", "10", "0", "14","39", "Strike", "0", "4", "4", "43", "-", "10", "0", "19", "62", "Strike", "9", "0", "9", "71", "-", "9", "1", "10", "81", "Spare", "0", "6", "6", "87", "-", "3", "7", "20", "107", "Spare", "10", "5", "5", "20","127", "spare");

        assertEquals(game.getFrame1roll2(), "2");
    }

    @Test
    public void testsetFrame1roll2() {
        Game game = new Game();
        String frame1roll2 = "2";
        game.setFrame1roll2(frame1roll2);
        assertEquals(game.getFrame1roll2(), frame1roll2);
    }

    @Test
    public void testgetFrame1score() {
        Game game = new Game("BowlingGame1", "127" , "8", "2", "17", "17", "Spare", "7", "1", "8", "25", "-", "10", "0", "14","39", "Strike", "0", "4", "4", "43", "-", "10", "0", "19", "62", "Strike", "9", "0", "9", "71", "-", "9", "1", "10", "81", "Spare", "0", "6", "6", "87", "-", "3", "7", "20", "107", "Spare", "10", "5", "5", "20","127", "spare");

        assertEquals(game.getFrame1score(), "17");
    }
    @Test
    public void testsetFrame1score() {
        Game game = new Game();
        String frame1score = "17";
        game.setFrame1score(frame1score);
        assertEquals(game.getFrame1score(), frame1score);
    }

    @Test
    public void testgetFrame1total() {
        Game game = new Game("BowlingGame1", "127" , "8", "2", "17", "17", "Spare", "7", "1", "8", "25", "-", "10", "0", "14","39", "Strike", "0", "4", "4", "43", "-", "10", "0", "19", "62", "Strike", "9", "0", "9", "71", "-", "9", "1", "10", "81", "Spare", "0", "6", "6", "87", "-", "3", "7", "20", "107", "Spare", "10", "5", "5", "20","127", "spare");

        assertEquals(game.getFrame1total(), "17");
    }

    @Test
    public void testsetFrame1total() {
        Game game = new Game();
        String frame1total = "17";
        game.setFrame1total(frame1total);
        assertEquals(game.getFrame1total(), frame1total);
    }

    @Test
    public void testgetFrame1type () {
        Game game = new Game("BowlingGame1", "127" , "8", "2", "17", "17", "Spare", "7", "1", "8", "25", "-", "10", "0", "14","39", "Strike", "0", "4", "4", "43", "-", "10", "0", "19", "62", "Strike", "9", "0", "9", "71", "-", "9", "1", "10", "81", "Spare", "0", "6", "6", "87", "-", "3", "7", "20", "107", "Spare", "10", "5", "5", "20","127", "spare");

        assertEquals(game.getFrame1type(), "Spare");
    }

    @Test
    public void testsetFrame1type() {
        Game game = new Game();
        String frame1type = "Spare";
        game.setFrame1type(frame1type);
        assertEquals(game.getFrame1type(), frame1type);
    }

}
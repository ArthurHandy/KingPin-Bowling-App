package com.example.kingpin.game;

import junit.framework.TestCase;

import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test
    public void getFrame2roll1() {
    }

    @Test
    public void setFrame2roll1() {
    }

    @Test
    public void getFrame2roll2() {
    }

    @Test
    public void setFrame2roll2() {
    }

    @Test
    public void getFrame2score() {
    }

    @Test
    public void setFrame2score() {
    }

    @Test
    public void getFrame2total() {
    }

    @Test
    public void setFrame2total() {
    }

    @Test
    public void getFrame2type() {
    }

    @Test
    public void setFrame2type() {
    }

    @Test
    public void getFrame3roll1() {
    }

    @Test
    public void setFrame3roll1() {
    }

    @Test
    public void getFrame3roll2() {
    }

    @Test
    public void setFrame3roll2() {
    }

    @Test
    public void getFrame3score() {
    }

    @Test
    public void setFrame3score() {
    }

    @Test
    public void getFrame3total() {
    }

    @Test
    public void setFrame3total() {
    }

    @Test
    public void getFrame3type() {
    }

    @Test
    public void setFrame3type() {
    }

    @Test
    public void getFrame4roll1() {
    }

    @Test
    public void setFrame4roll1() {
    }

    @Test
    public void getFrame4roll2() {
    }

    @Test
    public void setFrame4roll2() {
    }

    @Test
    public void getFrame4score() {
    }

    @Test
    public void setFrame4score() {
    }

    @Test
    public void getFrame4total() {
    }

    @Test
    public void setFrame4total() {
    }

    @Test
    public void getFrame4type() {
    }

    @Test
    public void setFrame4type() {
    }

    @Test
    public void getFrame5roll1() {
    }

    @Test
    public void setFrame5roll1() {
    }

    @Test
    public void getFrame5roll2() {
    }

    @Test
    public void setFrame5roll2() {
    }

    @Test
    public void getFrame5score() {
    }

    @Test
    public void setFrame5score() {
    }

    @Test
    public void getFrame5total() {
    }

    @Test
    public void setFrame5total() {
    }

    @Test
    public void getFrame5type() {
    }

    @Test
    public void setFrame5type() {
    }

    @Test
    public void getFrame6roll1() {
    }

    @Test
    public void setFrame6roll1() {
    }

    @Test
    public void getFrame6roll2() {
    }

    @Test
    public void setFrame6roll2() {
    }

    @Test
    public void getFrame6score() {
    }

    @Test
    public void setFrame6score() {
    }

    @Test
    public void getFrame6total() {
    }

    @Test
    public void setFrame6total() {
    }

    @Test
    public void getFrame6type() {
    }

    @Test
    public void setFrame6type() {
    }

    @Test
    public void getFrame7roll1() {
    }

    @Test
    public void setFrame7roll1() {
    }

    @Test
    public void getFrame7roll2() {
    }

    @Test
    public void setFrame7roll2() {
    }

    @Test
    public void getFrame7score() {
    }

    @Test
    public void setFrame7score() {
    }

    @Test
    public void getFrame7total() {
    }

    @Test
    public void setFrame7total() {
    }

    @Test
    public void getFrame7type() {
    }

    @Test
    public void setFrame7type() {
    }

    @Test
    public void getFrame8roll1() {
    }

    @Test
    public void setFrame8roll1() {
    }

    @Test
    public void getFrame8roll2() {
    }

    @Test
    public void setFrame8roll2() {
    }

    @Test
    public void getFrame8score() {
    }

    @Test
    public void setFrame8score() {
    }

    @Test
    public void getFrame8total() {
    }

    @Test
    public void setFrame8total() {
    }

    @Test
    public void getFrame8type() {
    }

    @Test
    public void setFrame8type() {
    }

    @Test
    public void getFrame9roll1() {
    }

    @Test
    public void setFrame9roll1() {
    }

    @Test
    public void getFrame9roll2() {
    }

    @Test
    public void setFrame9roll2() {
    }

    @Test
    public void getFrame9score() {
    }

    @Test
    public void setFrame9score() {
    }

    @Test
    public void getFrame9total() {
    }

    @Test
    public void setFrame9total() {
    }

    @Test
    public void getFrame9type() {
    }

    @Test
    public void setFrame9type() {
    }

    @Test
    public void getFrame10roll1() {
    }

    @Test
    public void setFrame10roll1() {
    }

    @Test
    public void getFrame10roll2() {
    }

    @Test
    public void setFrame10roll2() {
    }

    @Test
    public void getFrame10roll3() {
    }

    @Test
    public void setFrame10roll3() {
    }

    @Test
    public void getFrame10score() {
    }

    @Test
    public void setFrame10score() {
    }

    @Test
    public void getFrame10total() {
    }

    @Test
    public void setFrame10total() {
    }

    @Test
    public void getFrame10type() {
    }

    @Test
    public void setFrame10type() {
    }
}
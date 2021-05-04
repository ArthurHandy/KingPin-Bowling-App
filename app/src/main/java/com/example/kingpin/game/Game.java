package com.example.kingpin.game;

//import org.parceler.Parcel;

import org.parceler.Parcel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Game Class for game function with 10 frames, name, score
 */
public class Game implements Serializable {
    /**
     * String Name for game name
     */
    String Name;

    /**
     * String totalScore for total score
     */
    String totalScore;


    //Frame 1
    /**
     * String to hold frame 1 values
     */
    String Frame1roll1;
    String Frame1roll2;
    String Frame1score;
    String Frame1total;
    String Frame1type;

    // Frame2
    /**
     * String to hold frame 2 values
     */
    String Frame2roll1;
    String Frame2roll2;
    String Frame2score;
    String Frame2total;
    String Frame2type;

    //Frame 3
    /**
     * String to hold frame 3 values
     */
    String Frame3roll1;
    String Frame3roll2;
    String Frame3score;
    String Frame3total;
    String Frame3type;

    //Frame 4
    /**
     * String to hold frame 4 values
     */
    String Frame4roll1;
    String Frame4roll2;
    String Frame4score;
    String Frame4total;
    String Frame4type;

    //Frame 5
    /**
     * String to hold frame 5 values
     */
    String Frame5roll1;
    String Frame5roll2;
    String Frame5score;
    String Frame5total;
    String Frame5type;

    //Frame 6
    /**
     * String to hold frame 6 values
     */
    String Frame6roll1;
    String Frame6roll2;
    String Frame6score;
    String Frame6total;
    String Frame6type;


    //Frame 7
    /**
     * String to hold frame 7 values
     */
    String Frame7roll1;
    String Frame7roll2;
    String Frame7score;
    String Frame7total;
    String Frame7type;

    //Frame 8
    /**
     * String to hold frame 8 values
     */
    String Frame8roll1;
    String Frame8roll2;
    String Frame8score;
    String Frame8total;
    String Frame8type;

    //Frame 9
    /**
     * String to hold frame 9 values
     */
    String Frame9roll1;
    String Frame9roll2;
    String Frame9score;
    String Frame9total;
    String Frame9type;

    //Frame 10
    /**
     * String to hold frame 10 values
     */
    String Frame10roll1;
    String Frame10roll2;
    String Frame10roll3;
    String Frame10score;
    String Frame10total;
    String Frame10type;

    /**
     * Constructor
     * Default
     */
    public Game(){

    }

    /**
     * Constructor with all values
     * @param name
     * @param totalScore
     * @param frame1roll1
     * @param frame1roll2
     * @param frame1score
     * @param frame1total
     * @param frame1type
     * @param frame2roll1
     * @param frame2roll2
     * @param frame2score
     * @param frame2total
     * @param frame2type
     * @param frame3roll1
     * @param frame3roll2
     * @param frame3score
     * @param frame3total
     * @param frame3type
     * @param frame4roll1
     * @param frame4roll2
     * @param frame4score
     * @param frame4total
     * @param frame4type
     * @param frame5roll1
     * @param frame5roll2
     * @param frame5score
     * @param frame5total
     * @param frame5type
     * @param frame6roll1
     * @param frame6roll2
     * @param frame6score
     * @param frame6total
     * @param frame6type
     * @param frame7roll1
     * @param frame7roll2
     * @param frame7score
     * @param frame7total
     * @param frame7type
     * @param frame8roll1
     * @param frame8roll2
     * @param frame8score
     * @param frame8total
     * @param frame8type
     * @param frame9roll1
     * @param frame9roll2
     * @param frame9score
     * @param frame9total
     * @param frame9type
     * @param frame10roll1
     * @param frame10roll2
     * @param frame10roll3
     * @param frame10score
     * @param frame10total
     * @param frame10type
     */
    public Game(String name, String totalScore, String frame1roll1, String frame1roll2, String frame1score, String frame1total, String frame1type, String frame2roll1, String frame2roll2, String frame2score, String frame2total, String frame2type, String frame3roll1, String frame3roll2, String frame3score, String frame3total, String frame3type, String frame4roll1, String frame4roll2, String frame4score, String frame4total, String frame4type, String frame5roll1, String frame5roll2, String frame5score, String frame5total, String frame5type, String frame6roll1, String frame6roll2, String frame6score, String frame6total, String frame6type, String frame7roll1, String frame7roll2, String frame7score, String frame7total, String frame7type, String frame8roll1, String frame8roll2, String frame8score, String frame8total, String frame8type, String frame9roll1, String frame9roll2, String frame9score, String frame9total, String frame9type, String frame10roll1, String frame10roll2, String frame10roll3, String frame10score, String frame10total, String frame10type) {
        this.Name = name;
        this.totalScore = totalScore;
        Frame1roll1 = frame1roll1;
        Frame1roll2 = frame1roll2;
        Frame1score = frame1score;
        Frame1total = frame1total;
        Frame1type = frame1type;
        Frame2roll1 = frame2roll1;
        Frame2roll2 = frame2roll2;
        Frame2score = frame2score;
        Frame2total = frame2total;
        Frame2type = frame2type;
        Frame3roll1 = frame3roll1;
        Frame3roll2 = frame3roll2;
        Frame3score = frame3score;
        Frame3total = frame3total;
        Frame3type = frame3type;
        Frame4roll1 = frame4roll1;
        Frame4roll2 = frame4roll2;
        Frame4score = frame4score;
        Frame4total = frame4total;
        Frame4type = frame4type;
        Frame5roll1 = frame5roll1;
        Frame5roll2 = frame5roll2;
        Frame5score = frame5score;
        Frame5total = frame5total;
        Frame5type = frame5type;
        Frame6roll1 = frame6roll1;
        Frame6roll2 = frame6roll2;
        Frame6score = frame6score;
        Frame6total = frame6total;
        Frame6type = frame6type;
        Frame7roll1 = frame7roll1;
        Frame7roll2 = frame7roll2;
        Frame7score = frame7score;
        Frame7total = frame7total;
        Frame7type = frame7type;
        Frame8roll1 = frame8roll1;
        Frame8roll2 = frame8roll2;
        Frame8score = frame8score;
        Frame8total = frame8total;
        Frame8type = frame8type;
        Frame9roll1 = frame9roll1;
        Frame9roll2 = frame9roll2;
        Frame9score = frame9score;
        Frame9total = frame9total;
        Frame9type = frame9type;
        Frame10roll1 = frame10roll1;
        Frame10roll2 = frame10roll2;
        Frame10roll3 = frame10roll3;
        Frame10score = frame10score;
        Frame10total = frame10total;
        Frame10type = frame10type;
    }

    /**
     * getter getName()
     * @return name of game
     */
    public String getName() {
        return Name;
    }

    /**
     * setter
     * @return name
     */
    public void setName(String name) {
        this.Name = name;
    }

    /**
     * getter
     * @return totalScore
     */
    public String getTotalScore() {
        return totalScore;
    }

    /**
     * setter
     * @param totalScore sets the total to parameter
     */
    public void setTotalScore(String totalScore) {
        this.totalScore = totalScore;
    }

    /**
     * getter
     * @return frame roll 1
     */
    public String getFrame1roll1() {
        return Frame1roll1;
    }

    /**
     * setter
     * @param frame1roll1
     */
    public void setFrame1roll1(String frame1roll1) {
        Frame1roll1 = frame1roll1;
    }

    /**
     * getter
     * @return frame 1 roll 2
     */
    public String getFrame1roll2() {
        return Frame1roll2;
    }

    /**
     * setter
     * @param frame1roll2
     */
    public void setFrame1roll2(String frame1roll2) {
        Frame1roll2 = frame1roll2;
    }

    /**
     * getter
     * @return frame 1 score
     */
    public String getFrame1score() {
        return Frame1score;
    }

    /**
     * setter
     * @param frame1score
     */
    public void setFrame1score(String frame1score) {
        Frame1score = frame1score;
    }

    /**
     * getter
     * @return frame 1 total score
     */
    public String getFrame1total() {
        return Frame1total;
    }

    /**
     * setter
     * @param frame1total
     */
    public void setFrame1total(String frame1total) {
        Frame1total = frame1total;
    }

    /**
     * getter
     * @return frame 1 type
     */
    public String getFrame1type() {
        return Frame1type;
    }

    /**
     * setter
     * @param frame1type
     */
    public void setFrame1type(String frame1type) {
        Frame1type = frame1type;
    }

    public String getFrame2roll1() {
        return Frame2roll1;
    }

    /**
     *
     * @param frame2roll1
     */
    public void setFrame2roll1(String frame2roll1) {
        Frame2roll1 = frame2roll1;
    }

    /**
     *
     * @return
     */
    public String getFrame2roll2() {
        return Frame2roll2;
    }

    /**
     *
     * @param frame2roll2
     */
    public void setFrame2roll2(String frame2roll2) {
        Frame2roll2 = frame2roll2;
    }

    /**
     * getter
     * @return frame 2 score
     */
    public String getFrame2score() {
        return Frame2score;
    }

    /**
     * setter
     * @param frame2score
     */
    public void setFrame2score(String frame2score) {
        Frame2score = frame2score;
    }

    /**
     * getter
     * @return frame 2 total
     */
    public String getFrame2total() {
        return Frame2total;
    }

    /**
     * setter
     * @param frame2total
     */
    public void setFrame2total(String frame2total) {
        Frame2total = frame2total;
    }

    /**
     * getter
     * @return frame 2 type
     */
    public String getFrame2type() {
        return Frame2type;
    }

    /**
     * setter
     * @param frame2type
     */
    public void setFrame2type(String frame2type) {
        Frame2type = frame2type;
    }

    /**
     * getter
     * @return frame 3 roll 1
     */
    public String getFrame3roll1() {
        return Frame3roll1;
    }

    /**
     * setter
     * @param frame3roll1
     */
    public void setFrame3roll1(String frame3roll1) {
        Frame3roll1 = frame3roll1;
    }

    /**
     * getter
     * @return frame 3 roll 2
     */
    public String getFrame3roll2() {
        return Frame3roll2;
    }

    /**
     * setter
     * @param frame3roll2
     */
    public void setFrame3roll2(String frame3roll2) {
        Frame3roll2 = frame3roll2;
    }

    /**
     * getter
     * @return frame 3 score
     */
    public String getFrame3score() {
        return Frame3score;
    }

    /**
     * setter
     * @param frame3score
     */
    public void setFrame3score(String frame3score) {
        Frame3score = frame3score;
    }

    /**
     * getter
     * @return frame 3 total
     */
    public String getFrame3total() {
        return Frame3total;
    }

    /**
     * setter
     * @param frame3total
     */
    public void setFrame3total(String frame3total) {
        Frame3total = frame3total;
    }

    /**
     * getter
     * @return frame 3 type
     */
    public String getFrame3type() {
        return Frame3type;
    }

    /**
     * setter
     * @param frame3type
     */
    public void setFrame3type(String frame3type) {
        Frame3type = frame3type;
    }

    /**
     * getter
     * @return frame 4 roll 1
     */
    public String getFrame4roll1() {
        return Frame4roll1;
    }

    /**
     * setter
     * @param frame4roll1
     */
    public void setFrame4roll1(String frame4roll1) {
        Frame4roll1 = frame4roll1;
    }

    /**
     * getter
     * @return frame 4 roll 2
     */
    public String getFrame4roll2() {
        return Frame4roll2;
    }

    /**
     * setter
     * @param frame4roll2
     */
    public void setFrame4roll2(String frame4roll2) {
        Frame4roll2 = frame4roll2;
    }

    /**
     * getter
     * @return frame 4 score
     */
    public String getFrame4score() {
        return Frame4score;
    }

    /**
     * setter
     * @param frame4score
     */
    public void setFrame4score(String frame4score) {
        Frame4score = frame4score;
    }

    /**
     * getter
     * @return frame 4 total score
     */
    public String getFrame4total() {
        return Frame4total;
    }

    /**
     * setter
     * @param frame4total
     */
    public void setFrame4total(String frame4total) {
        Frame4total = frame4total;
    }

    /**
     * getter
     * @return frame 4 type
     */
    public String getFrame4type() {
        return Frame4type;
    }

    /**
     * setter
     * @param frame4type
     */
    public void setFrame4type(String frame4type) {
        Frame4type = frame4type;
    }

    /**
     * getter
     * @return frame 5 roll 1
     */
    public String getFrame5roll1() {
        return Frame5roll1;
    }

    /**
     * setter
     * @param frame5roll1
     */
    public void setFrame5roll1(String frame5roll1) {
        Frame5roll1 = frame5roll1;
    }

    /**
     * getter
     * @return frame 5 roll 2
     */
    public String getFrame5roll2() {
        return Frame5roll2;
    }

    /**
     * setter
     * @param frame5roll2
     */
    public void setFrame5roll2(String frame5roll2) {
        Frame5roll2 = frame5roll2;
    }

    /**
     * getter
     * @return frame 5 score
     */
    public String getFrame5score() {
        return Frame5score;
    }

    /**
     * setter
     * @param frame5score
     */
    public void setFrame5score(String frame5score) {
        Frame5score = frame5score;
    }

    /**
     * getter
     * @return frame 5 score
     */
    public String getFrame5total() {
        return Frame5total;
    }

    /**
     * setter
     * @param frame5total
     */
    public void setFrame5total(String frame5total) {
        Frame5total = frame5total;
    }

    /**
     * getter
     * @return frame 5 type
     */
    public String getFrame5type() {
        return Frame5type;
    }

    /**
     * setter
     * @param frame5type
     */
    public void setFrame5type(String frame5type) {
        Frame5type = frame5type;
    }

    /**
     * getter
     * @return frame 6 toll 1
     */
    public String getFrame6roll1() {
        return Frame6roll1;
    }

    /**
     * setter
     * @param frame6roll1
     */
    public void setFrame6roll1(String frame6roll1) {
        Frame6roll1 = frame6roll1;
    }

    /**
     * getter
     * @return frame 6 roll 2
     */
    public String getFrame6roll2() {
        return Frame6roll2;
    }

    /**
     * setter
     * @param frame6roll2
     */
    public void setFrame6roll2(String frame6roll2) {
        Frame6roll2 = frame6roll2;
    }

    /**
     * getter
     * @return frane 6 score
     */
    public String getFrame6score() {
        return Frame6score;
    }

    /**
     * setter
     * @param frame6score
     */
    public void setFrame6score(String frame6score) {
        Frame6score = frame6score;
    }

    /**
     * getter
     * @return frame 6 total
     */
    public String getFrame6total() {
        return Frame6total;
    }

    /**
     * setter
     * @param frame6total
     */
    public void setFrame6total(String frame6total) {
        Frame6total = frame6total;
    }

    /**
     * getter
     * @return frame 6 type
     */
    public String getFrame6type() {
        return Frame6type;
    }

    /**
     * setter
     * @param frame6type
     */
    public void setFrame6type(String frame6type) {
        Frame6type = frame6type;
    }

    /**
     * getter
     * @return frame 7 roll 1
     */
    public String getFrame7roll1() {
        return Frame7roll1;
    }

    /**
     * setter
     * @param frame7roll1
     */
    public void setFrame7roll1(String frame7roll1) {
        Frame7roll1 = frame7roll1;
    }

    /**
     * getter
     * @return frame 7 roll 2
     */
    public String getFrame7roll2() {
        return Frame7roll2;
    }

    /**
     * setter
     * @param frame7roll2
     */
    public void setFrame7roll2(String frame7roll2) {
        Frame7roll2 = frame7roll2;
    }

    /**
     * getter
     * @return frame 7 score
     */
    public String getFrame7score() {
        return Frame7score;
    }

    /**
     * setter
     * @param frame7score
     */
    public void setFrame7score(String frame7score) {
        Frame7score = frame7score;
    }

    /**
     * getter
     * @return frame 7 total
     */
    public String getFrame7total() {
        return Frame7total;
    }

    /**
     * setter
     * @param frame7total
     */
    public void setFrame7total(String frame7total) {
        Frame7total = frame7total;
    }

    /**
     * getter
     * @return frame 7 type
     */
    public String getFrame7type() {
        return Frame7type;
    }

    /**
     * setter
     * @param frame7type
     */
    public void setFrame7type(String frame7type) {
        Frame7type = frame7type;
    }

    /**
     * getter
     * @return frame 8 roll 1
     */
    public String getFrame8roll1() {
        return Frame8roll1;
    }

    /**
     * setter
     * @param frame8roll1
     */
    public void setFrame8roll1(String frame8roll1) {
        Frame8roll1 = frame8roll1;
    }

    /**
     * getter
     * @return frame 8 roll 2
     */
    public String getFrame8roll2() {
        return Frame8roll2;
    }

    /**
     * setter
     * @param frame8roll2
     */
    public void setFrame8roll2(String frame8roll2) {
        Frame8roll2 = frame8roll2;
    }

    /**
     * getter
     * @return frame 8 score
     */
    public String getFrame8score() {
        return Frame8score;
    }

    /**
     * setter
     * @param frame8score
     */
    public void setFrame8score(String frame8score) {
        Frame8score = frame8score;
    }

    /**
     * getter
     * @return frame 8 total
     */
    public String getFrame8total() {
        return Frame8total;
    }

    /**
     * setter
     * @param frame8total
     */
    public void setFrame8total(String frame8total) {
        Frame8total = frame8total;
    }

    /**
     * getter
     * @return frame 8 type
     */
    public String getFrame8type() {
        return Frame8type;
    }

    /**
     * setter
     * @param frame8type
     */
    public void setFrame8type(String frame8type) {
        Frame8type = frame8type;
    }

    /**
     * getter
     * @return frame 9 roll 1
     */
    public String getFrame9roll1() {
        return Frame9roll1;
    }

    /**
     * setter
     * @param frame9roll1
     */
    public void setFrame9roll1(String frame9roll1) {
        Frame9roll1 = frame9roll1;
    }

    /**
     * getter
     * @return frame 9 roll 2
     */
    public String getFrame9roll2() {
        return Frame9roll2;
    }

    /**
     * setter
     * @param frame9roll2
     */
    public void setFrame9roll2(String frame9roll2) {
        Frame9roll2 = frame9roll2;
    }

    /**
     * getter
     * @return frame 9 score
     */
    public String getFrame9score() {
        return Frame9score;
    }

    /**
     * setter
     * @param frame9score
     */
    public void setFrame9score(String frame9score) {
        Frame9score = frame9score;
    }

    /**
     * getter
     * @return frame 9 total
     */
    public String getFrame9total() {
        return Frame9total;
    }

    /**
     * setter
     * @param frame9total
     */
    public void setFrame9total(String frame9total) {
        Frame9total = frame9total;
    }

    /**
     * getter
     * @return frame 9 type
     */
    public String getFrame9type() {
        return Frame9type;
    }

    /**
     * setter
     * @param frame9type
     */
    public void setFrame9type(String frame9type) {
        Frame9type = frame9type;
    }

    /**
     * getter
     * @return frame 10 roll 1
     */
    public String getFrame10roll1() {
        return Frame10roll1;
    }

    /**
     * setter
     * @param frame10roll1
     */
    public void setFrame10roll1(String frame10roll1) {
        Frame10roll1 = frame10roll1;
    }

    /**
     * getter
     * @return frame 10 roll 2
     */
    public String getFrame10roll2() {
        return Frame10roll2;
    }

    /**
     * setter
     * @param frame10roll2
     */
    public void setFrame10roll2(String frame10roll2) {
        Frame10roll2 = frame10roll2;
    }

    /**
     * getter
     * @return frame 10 roll 3
     */
    public String getFrame10roll3() {
        return Frame10roll3;
    }

    /**
     * setter
     * @param frame10roll3
     */
    public void setFrame10roll3(String frame10roll3) {
        Frame10roll3 = frame10roll3;
    }

    /**
     * getter
     * @return fram 10 score
     */
    public String getFrame10score() {
        return Frame10score;
    }

    /**
     * setter
     * @param frame10score
     */
    public void setFrame10score(String frame10score) {
        Frame10score = frame10score;
    }

    /**
     * getter
     * @return frame 10 total
     */
    public String getFrame10total() {
        return Frame10total;
    }

    /**
     * setter
     * @param frame10total
     */
    public void setFrame10total(String frame10total) {
        Frame10total = frame10total;
    }

    /**
     * getter
     * @return frame 10 type
     */
    public String getFrame10type() {
        return Frame10type;
    }

    /**
     * setter
     * @param frame10type
     */
    public void setFrame10type(String frame10type) {
        Frame10type = frame10type;
    }

}
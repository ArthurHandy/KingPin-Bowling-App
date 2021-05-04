package com.example.kingpin.game;

/**
 * Frame class to hold listView values
 * @author Group7
 */
public class Frame {
    /**
     * name to save frame name
     */
    private String name;

    /**
     * type to hold frame type
     */
    private String type;

    /**
     * score to hold frame score
     */
    private String score;

    /**
     * Constructor for Frame object
     * @param name
     * @param s
     * @param t
     */
    public Frame(String name, String s, String t) {
        this.name = name;
        this.type = t;
        this.score = s;
    }

    /**
     * Returns name value
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns type value
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Returns score value
     * @return score
     */
    public String getScore() {
        return score;
    }

}

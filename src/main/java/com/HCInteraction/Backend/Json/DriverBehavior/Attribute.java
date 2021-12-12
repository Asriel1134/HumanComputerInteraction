package com.HCInteraction.Backend.Json.DriverBehavior;

public class Attribute {
    private double score;
    private double threshold;

    public Attribute(double score, double threshold) {
        this.score = score;
        this.threshold = threshold;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }
}

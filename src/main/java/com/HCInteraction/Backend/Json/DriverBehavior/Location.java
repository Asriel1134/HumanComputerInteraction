package com.HCInteraction.Backend.Json.DriverBehavior;

public class Location {
    private double score;
    private int top;
    private int left;
    private int width;
    private int height;

    public Location(double score, int top, int left, int width, int height) {
        this.score = score;
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

package com.HCInteraction.Backend.Json.BodyAttr;

public class Location {
    private int left;
    private int top;
    private int width;
    private int height;
    private double score;

    public Location(int left, int top, int width, int height, double score) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
        this.score = score;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

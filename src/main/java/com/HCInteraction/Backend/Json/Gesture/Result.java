package com.HCInteraction.Backend.Json.Gesture;

public class Result {
    private String classname;
    private int width;
    private int height;
    private int left;
    private int top;
    private double probability;

    public Result(String classname, int width, int height, int left, int top, double probability) {
        this.classname = classname;
        this.width = width;
        this.height = height;
        this.left = left;
        this.top = top;
        this.probability = probability;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
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

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }
}

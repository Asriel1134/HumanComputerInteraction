package com.HCInteraction.Backend.Json.VehicleDetect;

public class Location {
    private int width;
    private int height;
    private int top;
    private int left;

    public Location(int width, int height, int top, int left) {
        this.width = width;
        this.height = height;
        this.top = top;
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
}

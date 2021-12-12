package com.HCInteraction.Backend.Json.VehicleDetect;

public class VehicleInfo {
    private String type;
    private Location location;
    private double probability;

    public VehicleInfo(String type, Location location, double probability) {
        this.type = type;
        this.location = location;
        this.probability = probability;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }
}

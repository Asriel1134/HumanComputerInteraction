package com.HCInteraction.Backend.Json.DriverBehavior;

public class PersonInfo {
    private Location location;
    private Attributes attributes;

    public PersonInfo(Location location, Attributes attributes) {
        this.location = location;
        this.attributes = attributes;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }
}

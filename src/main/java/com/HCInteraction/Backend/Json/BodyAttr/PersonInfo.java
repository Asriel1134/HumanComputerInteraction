package com.HCInteraction.Backend.Json.BodyAttr;

public class PersonInfo {
    private Attributes attributes;
    private Location location;

    public PersonInfo(Attributes attributes, Location location) {
        this.attributes = attributes;
        this.location = location;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}

package com.HCInteraction.Backend.Json.DriverBehavior;

@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
public class Attributes {
    private Attribute both_hands_leaving_wheel;
    private Attribute eyes_closed;
    private Attribute no_face_mask;
    private Attribute not_buckling_up;
    private Attribute smoke;
    private Attribute not_facing_front;
    private Attribute cellphone;
    private Attribute yawning;
    private Attribute head_lowered;

    public Attributes(Attribute both_hands_leaving_wheel, Attribute eyes_closed, Attribute no_face_mask, Attribute not_buckling_up, Attribute smoke, Attribute not_facing_front, Attribute cellphone, Attribute yawning, Attribute head_lowered) {
        this.both_hands_leaving_wheel = both_hands_leaving_wheel;
        this.eyes_closed = eyes_closed;
        this.no_face_mask = no_face_mask;
        this.not_buckling_up = not_buckling_up;
        this.smoke = smoke;
        this.not_facing_front = not_facing_front;
        this.cellphone = cellphone;
        this.yawning = yawning;
        this.head_lowered = head_lowered;
    }

    public Attribute getBoth_hands_leaving_wheel() {
        return both_hands_leaving_wheel;
    }

    public void setBoth_hands_leaving_wheel(Attribute both_hands_leaving_wheel) {
        this.both_hands_leaving_wheel = both_hands_leaving_wheel;
    }

    public Attribute getEyes_closed() {
        return eyes_closed;
    }

    public void setEyes_closed(Attribute eyes_closed) {
        this.eyes_closed = eyes_closed;
    }

    public Attribute getNo_face_mask() {
        return no_face_mask;
    }

    public void setNo_face_mask(Attribute no_face_mask) {
        this.no_face_mask = no_face_mask;
    }

    public Attribute getNot_buckling_up() {
        return not_buckling_up;
    }

    public void setNot_buckling_up(Attribute not_buckling_up) {
        this.not_buckling_up = not_buckling_up;
    }

    public Attribute getSmoke() {
        return smoke;
    }

    public void setSmoke(Attribute smoke) {
        this.smoke = smoke;
    }

    public Attribute getNot_facing_front() {
        return not_facing_front;
    }

    public void setNot_facing_front(Attribute not_facing_front) {
        this.not_facing_front = not_facing_front;
    }

    public Attribute getCellphone() {
        return cellphone;
    }

    public void setCellphone(Attribute cellphone) {
        this.cellphone = cellphone;
    }

    public Attribute getYawning() {
        return yawning;
    }

    public void setYawning(Attribute yawning) {
        this.yawning = yawning;
    }

    public Attribute getHead_lowered() {
        return head_lowered;
    }

    public void setHead_lowered(Attribute head_lowered) {
        this.head_lowered = head_lowered;
    }
}

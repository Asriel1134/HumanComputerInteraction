package com.HCInteraction.Backend.Json.VehicleDetect;

public class VehicleNum {
    private int motorbike;
    private int tricycle;
    private int car;
    private int carplate;
    private int truck;
    private int bus;

    public VehicleNum(int motorbike, int tricycle, int car, int carplate, int truck, int bus) {
        this.motorbike = motorbike;
        this.tricycle = tricycle;
        this.car = car;
        this.carplate = carplate;
        this.truck = truck;
        this.bus = bus;
    }

    public int getMotorbike() {
        return motorbike;
    }

    public void setMotorbike(int motorbike) {
        this.motorbike = motorbike;
    }

    public int getTricycle() {
        return tricycle;
    }

    public void setTricycle(int tricycle) {
        this.tricycle = tricycle;
    }

    public int getCar() {
        return car;
    }

    public void setCar(int car) {
        this.car = car;
    }

    public int getCarplate() {
        return carplate;
    }

    public void setCarplate(int carplate) {
        this.carplate = carplate;
    }

    public int getTruck() {
        return truck;
    }

    public void setTruck(int truck) {
        this.truck = truck;
    }

    public int getBus() {
        return bus;
    }

    public void setBus(int bus) {
        this.bus = bus;
    }
}

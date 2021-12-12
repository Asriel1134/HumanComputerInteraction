package com.HCInteraction.Backend.Json.VehicleDetect;

import java.util.List;

@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
public class VehicleDetectJson {
    private VehicleNum vehicle_num;
    private List<VehicleInfo> vehicle_info;

    public VehicleDetectJson(VehicleNum vehicle_num, List<VehicleInfo> vehicle_info) {
        this.vehicle_num = vehicle_num;
        this.vehicle_info = vehicle_info;
    }

    public VehicleNum getVehicle_num() {
        return vehicle_num;
    }

    public void setVehicle_num(VehicleNum vehicle_num) {
        this.vehicle_num = vehicle_num;
    }

    public List<VehicleInfo> getVehicle_info() {
        return vehicle_info;
    }

    public void setVehicle_info(List<VehicleInfo> vehicle_info) {
        this.vehicle_info = vehicle_info;
    }
}

package com.HCInteraction.Backend.Analyze;

import com.HCInteraction.Backend.Tools.Request;

/**
 * 车辆检测
 */
public class VehicleDetect {

    public static String vehicleDetect(String filePath) {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/image-classify/v1/vehicle_detect";
        return Request.request(filePath, url);
    }

    public static void main(String[] args) {
        VehicleDetect.vehicleDetect("test.png");
    }
}


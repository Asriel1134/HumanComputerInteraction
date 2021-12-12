package com.HCInteraction.Backend.Process;

import com.HCInteraction.Backend.Analyze.VehicleDetect;
import com.HCInteraction.Backend.Json.VehicleDetect.VehicleDetectJson;
import com.HCInteraction.Backend.Json.VehicleDetect.VehicleInfo;
import com.google.gson.Gson;

public class VehicleDetectProcess {
    public static void main(String[] args) {
        vehicleDetectProcess("vehicleDetectProcess.png");
    }

    public static void vehicleDetectProcess(String filePath){
//        String string = "{\"vehicle_info\":[{\"type\":\"truck\",\"probability\":0.89499027,\"location\":{\"width\":26,\"height\":29,\"left\":407,\"top\":234}},{\"type\":\"car\",\"probability\":0.9443152,\"location\":{\"width\":33,\"height\":26,\"left\":572,\"top\":296}},{\"type\":\"bus\",\"probability\":0.20632137,\"location\":{\"width\":29,\"height\":27,\"left\":514,\"top\":246}},{\"type\":\"truck\",\"probability\":0.8211856,\"location\":{\"width\":37,\"height\":51,\"left\":674,\"top\":246}},{\"type\":\"car\",\"probability\":0.9435826,\"location\":{\"width\":21,\"height\":17,\"left\":825,\"top\":274}},{\"type\":\"truck\",\"probability\":0.5914822,\"location\":{\"width\":57,\"height\":37,\"left\":155,\"top\":289}},{\"type\":\"car\",\"probability\":0.9289396,\"location\":{\"width\":45,\"height\":37,\"left\":618,\"top\":308}},{\"type\":\"truck\",\"probability\":0.3832707,\"location\":{\"width\":29,\"height\":27,\"left\":514,\"top\":246}},{\"type\":\"car\",\"probability\":0.8725725,\"location\":{\"width\":24,\"height\":18,\"left\":629,\"top\":281}},{\"type\":\"car\",\"probability\":0.78103536,\"location\":{\"width\":23,\"height\":16,\"left\":471,\"top\":267}},{\"type\":\"car\",\"probability\":0.49859062,\"location\":{\"width\":33,\"height\":24,\"left\":342,\"top\":290}},{\"type\":\"car\",\"probability\":0.46284387,\"location\":{\"width\":19,\"height\":15,\"left\":594,\"top\":270}},{\"type\":\"car\",\"probability\":0.42833024,\"location\":{\"width\":22,\"height\":15,\"left\":507,\"top\":265}},{\"type\":\"car\",\"probability\":0.3946166,\"location\":{\"width\":20,\"height\":13,\"left\":628,\"top\":273}},{\"type\":\"car\",\"probability\":0.24535441,\"location\":{\"width\":17,\"height\":14,\"left\":601,\"top\":257}},{\"type\":\"car\",\"probability\":0.1928591,\"location\":{\"width\":18,\"height\":14,\"left\":637,\"top\":264}}],\"vehicle_num\":{\"motorbike\":0,\"truck\":4,\"carplate\":0,\"car\":11,\"tricycle\":0,\"bus\":1},\"log_id\":1469545250238102500}";
        Gson gson = new Gson();
        String string = VehicleDetect.vehicleDetect(filePath);
        VehicleDetectJson vehicleDetectResult = gson.fromJson(string, VehicleDetectJson.class);

        vehicleDetectOutput(vehicleDetectResult);
    }

    public static void vehicleDetectOutput(VehicleDetectJson vehicleDetectResult){
        int carNum = vehicleDetectResult.getVehicle_info().size();
        System.out.println("前方车辆总数： " + carNum);
        System.out.println("小汽车: " + vehicleDetectResult.getVehicle_num().getCar());
        System.out.println("卡  车: " + vehicleDetectResult.getVehicle_num().getTruck());
        System.out.println("巴  士: " + vehicleDetectResult.getVehicle_num().getBus());
        System.out.println("摩托车: " + vehicleDetectResult.getVehicle_num().getMotorbike());
        System.out.println("三轮车: " + vehicleDetectResult.getVehicle_num().getTricycle());

        System.out.println("-----------------------");
        if (carNum < 6){
            System.out.println("当前车流较小，请保持当前车道行驶");
        } else if (carNum < 20){
            System.out.println("当前车流较大，请小心驾驶");
        } else {
            System.out.println("当前道路拥堵，请注意行车安全");
        }
        System.out.println("-----------------------");

        for (VehicleInfo vI : vehicleDetectResult.getVehicle_info()){
            System.out.print("类型： ");
            if ("car".equals(vI.getType())){
                System.out.println("小汽车");
            } else if ("truck".equals(vI.getType())){
                System.out.println("卡车");
            } else if ("bus".equals(vI.getType())){
                System.out.println("巴士");
            } else if ("motorbike".equals(vI.getType())){
                System.out.println("摩托车");
            } else if ("tricycle".equals(vI.getType())){
                System.out.println("三轮车");
            }
            System.out.println("位置： X:" + vI.getLocation().getLeft() + " Y:" + vI.getLocation().getTop() + " W:" + vI.getLocation().getWidth() + " H:" +vI.getLocation().getHeight());
            System.out.println("-----------------------");
        }
    }
}

package com.HCInteraction.Backend.Process;

import com.HCInteraction.Backend.Analyze.DriverBehavior;
import com.HCInteraction.Backend.Json.DriverBehavior.Attribute;
import com.HCInteraction.Backend.Json.DriverBehavior.DriverBehaviorJson;
import com.google.gson.Gson;

public class DriverBehaviorProcess {
    public static void main(String[] args) {
        driverBehaviorProcess("driverBehavior.png");
    }

    public static void driverBehaviorProcess(String filePath){
//        String string = "   {\"person_num\":1,\"person_info\":[{\"location\":{\"score\":0.97272092103958,\"top\":208,\"left\":440,\"width\":881,\"height\":837},\"attributes\":{\"both_hands_leaving_wheel\":{\"score\":0.00069990323390812,\"threshold\":0.75},\"eyes_closed\":{\"score\":0.001153111583335,\"threshold\":0.55},\"no_face_mask\":{\"score\":0.99919313192368,\"threshold\":0.75},\"not_buckling_up\":{\"score\":0.000053176099754637,\"threshold\":0.44},\"smoke\":{\"score\":0.00039752901648171,\"threshold\":0.48},\"not_facing_front\":{\"score\":0.00045486097224057,\"threshold\":0.5},\"cellphone\":{\"score\":0.00054980011191219,\"threshold\":0.69},\"yawning\":{\"score\":0.00015613217874488,\"threshold\":0.5},\"head_lowered\":{\"score\":0.00020329295512056,\"threshold\":0.55}}}],\"driver_num\":1,\"log_id\":1469251183326187404}";
        Gson gson = new Gson();
        String string = DriverBehavior.driverBehavior(filePath);
        DriverBehaviorJson driverBehaviorResult = gson.fromJson(string, DriverBehaviorJson.class);

        Attribute bothHandsLeavingWheel = driverBehaviorResult.getPerson_info().get(0).getAttributes().getBoth_hands_leaving_wheel();
        Alert.alert(bothHandsLeavingWheel, "请握紧方向盘，注意行车安全", "holdWheel.mp3", "双手离开方向盘");

        Attribute eyesClose = driverBehaviorResult.getPerson_info().get(0).getAttributes().getEyes_closed();
        Warn.warn(eyesClose, "请勿疲劳驾驶，及时停车休息", "fatigueDriving.mp3", "闭眼");

        Attribute noFaceMask = driverBehaviorResult.getPerson_info().get(0).getAttributes().getNo_face_mask();
        Alert.alert(noFaceMask, "请佩戴口罩，加强疫情防控", "wearMask.mp3", "未佩戴口罩");

        Attribute notBucklingUp = driverBehaviorResult.getPerson_info().get(0).getAttributes().getNot_buckling_up();
        Warn.warn(notBucklingUp, "请系好安全带，注意行车安全", "bucklingUp.mp3", "未系安全带");

        Attribute smoke = driverBehaviorResult.getPerson_info().get(0).getAttributes().getSmoke();
        Alert.alert(smoke, "请不要在车内吸烟，注意公共卫生", "smoke.mp3", "车内吸烟");

        Attribute notFacingFront = driverBehaviorResult.getPerson_info().get(0).getAttributes().getNot_facing_front();
        Warn.warn(notFacingFront, "请目视前方，注意观察路况", "facingFront.mp3", "未看前方");

        Attribute cellphone = driverBehaviorResult.getPerson_info().get(0).getAttributes().getCellphone();
        Alert.alert(cellphone, "请不要在驾驶时接打电话，注意行车安全", "cellphone.mp3", "接打电话");

        Attribute yawning = driverBehaviorResult.getPerson_info().get(0).getAttributes().getYawning();
        Warn.warn(yawning, "请勿疲劳驾驶，及时停车休息", "fatigueDriving.mp3", "打哈欠");

        Attribute headLowered = driverBehaviorResult.getPerson_info().get(0).getAttributes().getHead_lowered();
        Warn.warn(headLowered, "请抬头目视前方，注意观察路况", "headLowered.mp3", "低头");
    }
}
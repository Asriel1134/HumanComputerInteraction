package com.HCInteraction.Backend.Process;

import com.HCInteraction.Backend.Analyze.Gesture;
import com.HCInteraction.Backend.Json.Gesture.GestureJson;
import com.HCInteraction.Backend.Json.Gesture.Result;
import com.google.gson.Gson;

public class GestureProcess {
    public static void main(String[] args) {
        gestureProcess(new  byte[]{});
    }

    public static void gestureProcess(byte[] imgData){
        String result = Gesture.gesture(imgData);
//        String result = "{\"result_num\":1,\"result\":[{\"classname\":\"Two\",\"width\":241,\"probability\":0.8504666090011597,\"height\":267,\"left\":130,\"top\":203}],\"log_id\":1469867234157450739}";
        Gson gson = new Gson();
        GestureJson gestureResult = gson.fromJson(result, GestureJson.class);
        System.out.print("手势：");
        for (Result res: gestureResult.getResult()){
            String ges = res.getClassname();
            if (!"Face".equals(ges)){
                System.out.print(ges);
            }
        }
        System.out.println();
    }
}

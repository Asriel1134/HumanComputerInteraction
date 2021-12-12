package com.HCInteraction.Backend.Analyze;

import com.HCInteraction.Backend.Tools.Request;

/**
 * 驾驶行为分析
 */
public class DriverBehavior {

    public static String driverBehavior(String filePath) {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/image-classify/v1/driver_behavior";
        return Request.request(filePath, url);
    }

    public static void main(String[] args) {
        DriverBehavior.driverBehavior("driverBehavior.png");
    }
}
/*
  {
    "person_num":1,
    "person_info":[
        {
            "location":
                {
                    "score":0.97272092103958,
                    "top":208,
                    "left":440,
                    "width":881,
                    "height":837
                },
            "attributes":
                {
                    "both_hands_leaving_wheel":
                        {
                            "score":0.00069990323390812,
                            "threshold":0.75
                        },
                    "eyes_closed":
                        {
                            "score":0.001153111583335,
                            "threshold":0.55
                        },
                    "no_face_mask":
                        {
                            "score":0.99919313192368,
                            "threshold":0.75
                        },
                    "not_buckling_up":
                        {
                            "score":0.000053176099754637,
                            "threshold":0.44
                        },
                    "smoke":
                        {
                            "score":0.00039752901648171,
                            "threshold":0.48
                        },
                    "not_facing_front":
                        {
                            "score":0.00045486097224057,
                            "threshold":0.5
                        },
                    "cellphone":
                        {
                            "score":0.00054980011191219,
                            "threshold":0.69
                        },
                    "yawning":
                        {
                            "score":0.00015613217874488,
                            "threshold":0.5
                        },
                    "head_lowered":
                        {
                            "score":0.00020329295512056,
                            "threshold":0.55
                        }
                }
        }],
    "driver_num":1,
    "log_id":1469251183326187404
   }

 */
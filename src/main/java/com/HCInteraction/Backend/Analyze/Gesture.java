package com.HCInteraction.Backend.Analyze;

import com.HCInteraction.Backend.Tools.Request;

/**
 * 手势识别
 */
public class Gesture {

    public static String gesture(String filePath) {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/image-classify/v1/gesture";
        return Request.request(filePath, url);
    }

    public static String gesture(byte[] imgData) {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/image-classify/v1/gesture";
        return Request.request(imgData, url);
    }

    public static void main(String[] args) {
        Gesture.gesture("test.png");
    }
}
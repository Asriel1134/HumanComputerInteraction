package com.HCInteraction.Backend.Analyze;

import com.HCInteraction.Backend.Tools.Request;

/**
 * 人体检测和属性识别
 */
public class BodyAttr {

    public static String bodyAttr(String filePath) {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/image-classify/v1/body_attr";
        return Request.request(filePath, url);
    }

    public static void main(String[] args) {
        BodyAttr.bodyAttr("test.png");
    }
}

package com.HCInteraction.Backend.Speech;

import com.baidu.aip.speech.AipSpeech;
import com.baidu.aip.speech.TtsResponse;
import com.baidu.aip.util.Util;
import org.json.JSONObject;

import java.io.IOException;

public class SpeechSynthesis {
    //设置APPID/AK/SK
    public static final String APP_ID = "25051056";
    public static final String API_KEY = "6NWC4BCwobbGteGLhnpR5Srp";
    public static final String SECRET_KEY = "2VPpoSK0iazmVIWDvCvfVRUQhcIEmNGw";

    public static void main(String[] args) {
        speechSynthesis("你好", "output.mp3");
    }

    public static void speechSynthesis(String text, String fileName){
        // 初始化一个AipSpeech
        AipSpeech client = new AipSpeech(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 调用接口
        TtsResponse res = client.synthesis(text, "zh", 1, null);
        byte[] data = res.getData();
        if (data != null) {
            try {
                Util.writeBytesToFileSystem(data, fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

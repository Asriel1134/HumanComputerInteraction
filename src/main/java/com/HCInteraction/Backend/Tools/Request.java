package com.HCInteraction.Backend.Tools;

import com.HCInteraction.Backend.Tools.Base64Util;
import com.HCInteraction.Backend.Tools.FileUtil;
import com.HCInteraction.Backend.Tools.HttpUtil;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static com.HCInteraction.Backend.Tools.AuthService.getAuth;

public class Request {

    public static String request(String filePath, String url){
        try {
            // 本地文件路径
            byte[] imgData = FileUtil.readFileByBytes(filePath);
            String imgStr = Base64Util.encode(imgData);
            String imgParam = URLEncoder.encode(imgStr, StandardCharsets.UTF_8);

            String param = "image=" + imgParam;

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken = getAuth();

            String result = HttpUtil.post(url, accessToken, param);
            System.out.println(result);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String request(byte[] imgData, String url){
        try {
            // 本地文件路径
            String imgStr = Base64Util.encode(imgData);
            String imgParam = URLEncoder.encode(imgStr, StandardCharsets.UTF_8);

            String param = "image=" + imgParam;

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken = getAuth();

            String result = HttpUtil.post(url, accessToken, param);
//            System.out.println(result);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

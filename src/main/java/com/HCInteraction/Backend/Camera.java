package com.HCInteraction.Backend;

import com.HCInteraction.Backend.Analyze.Gesture;
import com.HCInteraction.Backend.Process.GestureProcess;
import org.bytedeco.javacv.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Camera {
    public static void main(String[] args) {
        Camera camera = new Camera();
        try {
            camera.startCamera();
        } catch (InterruptedException | FrameGrabber.Exception e) {
            e.printStackTrace();
        }
    }

    public void startCamera() throws InterruptedException, FrameGrabber.Exception {
        OpenCVFrameGrabber grabber = new OpenCVFrameGrabber(0);
        //开始获取摄像头数据
        grabber.start();
        //新建一个窗口
        CanvasFrame canvas = new CanvasFrame("Camera");
        canvas.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        canvas.setAlwaysOnTop(true);
        File outPut = new File("gesture.jpg");
        int index = 0;
        while (true) {
            //窗口是否关闭
            if (!canvas.isDisplayable()) {
                //停止抓取
                grabber.stop();
                //退出
                System.exit(-1);
            }

            Frame frame = grabber.grab();

            //获取摄像头图像并放到窗口上显示， 这里的Frame frame=grabber.grab(); frame是一帧视频图像
            canvas.showImage(frame);
            if (index % 50 == 0) {
                if (frame != null) {
                    try {
                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        ImageIO.write(FrameToBufferedImage(frame), "jpg", outputStream);
//                        GestureProcess.gestureProcess(outputStream.toByteArray());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            //50毫秒刷新一次图像
            index += 1;
            Thread.sleep(50);
        }
    }

    public static BufferedImage FrameToBufferedImage(Frame frame) {
        //创建BufferedImage对象
        Java2DFrameConverter converter = new Java2DFrameConverter();
        return converter.getBufferedImage(frame);
    }
}

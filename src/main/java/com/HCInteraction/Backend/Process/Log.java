package com.HCInteraction.Backend.Process;

import com.HCInteraction.Backend.Json.DriverBehavior.Attribute;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
    public static void log(Attribute attribute, String logText){
        File log = new File("DriverBehaviorLog.txt");
        try {
            FileWriter fileWriter = new FileWriter(log, true);
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            fileWriter.write("[" + df.format(new Date()) + "] Alert: " + "score:" + attribute.getScore() + " " + logText + "\n");
            System.out.print("[" + df.format(new Date()) + "] Alert: " + "score:" + attribute.getScore() + " " + logText + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.HCInteraction.Backend.Process;

import com.HCInteraction.Backend.Json.DriverBehavior.Attribute;
import com.HCInteraction.Backend.Speech.Play;
import com.HCInteraction.Backend.Speech.SpeechSynthesis;

import java.io.File;

public class Alert {
    public static void alert(Attribute attribute, String text, String filename, String logText){
        if (attribute.getScore() > attribute.getThreshold()){
            Log.log(attribute, logText);

            File file = new File(filename);
            if (!file.exists()) {
                SpeechSynthesis.speechSynthesis(text, filename);
            }
            Play.play(file);

            System.out.println("提醒！");
        }
    }
}

package com.HCInteraction.Backend.Speech;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Play {
    public static void play(File file){
        try {
            try {
                //创建一个输入流
                FileInputStream fileInputStream = new FileInputStream(file);
                //创建一个缓冲流
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                //创建播放器对象，把文件的缓冲流传入进去
                Player player = new Player(bufferedInputStream);
                //调用播放方法进行播放
                player.play();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

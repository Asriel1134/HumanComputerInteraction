package com.HCInteraction.Backend.Process;

import com.HCInteraction.Backend.Analyze.BodyAttr;
import com.HCInteraction.Backend.Json.BodyAttr.Attribute;
import com.HCInteraction.Backend.Json.BodyAttr.BodyAttrJson;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BodyAttrProcess {
    public static void main(String[] args) {
        bodyAttrProcess("person1.jpg");
    }

    public static void bodyAttrProcess(String filePath){
//        String string = "{\"person_num\":1,\"person_info\":[{\"attributes\":{\"orientation\":{\"score\":0.9986967444419861,\"name\":\"正面\"},\"gender\":{\"score\":0.8341051340103149,\"name\":\"男性\"},\"umbrella\":{\"score\":0.9999333620071411,\"name\":\"未打伞\"},\"lower_color\":{\"score\":0.9955822825431824,\"name\":\"黑\"},\"face_mask\":{\"score\":0.9880014061927795,\"name\":\"无口罩\"},\"smoke\":{\"score\":0.9869021177291870,\"name\":\"未吸烟\"},\"bag\":{\"score\":0.9626556038856506,\"name\":\"无背包\"},\"upper_wear\":{\"score\":0.9988799691200256,\"name\":\"长袖\"},\"is_human\":{\"score\":0.9992290735244751,\"name\":\"正常人体\"},\"vehicle\":{\"score\":0.9999706745147705,\"name\":\"无交通工具\"},\"glasses\":{\"score\":0.9999989867210388,\"name\":\"戴眼镜\"},\"headwear\":{\"score\":0.9924598336219788,\"name\":\"无帽\"},\"upper_wear_fg\":{\"score\":0.9100868105888367,\"name\":\"夹克\"},\"upper_wear_texture\":{\"score\":0.6070532202720642,\"name\":\"纯色\"},\"upper_cut\":{\"score\":0.9900062680244446,\"name\":\"无上方截断\"},\"occlusion\":{\"score\":0.9998458623886108,\"name\":\"无遮挡\"},\"lower_cut\":{\"score\":0.9672690629959106,\"name\":\"无下方截断\"},\"cellphone\":{\"score\":0.8716319799423218,\"name\":\"看手机\"},\"carrying_item\":{\"score\":0.9424182176589966,\"name\":\"无手提物\"},\"age\":{\"score\":0.997249424457550,\"name\":\"青年\"},\"lower_wear\":{\"score\":0.9990618824958801,\"name\":\"长裤\"},\"upper_color\":{\"score\":0.9744749665260315,\"name\":\"黑\"}},\"location\":{\"score\":0.9753719568252563,\"top\":428,\"left\":246,\"width\":177,\"height\":496}}],\"log_id\":1469566954750154309}";
        Gson gson = new Gson();
        String string = BodyAttr.bodyAttr(filePath);
        BodyAttrJson bodyAttrResult = gson.fromJson(string, BodyAttrJson.class);

        bodyAttrOutput(bodyAttrResult);
        bodyAttrLog(bodyAttrResult);
    }

    public static void bodyAttrOutput(BodyAttrJson bodyAttrResult){
        System.out.println("乘客信息：");
        System.out.println("性别： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getGender().getName());
        System.out.println("年龄： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getAge().getName());
        System.out.println("上身服饰： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getUpper_wear().getName());
        System.out.println("上身服饰颜色： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getUpper_color().getName());
        System.out.println("上身服饰细分类： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getUpper_wear_fg().getName());
        System.out.println("上身服饰纹理： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getUpper_wear_texture().getName());
        System.out.println("下身服饰： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getLower_wear().getName());
        System.out.println("下身服饰颜色： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getLower_color().getName());
        System.out.println("背包： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getBag().getName());
        System.out.println("帽子： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getHeadwear().getName());
        System.out.println("口罩： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getFace_mask().getName());
        System.out.println("眼镜： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getGlasses().getName());
        System.out.println("打伞： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getUmbrella().getName());
        System.out.println("手机： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getCellphone().getName());
        System.out.println("朝向： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getOrientation().getName());
        System.out.println("吸烟： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getSmoke().getName());
        System.out.println("手提物： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getCarrying_item().getName());
        System.out.println("交通工具： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getVehicle().getName());
        System.out.println("上方截断： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getUpper_cut().getName());
        System.out.println("下方截断： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getLower_cut().getName());
        System.out.println("遮挡情况： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getOcclusion().getName());
        System.out.println("是否是正常人体： " + bodyAttrResult.getPerson_info().get(0).getAttributes().getIs_human().getName());
        System.out.println("-----------------------");
    }

    public static void bodyAttrLog(BodyAttrJson bodyAttrResult){
        File log = new File("BodyAttrLog.txt");
        try {
            FileWriter fileWriter = new FileWriter(log, true);
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            fileWriter.write("[" + df.format(new Date()) + "]");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getGender(), fileWriter, "性别");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getAge(), fileWriter, "年龄");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getUpper_wear(), fileWriter, "上身服饰");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getUpper_color(), fileWriter, "上身服饰颜色");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getUpper_wear_fg(), fileWriter, "上身服饰细分类");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getUpper_wear_texture(), fileWriter, "上身服饰纹理");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getLower_wear(), fileWriter, "下身服饰");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getLower_color(), fileWriter, "下身服饰颜色");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getBag(), fileWriter, "背包");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getHeadwear(), fileWriter, "帽子");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getFace_mask(), fileWriter, "口罩");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getGlasses(), fileWriter, "眼镜");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getUmbrella(), fileWriter, "打伞");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getCellphone(), fileWriter, "手机");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getOrientation(), fileWriter, "朝向");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getSmoke(), fileWriter, "吸烟");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getCarrying_item(), fileWriter, "手提物");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getVehicle(), fileWriter, "交通工具");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getUpper_cut(), fileWriter, "上方截断");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getLower_cut(), fileWriter, "下方截断");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getOcclusion(), fileWriter, "遮挡情况");
            write(bodyAttrResult.getPerson_info().get(0).getAttributes().getIs_human(), fileWriter, "是否是正常人体");
            fileWriter.write("\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write(Attribute attribute, FileWriter fileWriter, String name){
        try {
            fileWriter.write(name + "：" + attribute.getName() + "(" +attribute.getScore() + "),");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

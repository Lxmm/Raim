package com.adcc.raim.Tools;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by lenovo on 2016/12/7.
 */
public class DataTime {

    private static DataTime instance = null;

    public static DataTime getInstance(){
        if(instance == null){
            instance = new DataTime();
        }
        return instance;
    }


    public String getDataTime(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        String dateNowStr = sdf.format(d);
        return dateNowStr;
    }


    public static void main(String[] args) {


    }


}

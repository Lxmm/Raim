package com.adcc.raim.Tools;

import java.sql.Timestamp;
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


    public Timestamp getDataTime(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        String dateNowStr = sdf.format(date);
        Timestamp time = Timestamp.valueOf(dateNowStr);
        return time;
    }



}

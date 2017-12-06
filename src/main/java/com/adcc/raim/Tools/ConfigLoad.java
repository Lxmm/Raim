package com.adcc.raim.Tools;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by WuJD on 2017/8/10.
 */
public class ConfigLoad {
    private static Logger log = Logger.getLogger(ConfigLoad.class);
    public static Properties propertie = null;

    public static void init() {
        // 加载配置文件
        PropertyConfigurator.configure("./config/log4j.properties");
        propertie = new Properties();
        try {
            FileInputStream inputFile = new FileInputStream("./config/config");
            propertie.load(inputFile);
            inputFile.close();
        } catch (FileNotFoundException ex) {
            log.error(ex.getMessage());
            log.error(ex.getCause());
            ex.printStackTrace();
        } catch (IOException ex) {
            log.error(ex.getMessage());
            log.error(ex.getCause());
            ex.printStackTrace();
        }
    }

    public static String getValue(String key) {
        if (propertie == null) {
            init();
        }
        if (propertie.containsKey(key)) {
            String value = propertie.getProperty(key);
            return value;
        } else
            return "";
    }

    public static void main(String[] args) {
        //System.out.println(getValue("ssss"));
    }
}

package com.adcc.raim;


import com.adcc.raim.Tools.ConfigLoad;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * Created by i on 2017/9/22.
 */
/*
@SpringBootApplication 标志启动配置入口，可以发现通过一个main方法启动，使用这个注解的类必须放置于最外层保重，因为默认扫描这个类以下的包。否则需要自己配置@ComponentScan
* */
@SpringBootApplication
@ComponentScan
public class App {
    private static final Logger logger = Logger.getLogger(App.class);

    static {
        try{
            logger.info(ConfigLoad.getValue("LOG_MODE"));

        }catch (Exception e){
            logger.error(e.toString());
        }
    }
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}

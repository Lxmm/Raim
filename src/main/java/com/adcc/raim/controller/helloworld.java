//package com.adcc.raim.controller;
//
//import com.adcc.raim.Tools.LoadYML;
//import com.adcc.raim.service.UserService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.Map;
//
///**
// * Created by i on 2017/10/13.
// */
//
//@Controller
//public class helloworld {
//    private static final Logger logger = Logger.getLogger(helloworld.class);
//    @Autowired
//    private LoadYML myProps;
//    @Autowired
//    private UserService userService;
//
//
//    //首页
//    @RequestMapping(value = "/index")
//    public String index(HttpServletRequest request, Model model){
//        return "index";
//    }
//
//    //简介
//    @RequestMapping(value = "/introduction")
//    public String introduction(HttpServletRequest request, Model model){
//        return "introduction";
//    }
//
//
//    //预测
//    @RequestMapping(value = "/raimintro")
//    public String raimintro(HttpServletRequest request, Model model){
//        return "raimintro";
//    }
//
//
//    //关于我们
//    @RequestMapping(value = "/about")
//    public String about(HttpServletRequest request, Model model){
//        return "about";
//    }
//
//
//    //首页—系统公告
//    @RequestMapping(value = "/systemnoticeList")
//    public String systemnoticeList(HttpServletRequest request, Model model){
//        return "systemnoticeList";
//    }
//
//
//    //首页—系统公告
//    @RequestMapping(value = "/service")
//    public String service(HttpServletRequest request, Model model){
//        return "service";
//    }
//
//
//    //首页—版本声明
//    @RequestMapping(value = "/copyright")
//    public String copyright(HttpServletRequest request, Model model){
//        return "copyright";
//    }
//
//
//    //首页—联系我们
//    @RequestMapping(value = "/contact")
//    public String contact(HttpServletRequest request, Model model){
//        return "contact";
//    }
//
//
//    //关于我们—用户留言
//    @RequestMapping(value = "/guest")
//    public String guest(HttpServletRequest request, Model model){
//        return "guest";
//    }
//
//    //简介—系统结构
//    @RequestMapping(value = "/structure")
//    public String structure(HttpServletRequest request, Model model){
//        return "structure";
//    }
//
//
//    //RAIM预测—GPS卫星状态
//    @RequestMapping(value = "/gpsstate")
//    public String gpsstate(HttpServletRequest request, Model model){
//        return "gpsstate";
//    }
//
//
//    //RAIM预测—机场预测
//    @RequestMapping(value = "/airPort")
//    public String airPort(HttpServletRequest request, Model model){
//        return "airPort";
//    }
//
//
//    //RAIM预测—终端区预测
//    @RequestMapping(value = "/npa")
//    public String npa(HttpServletRequest request, Model model){
//        return "npa";
//    }
//
//
//    //RAIM预测—航线预测
//    @RequestMapping(value = "/fairwayForecast")
//    public String fairwayForecast(HttpServletRequest request, Model model){
//        return "fairwayForecast";
//    }
//
//
//    //RAIM预测—区域预测
//    @RequestMapping(value = "/areaForecast")
//    public String areaForecast(HttpServletRequest request, Model model){
//        return "areaForecast";
//    }
//
//
//    //RAIM预测—关于
//    @RequestMapping(value = "/announce")
//    public String announce(HttpServletRequest request, Model model){
//        return "announce";
//    }
//
//    //关于我们-用户留言—添加留言
//    @RequestMapping(value = "/guestAdd")
//    public String guestAdd(HttpServletRequest request, Model model){
//        return "guestAdd";
//    }
//
//
//    //登录
//    @RequestMapping(value = "/userLogin")
//    public String userLogin(HttpServletRequest request, Model model){
//        return "userLogin";
//    }
//
//    //注册
//    @RequestMapping(value = "/userRegister")
//    public String userRegister(HttpServletRequest request, Model model){
//        return "userRegister";
//    }
//
//
//    @RequestMapping(value = "/")
//    public String index(Map<String,Object> map){
//        logger.info("hello");
//        map.put("strProjectNameEN","DATIS");
//        map.put("strProjectNameCN","数字通播系统");
//        map.put("strDes","欢迎使用数字通播系统");
//        map.put("strVersion","0.1");
//        return "index";
//        //return "bootstriphello.html";
//    }
//
//    @RequestMapping(value = "/login")
//    public String login(){
//        return "login";
//    }
//
//    @RequestMapping(value = "/DatisHome")
//    public String DatisHome(){
//        return "DatisHome";
//    }
//
//    @RequestMapping(value = "/report")
//    public String report(){
//        return "report";
//    }
//
//    @RequestMapping(value = "/setting")
//    public String setting(){
//        return "setting";
//    }
//
//    @RequestMapping(value = "/Search")
//    public String Search(){
//        return "Search";
//    }
//
//    @RequestMapping(value = "/insertPlay")
//    public String insertPlay(){
//        return "insertPlay";
//    }
//
//    public void propsTest() {
//        try{
//            ObjectMapper mapper = new ObjectMapper();
//            System.out.println("simpleProp: " + myProps.getSimpleProp());
//            System.out.println("arrayProps: " + mapper.writeValueAsString(myProps.getArrayProps()));
//            System.out.println("listProp1: " + mapper.writeValueAsString(myProps.getListProp1()));
//            System.out.println("listProp2: " + mapper.writeValueAsString(myProps.getListProp2()));
//            System.out.println("mapProps: " + mapper.writeValueAsString(myProps.getMapProps()));
//
//        }catch (Exception ex){
//        }
//    }
//
//}

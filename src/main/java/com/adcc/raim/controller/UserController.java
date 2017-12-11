package com.adcc.raim.controller;

import com.adcc.raim.Tools.LoadYML;
import com.adcc.raim.entity.User;
import com.adcc.raim.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by i on 2017/10/13.
 */

@Controller
public class UserController {
    private static final Logger logger = Logger.getLogger(UserController.class);
    @Autowired
    private LoadYML myProps;
    @Autowired
    private UserService userService;


    //首页
    @RequestMapping(value = "/index")
    public String index(Model model,HttpSession session){
        String loginname = (String) session.getAttribute("loginname");
        model.addAttribute("loginname",loginname);
         return "index";
    }

    //简介
    @RequestMapping(value = "/introduction")
    public String introduction(HttpSession session, Model model){
        String loginname = (String) session.getAttribute("loginname");
        model.addAttribute("loginname",loginname);
        return "introduction";
    }


    //预测
    @RequestMapping(value = "/raimintro")
    public String raimintro(HttpSession session, Model model){
        String loginname = (String) session.getAttribute("loginname");
        model.addAttribute("loginname",loginname);
        return "raimintro";
    }


    //关于我们
    @RequestMapping(value = "/about")
    public String about(HttpSession session, Model model){
        String loginname = (String) session.getAttribute("loginname");
        model.addAttribute("loginname",loginname);
        return "about";
    }


    //首页—系统公告
    @RequestMapping(value = "/systemnoticeList")
    public String systemnoticeList(HttpSession session, Model model){
        String loginname = (String) session.getAttribute("loginname");
        model.addAttribute("loginname",loginname);
        return "systemnoticeList";
    }


    //首页—系统公告
    @RequestMapping(value = "/service")
    public String service(HttpSession session, Model model){
        String loginname = (String) session.getAttribute("loginname");
        model.addAttribute("loginname",loginname);
        return "service";
    }


    //首页—版本声明
    @RequestMapping(value = "/copyright")
    public String copyright(HttpSession session, Model model){
        String loginname = (String) session.getAttribute("loginname");
        model.addAttribute("loginname",loginname);
        return "copyright";
    }


    //首页—联系我们
    @RequestMapping(value = "/contact")
    public String contact(HttpSession session, Model model){
        String loginname = (String) session.getAttribute("loginname");
        model.addAttribute("loginname",loginname);
        return "contact";
    }


    //关于我们—用户留言
    @RequestMapping(value = "/guest")
    public String guest(HttpSession session, Model model){
        String loginname = (String) session.getAttribute("loginname");
        model.addAttribute("loginname",loginname);
        return "guest";
    }

    //简介—系统结构
    @RequestMapping(value = "/structure")
    public String structure(HttpSession session, Model model){
        String loginname = (String) session.getAttribute("loginname");
        model.addAttribute("loginname",loginname);
        return "structure";
    }


    //RAIM预测—GPS卫星状态
    @RequestMapping(value = "/gpsstate")
    public String gpsstate(HttpSession session, Model model){
        String loginname = (String) session.getAttribute("loginname");
        model.addAttribute("loginname",loginname);
        return "gpsstate";
    }


    //RAIM预测—机场预测
    @RequestMapping(value = "/airPort")
    public String airPort(HttpSession session, Model model){
        String loginname = (String) session.getAttribute("loginname");
        model.addAttribute("loginname",loginname);
        return "airPort";
    }


    //RAIM预测—终端区预测
    @RequestMapping(value = "/npa")
    public String npa(HttpSession session, Model model){
        String loginname = (String) session.getAttribute("loginname");
        model.addAttribute("loginname",loginname);
        return "npa";
    }


    //RAIM预测—航线预测
    @RequestMapping(value = "/fairwayForecast")
    public String fairwayForecast(HttpSession session, Model model){
        String loginname = (String) session.getAttribute("loginname");
        model.addAttribute("loginname",loginname);
        return "fairwayForecast";
    }


    //RAIM预测—区域预测
    @RequestMapping(value = "/areaForecast")
    public String areaForecast(HttpSession session, Model model){
        String loginname = (String) session.getAttribute("loginname");
        model.addAttribute("loginname",loginname);
        return "areaForecast";
    }


    //RAIM预测—关于
    @RequestMapping(value = "/announce")
    public String announce(HttpSession session, Model model){
        String loginname = (String) session.getAttribute("loginname");
        model.addAttribute("loginname",loginname);
        return "announce";
    }

    //关于我们-用户留言—添加留言
    @RequestMapping(value = "/guestAdd")
    public String guestAdd(HttpSession session, Model model){
        String loginname = (String) session.getAttribute("loginname");
        model.addAttribute("loginname",loginname);
        return "guestAdd";
    }


    //登录
    @RequestMapping(value = "/userLogin")
    public String userLogin(HttpSession session, Model model){
        String loginname = (String) session.getAttribute("loginname");
        model.addAttribute("loginname",loginname);
        return "userLogin";
    }

    //注册
    @RequestMapping(value = "/userRegister")
    public String userRegister(HttpSession session, Model model){
        String loginname = (String) session.getAttribute("loginname");
        model.addAttribute("loginname",loginname);
        return "userRegister";
    }


    /**
     * 查询用户
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "/queryAllUserInfo")
    public String queryAllUserInfo(HttpServletRequest request, Model model,HttpSession session){
        List<User> userList = userService.queryAllUserInfo();
//        String userName =userList.get(0).getUsername();
//        model.addAttribute("userName",userName);
        model.addAttribute("userList",userList);
        String loginname = userList.get(0).getUsername();
         session.setAttribute("loginname",loginname);
        return "userList";
    }



    /**
     * 根据用户名密码查询
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findByUserNameAndPassword", method = RequestMethod.POST)
    public Map<String, Object> findByUserNameAndPassword(String loginname,String password,HttpSession session,Model model) {
        Map<String, Object> result = new HashMap<>();
        try {
            //password = UserUtil.MD5(password);

            User user = userService.findByUserNameAndPassword(loginname,password);

            if (user == null) {
                result.put("msg", "账户不存在！");
                return result;
            }

            if(!user.getLoginname().equals(loginname)){
                result.put("msg", "用户名不正确！");
                return result;
            }

            if (!user.getPassword().equals(password)) {
                result.put("msg", "密码不正确！");
                return result;
            }
            result.put("msg", "可以登录");
            model.addAttribute("loginname",loginname);
            session.setAttribute("loginname", loginname);
            return result;
        }catch (Exception e){
            logger.error(e.getStackTrace());
            result.clear();
            result.put("msg", "修改失败!");
        }
        return result;

    }


    /**
     * 注销
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/loginOut", method = RequestMethod.POST)
    public Map<String, Object> loginOut(HttpSession session,Model model) {
        Map<String, Object> result = new HashMap<>();
        try {
            session.removeAttribute("loginname");
            result.put("msg", "succ");
            return result;
        }catch (Exception e){
            logger.error(e.getStackTrace());
            result.put("msg", "err");
            return result;
        }

    }






}

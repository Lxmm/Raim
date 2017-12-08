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
import java.util.Enumeration;
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
        String username = (String) session.getAttribute("username");
        model.addAttribute("username",username);
         return "index";
    }

    //简介
    @RequestMapping(value = "/introduction")
    public String introduction(HttpSession session, Model model){
        String username = (String) session.getAttribute("username");
        model.addAttribute("username",username);
        return "introduction";
    }


    //预测
    @RequestMapping(value = "/raimintro")
    public String raimintro(HttpSession session, Model model){
        String username = (String) session.getAttribute("username");
        model.addAttribute("username",username);
        return "raimintro";
    }


    //关于我们
    @RequestMapping(value = "/about")
    public String about(HttpSession session, Model model){
        String username = (String) session.getAttribute("username");
        model.addAttribute("username",username);
        return "about";
    }


    //首页—系统公告
    @RequestMapping(value = "/systemnoticeList")
    public String systemnoticeList(HttpSession session, Model model){
        String username = (String) session.getAttribute("username");
        model.addAttribute("username",username);
        return "systemnoticeList";
    }


    //首页—系统公告
    @RequestMapping(value = "/service")
    public String service(HttpSession session, Model model){
        String username = (String) session.getAttribute("username");
        model.addAttribute("username",username);
        return "service";
    }


    //首页—版本声明
    @RequestMapping(value = "/copyright")
    public String copyright(HttpSession session, Model model){
        String username = (String) session.getAttribute("username");
        model.addAttribute("username",username);
        return "copyright";
    }


    //首页—联系我们
    @RequestMapping(value = "/contact")
    public String contact(HttpSession session, Model model){
        String username = (String) session.getAttribute("username");
        model.addAttribute("username",username);
        return "contact";
    }


    //关于我们—用户留言
    @RequestMapping(value = "/guest")
    public String guest(HttpSession session, Model model){
        String username = (String) session.getAttribute("username");
        model.addAttribute("username",username);
        return "guest";
    }

    //简介—系统结构
    @RequestMapping(value = "/structure")
    public String structure(HttpSession session, Model model){
        String username = (String) session.getAttribute("username");
        model.addAttribute("username",username);
        return "structure";
    }


    //RAIM预测—GPS卫星状态
    @RequestMapping(value = "/gpsstate")
    public String gpsstate(HttpSession session, Model model){
        String username = (String) session.getAttribute("username");
        model.addAttribute("username",username);
        return "gpsstate";
    }


    //RAIM预测—机场预测
    @RequestMapping(value = "/airPort")
    public String airPort(HttpSession session, Model model){
        String username = (String) session.getAttribute("username");
        model.addAttribute("username",username);
        return "airPort";
    }


    //RAIM预测—终端区预测
    @RequestMapping(value = "/npa")
    public String npa(HttpSession session, Model model){
        String username = (String) session.getAttribute("username");
        model.addAttribute("username",username);
        return "npa";
    }


    //RAIM预测—航线预测
    @RequestMapping(value = "/fairwayForecast")
    public String fairwayForecast(HttpSession session, Model model){
        String username = (String) session.getAttribute("username");
        model.addAttribute("username",username);
        return "fairwayForecast";
    }


    //RAIM预测—区域预测
    @RequestMapping(value = "/areaForecast")
    public String areaForecast(HttpSession session, Model model){
        String username = (String) session.getAttribute("username");
        model.addAttribute("username",username);
        return "areaForecast";
    }


    //RAIM预测—关于
    @RequestMapping(value = "/announce")
    public String announce(HttpSession session, Model model){
        String username = (String) session.getAttribute("username");
        model.addAttribute("username",username);
        return "announce";
    }

    //关于我们-用户留言—添加留言
    @RequestMapping(value = "/guestAdd")
    public String guestAdd(HttpSession session, Model model){
        String username = (String) session.getAttribute("username");
        model.addAttribute("username",username);
        return "guestAdd";
    }


    //登录
    @RequestMapping(value = "/userLogin")
    public String userLogin(HttpSession session, Model model){
        String username = (String) session.getAttribute("username");
        model.addAttribute("username",username);
        return "userLogin";
    }

    //注册
    @RequestMapping(value = "/userRegister")
    public String userRegister(HttpSession session, Model model){
        String username = (String) session.getAttribute("username");
        model.addAttribute("username",username);
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
        String username = userList.get(0).getUsername();
         session.setAttribute("username",username);
        return "userList";
    }

    /**
     * 根据用户名密码查询
     * @return
     */
//    @ResponseBody
//    @RequestMapping(value = "/findByUserNameAndPassword", method = RequestMethod.POST)
//    public Map<String, Object> findByUserNameAndPassword(String username,String password,HttpSession session,Model model) {
//        Map<String, Object> result = new HashMap<>();
//        try {
//            //password = UserUtil.MD5(password);
//            User user = userService.findByUserNameAndPassword(username,password);
//
//            System.out.println(user.getUsername());
//
//            if (user == null) {
//                result.put("msg", "账户不存在！");
//                return result;
//            }
//            if (!user.getPassword().equals(password)) {
//                result.put("msg", "密码不正确！");
//                return result;
//            }
//            result.put("msg", "可以登录");
//            model.addAttribute("username",username);
//            session.setAttribute("username", username);
//            return result;
//        }catch (Exception e){
//            logger.error(e.getStackTrace());
//            result.clear();
//            result.put("msg", "修改失败!");
//        }
//        return result;
//
//    }







    /**
     * 根据用户名密码查询
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findByUserNameAndPassword", method = RequestMethod.POST)
    public Map<String, Object> findByUserNameAndPassword(String username,String password,HttpSession session,Model model) {
        Map<String, Object> result = new HashMap<>();
        try {
            //password = UserUtil.MD5(password);
            User user = userService.findByUserNameAndPassword(username,password);

            System.out.println(user.getUsername());

            if (user == null) {
                result.put("msg", "账户不存在！");
                return result;
            }
            if (!user.getPassword().equals(password)) {
                result.put("msg", "密码不正确！");
                return result;
            }
            result.put("msg", "可以登录");
            model.addAttribute("username",username);
            session.setAttribute("username", username);
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
    public Map<String, Object> index2(HttpSession session,Model model,String loginname) {
        Map<String, Object> result = new HashMap<>();
        try {
            result.put("msg", "succ");
            userLogout(loginname);
            return result;
        }catch (Exception e){
            logger.error(e.getStackTrace());
            result.put("msg", "err");
            return result;
        }

    }


    /**
     * 每一个用户存放一个session。便于各种操作！！！(解决用户重复登录的问题)
     */
    public static Map<String, HttpSession> mapSession = new HashMap<String,HttpSession>();
    public static void userLogout(String username){
        if(mapSession.get(username)!=null){
            //得到需要退出的用户的session
            HttpSession session = mapSession.get(username);
            //在map<username,session>中移除该用户，记住想要退出该用户，必须将该session废除或是remove掉user
            mapSession.remove(username);
            //得到session的所属性合集
            Enumeration e = session.getAttributeNames();
            //删除所有属性
            while(e.hasMoreElements()){
                String sessionName = (String) e.nextElement();
                session.removeAttribute(sessionName);
            }
            //废除该session
            session.invalidate();
        }
    }



}

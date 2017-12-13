package com.adcc.raim.controller;

import com.adcc.raim.Tools.LoadYML;
import com.adcc.raim.Tools.UserUtil;
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
import java.text.SimpleDateFormat;
import java.util.*;

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
            password = UserUtil.MD5(password);
            User user = userService.findByUserNameAndPassword(loginname,password);

            if (user == null || user.equals("")) {
                result.put("msg", "账户不存在！");
                return result;
            }else {
                //审批结果(-1：审批中,0：未通过审批,1：通过审批)
                if(user.getAuditresult()==-1){
                    result.put("msg", "只有通过审批的行业用户可以登录！");
                }else if(user.getAuditresult()==0){
                    result.put("msg", "只有通过审批的行业用户可以登录！");
                }else {
                    //user.getAuditresult()==1通过审核的成功跳转到页面
                    result.put("msg", "succ");
                    model.addAttribute("loginname",loginname);
                    session.setAttribute("loginname", loginname);
                }
            }
            return result;
        }catch (Exception e){
            logger.error(e.getMessage());
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



    /**
     * 根据用户名查询
     * @return
     */
    @RequestMapping(value = "/findByName")
    public String findByName(HttpSession session,Model model) {
        try {
            String loginname = (String) session.getAttribute("loginname");
            User user = userService.findByName(loginname);
            String username = user.getUsername();
            String company = user.getCompany();
            String job =user.getJob();
            String telephone = user.getTelephone();
            String mobile = user.getMobile();
            String address = user.getAddress();
            String zip = user.getZip();
            String mail = user.getMail();
            //获取时间，并转换为String类型
            Date regdatetime = user.getRegdate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
            String regdate = sdf.format(regdatetime);
            //用户类型(-1：管理员,0：注册用户,1：行业用户,2：webservice用户)
            int usertypeone = user.getUsertype();
            String usertype ="";
            if(usertypeone==-1){
                usertype="管理员";
            }else if (usertypeone==0){
                usertype="注册用户";
            }else if (usertypeone==1){
                usertype="行业用户";
            }else if (usertypeone==2){
                usertype="webservice用户";
            }
            //审批结果(-1：审批中,0：未通过审批,1：通过审批)
            int auditresultone = user.getAuditresult();
            String auditresult = "";
            if(auditresultone==-1){
                auditresult="审批中";
            }else if (auditresultone==0){
                auditresult="未通过审批";
            }else if (auditresultone==1){
                auditresult="通过审批";
            }

            model.addAttribute("loginname",loginname);
            model.addAttribute("username",username);
            model.addAttribute("company",company);
            model.addAttribute("job",job);
            model.addAttribute("telephone",telephone);
            model.addAttribute("mobile",mobile);
            model.addAttribute("address",address);
            model.addAttribute("zip",zip);
            model.addAttribute("mail",mail);
            model.addAttribute("regdate",regdate);
            model.addAttribute("usertype",usertype);
            model.addAttribute("auditresult",auditresult);
            return "userLoginSuccess";
        }catch (Exception e){
            logger.error(e.getMessage());
            return "error";
        }

    }



    /**
     * 根据用户名查询
     * @return
     */
    @RequestMapping(value = "/userUpdate")
    public String userUpdate(HttpSession session,Model model) {
        try {
            String loginname = (String) session.getAttribute("loginname");
            User user = userService.findByName(loginname);
            String username = user.getUsername();
            String company = user.getCompany();
            String job =user.getJob();
            String telephone = user.getTelephone();
            String mobile = user.getMobile();
            String address = user.getAddress();
            String zip = user.getZip();
            String mail = user.getMail();

            model.addAttribute("loginname",loginname);
            model.addAttribute("username",username);
            model.addAttribute("company",company);
            model.addAttribute("job",job);
            model.addAttribute("telephone",telephone);
            model.addAttribute("mobile",mobile);
            model.addAttribute("address",address);
            model.addAttribute("zip",zip);
            model.addAttribute("mail",mail);

            return "userUpdate";
        }catch (Exception e){
            logger.error(e.getMessage());
            return "error";
        }

    }



    /**
     * 修改
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/userUpdateCommit", method = RequestMethod.POST)
    public Map<String, Object> userUpdateCommit(HttpSession session,Model model,String username,String company,String job,String telephone,String mobile,String address,String zip,String mail) {
        Map<String, Object> result = new HashMap<>();
        try {
            String loginname = (String) session.getAttribute("loginname");
            int result1 = userService.userUpdate(username,company,job,telephone,mobile,address,zip,mail,loginname);
            if(result1>0){
                result.put("msg", "succ");
            }else {
                result.put("msg", "err");
            }
            return result;
        }catch (Exception e){
            logger.error(e.getMessage());
            result.put("msg", "err");
            return result;
        }

    }



    /**
     * 跳转到修改密码的页面
     * @return
     */
    @RequestMapping(value = "/updatePass")
    public String updatePass(HttpSession session,Model model) {
        try {
            String loginname = (String) session.getAttribute("loginname");
            model.addAttribute("loginname",loginname);
            return "userPassUpdate";
        }catch (Exception e){
            logger.error(e.getMessage());
            return "error";
        }

    }


    /**
     * 修改密码
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/userPassUpdate", method = RequestMethod.POST)
    public Map<String, Object> userPassUpdate(HttpSession session,Model model,String tbOldPass,String tbNewPass,String tbNewPass2) {
        Map<String, Object> result = new HashMap<>();
        try {
            tbOldPass = UserUtil.MD5(tbOldPass);
            String loginname = (String) session.getAttribute("loginname");
            User user= userService.findByName(loginname);
            if(user.getPassword().equals(tbOldPass)){
                if(tbNewPass.equals(tbNewPass2)){
                    tbNewPass = UserUtil.MD5(tbNewPass);
                    int result1 = userService.userPassUpdate(tbNewPass,loginname);
                    if(result1>0){
                        result.put("msg", "succ");
                    }else {
                        result.put("msg", "修改失败！");
                    }
                }else {
                    result.put("msg", "两次输入的新密码不一致,请重新输入！");
                }
            }else {
                result.put("msg", "旧密码不正确，请重新输入！");
            }
            return result;
        }catch (Exception e){
            logger.error(e.getMessage());
            result.put("msg", "err");
            return result;
        }

    }



}

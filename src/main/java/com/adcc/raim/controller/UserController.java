package com.adcc.raim.controller;

import com.adcc.raim.Tools.LoadYML;
import com.adcc.raim.Tools.UUIDgenerator;
import com.adcc.raim.Tools.UserUtil;
import com.adcc.raim.entity.User;
import com.adcc.raim.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

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
    public ModelAndView index(HttpSession session){
        ModelAndView result =new ModelAndView("index");
        String loginname = (String) session.getAttribute("loginname");
        result.addObject("loginname",loginname);
         return result;
    }

    //简介
    @RequestMapping(value = "/introduction")
    public ModelAndView introduction(HttpSession session){
        ModelAndView result =new ModelAndView("introduction");
        String loginname = (String) session.getAttribute("loginname");
        result.addObject("loginname", loginname);
        return result;
    }


    //预测
    @RequestMapping(value = "/raimintro")
    public ModelAndView raimintro(HttpSession session){
        ModelAndView result =new ModelAndView("raimintro");
        String loginname = (String) session.getAttribute("loginname");
        result.addObject("loginname", loginname);
        return result;
    }


    //关于我们
    @RequestMapping(value = "/about")
    public ModelAndView about(HttpSession session){
        ModelAndView result =new ModelAndView("about");
        String loginname = (String) session.getAttribute("loginname");
        result.addObject("loginname", loginname);
        return result;
    }


    //首页—系统公告
    @RequestMapping(value = "/systemnoticeList")
    public ModelAndView systemnoticeList(HttpSession session){
        ModelAndView result =new ModelAndView("systemnoticeList");
        String loginname = (String) session.getAttribute("loginname");
        result.addObject("loginname",loginname);
        return result;
    }


    //首页—系统公告
    @RequestMapping(value = "/service")
    public ModelAndView service(HttpSession session){
        ModelAndView result =new ModelAndView("service");
        String loginname = (String) session.getAttribute("loginname");
        result.addObject("loginname", loginname);
        return result;
    }


    //首页—版本声明
    @RequestMapping(value = "/copyright")
    public ModelAndView copyright(HttpSession session){
        ModelAndView result =new ModelAndView("copyright");
        String loginname = (String) session.getAttribute("loginname");
        result.addObject("loginname", loginname);
        return result;
    }


    //首页—联系我们
    @RequestMapping(value = "/contact")
    public ModelAndView contact(HttpSession session){
        ModelAndView result =new ModelAndView("contact");
        String loginname = (String) session.getAttribute("loginname");
        result.addObject("loginname",loginname);
        return result;
    }


    //关于我们—用户留言
    @RequestMapping(value = "/guest")
    public ModelAndView guest(HttpSession session){
        ModelAndView result =new ModelAndView("guest");
        String loginname = (String) session.getAttribute("loginname");
        result.addObject("loginname", loginname);
        return result;
    }

    //简介—系统结构
    @RequestMapping(value = "/structure")
    public ModelAndView structure(HttpSession session){
        ModelAndView result =new ModelAndView("structure");
        String loginname = (String) session.getAttribute("loginname");
        result.addObject("loginname", loginname);
        return result;
    }


    //RAIM预测—GPS卫星状态
    @RequestMapping(value = "/gpsstate")
    public ModelAndView gpsstate(HttpSession session){
        ModelAndView result =new ModelAndView("gpsstate");
        String loginname = (String) session.getAttribute("loginname");
        result.addObject("loginname", loginname);
        return result;
    }


    //RAIM预测—机场预测
    @RequestMapping(value = "/airPort")
    public ModelAndView airPort(HttpSession session){
        ModelAndView result =new ModelAndView("airPort");
        String loginname = (String) session.getAttribute("loginname");
        result.addObject("loginname", loginname);
        return result;
    }


    //RAIM预测—终端区预测
    @RequestMapping(value = "/npa")
    public ModelAndView npa(HttpSession session){
        ModelAndView result =new ModelAndView("npa");
        String loginname = (String) session.getAttribute("loginname");
        result.addObject("loginname", loginname);
        return result;
    }


    //RAIM预测—航线预测
    @RequestMapping(value = "/fairwayForecast")
    public ModelAndView fairwayForecast(HttpSession session){
        ModelAndView result =new ModelAndView("fairwayForecast");
        String loginname = (String) session.getAttribute("loginname");
        result.addObject("loginname", loginname);
        return result;
    }


    //RAIM预测—区域预测
    @RequestMapping(value = "/areaForecast")
    public ModelAndView areaForecast(HttpSession session){
        ModelAndView result =new ModelAndView("areaForecast");
        String loginname = (String) session.getAttribute("loginname");
        result.addObject("loginname", loginname);
        return result;
    }


    //RAIM预测—关于
    @RequestMapping(value = "/announce")
    public ModelAndView announce(HttpSession session){
        ModelAndView result =new ModelAndView("announce");
        String loginname = (String) session.getAttribute("loginname");
        result.addObject("loginname", loginname);
        return result;
    }

    //关于我们-用户留言—添加留言
    @RequestMapping(value = "/guestAdd")
    public ModelAndView guestAdd(HttpSession session){
        ModelAndView result =new ModelAndView("guestAdd");
        String loginname = (String) session.getAttribute("loginname");
        result.addObject("loginname", loginname);
        return result;
    }


    //登录
    @RequestMapping(value = "/userLogin")
    public ModelAndView userLogin(HttpSession session){
        ModelAndView result =new ModelAndView("userLogin");
        String loginname = (String) session.getAttribute("loginname");
        result.addObject("loginname", loginname);
        return result;
    }

    //注册
    @RequestMapping(value = "/userRegister")
    public ModelAndView userRegister(HttpSession session){
        ModelAndView result =new ModelAndView("userRegister");
        String loginname = (String) session.getAttribute("loginname");
        result.addObject("loginname",loginname);
        return result;
    }


    /**
     * 查询用户
     * @param request
     * @param model
     * @return
     */
//    @RequestMapping(value = "/queryAllUserInfo")
//    public String queryAllUserInfo(HttpServletRequest request, Model model,HttpSession session){
//        List<User> userList = userService.queryAllUserInfo();
////        String userName =userList.get(0).getUsername();
////        model.addAttribute("userName",userName);
//        model.addAttribute("userList",userList);
//        String loginname = userList.get(0).getUsername();
//        session.setAttribute("loginname",loginname);
//        return "userList";
//    }



    /**
     * 根据用户名密码查询（登录）
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findByUserNameAndPassword", method = RequestMethod.POST)
    public ModelMap findByUserNameAndPassword(String loginname,String password,HttpSession session) {
        ModelMap result = new ModelMap();
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
    public ModelMap loginOut(HttpSession session) {
        ModelMap result = new ModelMap();
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
     * 根据用户名查询（点击用户名，查看用户信息）
     * @return
     */
    @RequestMapping(value = "/findByName")
    public ModelAndView findByName(HttpSession session) {
        ModelAndView result;
        try {
            result =new ModelAndView("userLoginSuccess");
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

            result.addObject("loginname", loginname);
            result.addObject("username", username);
            result.addObject("company", company);
            result.addObject("job", job);
            result.addObject("telephone", telephone);
            result.addObject("mobile", mobile);
            result.addObject("address", address);
            result.addObject("zip", zip);
            result.addObject("mail", mail);
            result.addObject("regdate", regdate);
            result.addObject("usertype", usertype);
            result.addObject("auditresult", auditresult);
            return result;
        }catch (Exception e){
            result =new ModelAndView("error");
            logger.error(e.getMessage());
            return result;
        }

    }



    /**
     * 根据用户名查询(修改用户信息)
     * @return
     */
    @RequestMapping(value = "/userUpdate")
    public ModelAndView userUpdate(HttpSession session) {
        ModelAndView result;
        try {
            result =new ModelAndView("userUpdate");
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

            result.addObject("loginname", loginname);
            result.addObject("username", username);
            result.addObject("company", company);
            result.addObject("job", job);
            result.addObject("telephone", telephone);
            result.addObject("mobile", mobile);
            result.addObject("address", address);
            result.addObject("zip", zip);
            result.addObject("mail", mail);
            return result;
        }catch (Exception e){
            result =new ModelAndView("error");
            logger.error(e.getMessage());
            return result;
        }

    }


    /**
     * 修改
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/userUpdateCommit", method = RequestMethod.POST)
    public ModelMap userUpdateCommit(HttpSession session,String username,String company,String job,String telephone,String mobile,String address,String zip,String mail) {
        ModelMap result = new ModelMap();
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
    public  ModelAndView  updatePass(HttpSession session,Model model) {
        ModelAndView result;
        try {
            result= new  ModelAndView("userPassUpdate");
            String loginname = (String) session.getAttribute("loginname");
            model.addAttribute("loginname",loginname);
            return result;
        }catch (Exception e){
            result= new  ModelAndView("error");
            logger.error(e.getMessage());
            return result;
        }

    }


    /**
     * 修改密码
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/userPassUpdate", method = RequestMethod.POST)
    public ModelMap userPassUpdate(HttpSession session,String tbOldPass,String tbNewPass,String tbNewPass2) {
        ModelMap result = new ModelMap();
        try {
            String loginname = (String) session.getAttribute("loginname");
            User user= userService.findByName(loginname);
            if (!tbOldPass.equals(tbNewPass)){
                tbOldPass = UserUtil.MD5(tbOldPass);
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
            }else {
                result.put("msg", "旧密码和新密码不能相同！");
            }
            return result;
        }catch (Exception e){
            logger.error(e.getMessage());
            result.put("msg", "err");
            return result;
        }

    }


    /**
     * 注册
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/userRegister", method = RequestMethod.POST)
    public ModelMap userRegister(User user) {
        ModelMap result = new ModelMap();
        try {
            user.setUserid(UUIDgenerator.generateUuid());
            user.getUsertype();
            int result1 = userService.userRegister(user);
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



}

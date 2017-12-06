package com.adcc.raim.controller;

import com.adcc.raim.Tools.LoadYML;
import com.adcc.raim.entity.User;
import com.adcc.raim.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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

    @RequestMapping(value = "/queryAllUserInfo")
    public String queryAllUserInfo(HttpServletRequest request, Model model){

        List<User> userList = userService.queryAllUserInfo();
        model.addAttribute("userList",userList);
        return "userList";
    }



}

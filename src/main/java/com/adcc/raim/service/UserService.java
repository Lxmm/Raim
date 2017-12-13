package com.adcc.raim.service;

import com.adcc.raim.dao.UserDAO;
import com.adcc.raim.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by i on 2017/10/17.
 */
@Service
public class UserService {
    @Autowired
    public UserDAO userDAO;

    public List<User> queryAllUserInfo(){
        return userDAO.queryAllUserInfo();
    }

    public User findByUserNameAndPassword(String loginname,String password){
        return userDAO.findByUserNameAndPassword(loginname,password);
    }

    public User findByName(String loginname){
        return userDAO.findByName(loginname);
    }

    public int userUpdate(String username,String company,String job,String telephone,String mobile,String address,String zip,String mail,String loginname){
        return userDAO.userUpdate(username,company,job,telephone,mobile,address,zip,mail,loginname);
    }

    public int userPassUpdate(String tbNewPass,String loginname){
        return userDAO.userPassUpdate(tbNewPass, loginname);
    }

}

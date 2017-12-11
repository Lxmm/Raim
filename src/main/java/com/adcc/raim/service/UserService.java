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

    public User findByUserNameAndPassword(String username,String password){
        return userDAO.findByUserNameAndPassword(username,password);
    }

    public User queryUserByName(String username){
        return userDAO.queryUserByName(username);
    }


}

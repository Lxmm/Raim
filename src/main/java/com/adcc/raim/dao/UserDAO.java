package com.adcc.raim.dao;

import com.adcc.raim.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by i on 2017/10/17.
 */
@Repository
@Mapper
public interface UserDAO {
    List<User> queryAllUserInfo();
}
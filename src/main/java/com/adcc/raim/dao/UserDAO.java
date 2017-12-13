package com.adcc.raim.dao;

import com.adcc.raim.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by i on 2017/10/17.
 */
@Repository
@Mapper
public interface UserDAO {
    List<User> queryAllUserInfo();

    User findByUserNameAndPassword(@Param("loginname")String loginname,@Param("password")String password);

    User findByName(@Param("loginname")String loginname);

    int userUpdate(@Param("username")String username,@Param("company")String company,@Param("job")String job,@Param("telephone")String telephone,@Param("mobile")String mobile,@Param("address")String address,@Param("zip")String zip,@Param("mail")String mail,@Param("loginname")String loginname);

    int userPassUpdate(@Param("tbNewPass")String tbNewPass,@Param("loginname")String loginname);

    int userRegister(User user);

}

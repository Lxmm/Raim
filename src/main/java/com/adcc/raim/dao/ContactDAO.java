package com.adcc.raim.dao;

import com.adcc.raim.entity.Contact;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by i on 2017/10/17.
 */
@Repository
@Mapper
public interface ContactDAO {

    List<Contact> queryAllContact();

}

package com.adcc.raim.service;

import com.adcc.raim.dao.ContactDAO;
import com.adcc.raim.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by i on 2017/10/17.
 */
@Service
public class ContactService {
    @Autowired
    public ContactDAO contactDAO;

    public List<Contact> queryAllContact(){
        return contactDAO.queryAllContact();
    }


}

package com.adcc.raim.controller;

import com.adcc.raim.entity.Contact;
import com.adcc.raim.service.ContactService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by i on 2017/10/13.
 */

@Controller
public class ContactController {
    private static final Logger logger = Logger.getLogger(ContactController.class);
    @Autowired
    private ContactService contactService;


    /**
     * 查询联系人
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "/queryAllContact")
    public String queryAllContact(HttpServletRequest request, Model model,HttpSession session){
        try {
            List<Contact> contactList = contactService.queryAllContact();
            String corpname = contactList.get(0).getCorpname();
            String address =  contactList.get(0).getAddress();
            String zip =  contactList.get(0).getZip();
            String phone =  contactList.get(0).getPhone();
            String fax =  contactList.get(0).getFax();
            String email =  contactList.get(0).getEmail();
            String www =  contactList.get(0).getWww();
            model.addAttribute("corpname",corpname);
            model.addAttribute("address",address);
            model.addAttribute("zip",zip);
            model.addAttribute("phone",phone);
            model.addAttribute("fax",fax);
            model.addAttribute("email",email);
            model.addAttribute("www",www);
            return "contact";
        }catch (Exception e){
            logger.error(e.getMessage());
            return "error";
        }

    }








}

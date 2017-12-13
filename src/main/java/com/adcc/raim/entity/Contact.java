package com.adcc.raim.entity;

/**
 * Created by i on 2017/10/17.
 */
public class Contact {
    private String contactid ;        // 联系人编码
    private String corpname;   //企业名称
    private String address;    // 地址
    private String zip;    // 邮件
    private String phone;    // 电话
    private String fax;    // 传真
    private String email;    // 邮件
    private String www;    // 网址


    public Contact(){

    }

    public Contact(String contactid, String corpname, String address, String zip, String phone, String fax, String email, String www) {
        this.contactid = contactid;
        this.corpname = corpname;
        this.address = address;
        this.zip = zip;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.www = www;
    }


    public String getContactid() {
        return contactid;
    }

    public void setContactid(String contactid) {
        this.contactid = contactid;
    }

    public String getCorpname() {
        return corpname;
    }

    public void setCorpname(String corpname) {
        this.corpname = corpname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWww() {
        return www;
    }

    public void setWww(String www) {
        this.www = www;
    }
}

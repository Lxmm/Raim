package com.adcc.raim.entity;

import java.util.Date;

/**
 * Created by i on 2017/10/17.
 */
public class User {
    private String userid ;        // id
    private String loginname;   //用户名（登录名）
    private String username;    // 用户名
    private String password;    // 密码
    private String company;    // 工作单位
    private String job;    // 职务
    private String telephone;    // 电话号码
    private String mobile;    // 手机号码
    private String address;    // 地址
    private String zip;    // 邮政编码
    private String mail;    // 电子邮箱
    private Integer usertype;    // 用户类型(-1：管理员,0：注册用户,1：行业用户,2：webservice用户)
    private Date regdate;    // 注册日期
    private Date appdate;    // 申请日期
    private Integer auditresult;    // 审批结果(-1：审批中,0：未通过审批,1：通过审批)
    private String auditcomment;    // 审批备注(审批未通过/通过的原因说明)
    private Date auditdate;    // 审批日期(注册用户通过审批成为行业用户的日期时间)
    private Integer userstate;    // 用户状态

    public User(){

    }

    public User(String userid, String loginname, String username, String password, String company, String job, String telephone, String mobile, String address, String zip, String mail, Integer usertype, Date regdate, Date appdate, Integer auditresult, String auditcomment, Date auditdate, Integer userstate) {
        this.userid = userid;
        this.loginname = loginname;
        this.username = username;
        this.password = password;
        this.company = company;
        this.job = job;
        this.telephone = telephone;
        this.mobile = mobile;
        this.address = address;
        this.zip = zip;
        this.mail = mail;
        this.usertype = usertype;
        this.regdate = regdate;
        this.appdate = appdate;
        this.auditresult = auditresult;
        this.auditcomment = auditcomment;
        this.auditdate = auditdate;
        this.userstate = userstate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public Date getAppdate() {
        return appdate;
    }

    public void setAppdate(Date appdate) {
        this.appdate = appdate;
    }

    public Integer getAuditresult() {
        return auditresult;
    }

    public void setAuditresult(Integer auditresult) {
        this.auditresult = auditresult;
    }

    public String getAuditcomment() {
        return auditcomment;
    }

    public void setAuditcomment(String auditcomment) {
        this.auditcomment = auditcomment;
    }

    public Date getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }

    public Integer getUserstate() {
        return userstate;
    }

    public void setUserstate(Integer userstate) {
        this.userstate = userstate;
    }
}

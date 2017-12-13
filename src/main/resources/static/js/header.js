
$(function(){
    //登录用户，页面显示登录注册还是成功登录后的用户名和注销
    var loginname= $("#loginname").val();
    if(loginname==null || typeof(loginname) == "undefined" || loginname ==""){
        $("#bCount").append("<span id='weMenu1_lbCount'></span>");
        $("#loginRegister").append("<a href='userLogin.html' id='weMenu1_alogin'>登录 </a>&nbsp;&nbsp;<a href='userRegister.html' id='weMenu1_aregedit'>注册</a>&nbsp;&nbsp;");
    }else{
        $("#bCount").append("<span id='weMenu1_lbCount'>666</span>");
        //$("#loginRegister").append("<a id='weMenu1_lbuserName' href='#'><span th:text=");
        //$("#loginRegister").append(loginname);
        //$("#loginRegister").append("/></a> &nbsp;&nbsp; <a id='weMenu1_lbRegedit' href=''>注销</a>");

        $("#loginRegister").append("<a id='weMenu1_lbuserName' href='/findByName'>"+ loginname + "</a> &nbsp;&nbsp; <a id='weMenu1_lbRegedit' href=''>注销</a>");

    }

    /**
     * 点击注销按钮
     */
    $("#weMenu1_lbRegedit").click(function(){
        $.ajax({
            type: 'POST',
            async: true,  //同步请求
            url: '/loginOut',
            dataType: "json",
            success: function (data) {
                var msg = data.msg;
                if(msg=="succ"){
                    //如果注销成功
                    window.location.href = "/userLogin";
                }else{
                    //失败
                    window.location.href = "/error";
                }

            },
            error: function () {
                //出错
                window.location.href = "/error";
            }
        });
    });





});
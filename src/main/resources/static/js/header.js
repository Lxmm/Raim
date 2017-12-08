
$(function(){
    var loginname= $("#loginname").val();
    if(loginname==null || typeof(loginname) == "undefined" || loginname ==""){
        document.getElementById("RegisterAndCount").style.display="block";
        document.getElementById("RegisterAndCount1").style.display="none";
    }else{
        document.getElementById("RegisterAndCount").style.display="none";
        document.getElementById("RegisterAndCount1").style.display="block";
    }



    $("#weMenu1_lbRegedit").click(function(){

        var loginname = $("#loginname").val();
        $.ajax({
            type: 'POST',
            async: true,  //同步请求
            url: '/loginOut',
            data: {'loginname':loginname},
            dataType: "json",
            success: function (data) {
                var msg = data.msg;
                if(msg=="succ"){
                    //成功
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
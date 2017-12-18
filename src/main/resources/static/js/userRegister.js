function userRegister() {
    $.ajax({
        url: "/userRegister",
        type: "post",
        data: $('#form1').serialize(),
        cache: false,
        async: false,
        dataType: "json",
        success: function (data) {
            var msg = data.msg;
            if (msg == "succ") {
                alert("修改成功！");
                window.location.href = "/userLogin";
            }else {
                alert("修改失败！");
                window.location.href = "/error";
            }
        },
        error: function () {
            alert("登录异常，请稍后重试!");
        }
    });


}

function userLogin() {

    var loginname = $("#username").val();
    var password = $("#password").val();

    if (loginname == "") {
        alert("用户名不能为空！");
        return;
    }
    if (password == "") {
        alert("密码不能为空！");
        return;
    }

    $.ajax({
        url: "/findByUserNameAndPassword",
        type: "post",
        async: false,
        data: {"loginname": loginname, "password": password},
        dataType: "json",
        success: function (data) {
            var msg = data.msg;
            if (msg == "可以登录") {
                window.location.href = "/index";
            }else {
                alert(msg);
            }
        },
        error: function () {
            alert("登录异常，请稍后重试!");
        }
    });


}

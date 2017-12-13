function userLogin() {

    var loginname = $("#username").val().trim();
    var password = $("#password").val().trim();

    if (loginname == "") {
        $("#lberrorinfos").empty();
        $("#lberrorinfos").append("用户名不能为空！");
        return;
    }
    if (password == "") {
        $("#lberrorinfos").empty();
        $("#lberrorinfos").append("密码不能为空！");
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
            if (msg == "succ") {
                window.location.href = "/index";
            }else {
                $("#lberrorinfos").empty();
                $("#lberrorinfos").append(msg);
                return;
            }
        },
        error: function () {
            alert("登录异常，请稍后重试!");
        }
    });


}

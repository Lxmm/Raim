function userUpdate() {

    $.ajax({
        url: "/userUpdate",
        type: "post",
        async: false,
        data: $('#form1').serialize(),
        dataType: "json",
        success: function (data) {
            var msg = data.msg;
            if (msg == "succ") {
                alert("修改成功！");
                window.location.href = "/findByName";
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

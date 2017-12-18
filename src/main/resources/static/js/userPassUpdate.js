function userPassUpdate() {

    var tbOldPass = $("#tbOldPass").val().trim();
    var tbNewPass = $("#tbNewPass").val().trim();
    var tbNewPass2 = $("#tbNewPass2").val().trim();

    if(tbOldPass==""){
        $("#lbError").empty();
        $("#lbError").append("原密码不能为空！");
        return;
    }

    if(tbNewPass==""){
        $("#lbError").empty();
        $("#lbError").append("请输入新密码！ ");
        return;
    }

    if(tbNewPass2==""){
        $("#lbError").empty();
        $("#lbError").append("确认密码不能为空！");
        return;
    }

    $.ajax({
        url: "/userPassUpdate",
        type: "post",
        async: false,
        data: {"tbOldPass": tbOldPass,"tbNewPass": tbNewPass,"tbNewPass2": tbNewPass2},
        dataType: "json",
        success: function (data) {
            var msg = data.msg;
            if (msg == "succ") {
                alert("修改密码成功！");
                window.location.href = "/userLogin";
            }else{
                $("#lbError").empty();
                $("#lbError").append(msg);
            }
        },
        error: function () {
            alert("登录异常，请稍后重试!");
        }
    });





}

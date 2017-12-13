function userRegister() {

    var loginname = $("#txtLoginName").val().trim();
    var tbPassword1 = $("#tbPassword1").val().trim();
    var tbPassword2 = $("#tbPassword2").val().trim();
    var username = $("#tbTrueName").val().trim();
    var company = $("#tbUnit").val().trim();
    var job = $("#txtTitle").val().trim();
    var telephone = $("#tbPhoneNamber").val().trim();
    var mobile = $("#tbMobleNamber").val().trim();
    var address = $("#tbAdress").val().trim();
    var zip = $("#txtZip").val().trim();
    var mail = $("#tbEmaill").val().trim();


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

function userUpdateCommit() {

    var username = $("#tbTrueName").val().trim();
    var company = $("#tbUnit").val().trim();
    var job = $("#txtTitle").val().trim();
    var telephone = $("#tbPhoneNamber").val().trim();
    var mobile = $("#tbMobleNamber").val().trim();
    var address = $("#tbAdress").val().trim();
    var zip = $("#txtZip").val().trim();
    var mail = $("#tbEmaill").val().trim();

    $.ajax({
        url: "/userUpdateCommit",
        type: "post",
        async: false,
        data: {"username": username, "company": company ,"job": job, "telephone": telephone, "mobile": mobile, "address": address, "zip": zip, "mail": mail},
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

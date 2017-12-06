$(document).ready(function () {
    $("#weatherInfo").show();
    $("#addInfo").hide();
    $("#playContent").hide();
    $("#orgin").show();
    $("#playMessage").hide();
    $("#ACARSMessage").hide();
});

function showWeatherInfo(e) {
    $(".TabName div").removeClass("active");
    $(e).addClass("active");
    $("#weatherInfo").show();
    $("#addInfo").hide();
    $("#playContent").hide();
}

function showAddInfo(e) {
    $(".TabName div").removeClass("active");
    $(e).addClass("active");
    $("#weatherInfo").hide();
    $("#addInfo").show();
    $("#playContent").hide();
}

function showPlayContent(e) {
    $(".TabName div").removeClass("active");
    $(e).addClass("active");
    $("#weatherInfo").hide();
    $("#addInfo").hide();
    $("#playContent").show();
}

function showOrgin(e) {
    $(".subTabNameList div").removeClass("active");
    $(e).addClass("active");
    $("#orgin").show();
    $("#playMessage").hide();
    $("#ACARSMessage").hide();
}

function showplayMessage(e) {
    $(".subTabNameList div").removeClass("active");
    $(e).addClass("active");
    $("#orgin").hide();
    $("#playMessage").show();
    $("#ACARSMessage").hide();
}

function showACARSMessage(e) {
    $(".subTabNameList div").removeClass("active");
    $(e).addClass("active");
    $("#orgin").hide();
    $("#playMessage").hide();
    $("#ACARSMessage").show();
}

function LoginOut() {
    window.location = "login";
}

function SettingPage() {
    window.open("setting");
}

function SearchPage() {
    window.open("Search");
}

function PrintReport() {
    window.open("report");
}

function InsertPlayPage() {
    window.open("insertPlay");
}